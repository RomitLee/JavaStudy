package com.Romit.SpringStudy.Controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.digest.DigestUtil;
import com.Romit.SpringStudy.Common.R;
import com.Romit.SpringStudy.Service.AdminAccountService;
import com.Romit.SpringStudy.Utils.JwtUtils;
import com.Romit.SpringStudy.entity.AdminAccount;
import com.Romit.SpringStudy.redis.RedisUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 此文件由 IntelliJ IDEA. 2019.3版本创建
 * \* 创建人: 李锐(Romit.Lee)
 * \* 创建日期: 2020/3/5
 * \* 创建时间: 15:20
 * \* 描述:
 * \
 */
@RestController
@RequestMapping("/admin/account")
public class AdminController {
    @Autowired
    private AdminAccountService adminAccountService;

    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    JwtUtils jwtUtils;


    @Autowired
    RedisUtil redisUtil;



    /**
    
     *@描述
    
     *@参数 
    
     *@返回值 
    
     *@创建人 李锐(Romit.Lee)
    
     *@创建时间 2020/3/5
    
     *@修改人和其它信息
    
     */

    @PutMapping("/register")
    @ResponseBody
    public R register(AdminAccount adminAccount){



        if(adminAccount.getAccount()!=null){
            QueryWrapper<AdminAccount> queryWrapper=new QueryWrapper<>();

            AdminAccount oldAccount=adminAccountService.getOne(queryWrapper.eq("account",adminAccount.getAccount()));
            if(oldAccount!=null){
                return R.error("账号已存在");

            }




        }
        else {
            return R.error("请输入账号");

        }
        if(adminAccount.getPassword()!=null){

            adminAccount.setPassword(DigestUtil.md5Hex(adminAccount.getPassword()));

        }
        else {
            return R.error("密码不能为空");

        }



        adminAccount.setId(IdUtil.randomUUID().toString());
        adminAccount.setCreattime(DateUtil.date());
        adminAccount.setUpdatatime(DateUtil.date());
        if(adminAccountService.save(adminAccount)) {
            Map<String,String> map=new HashMap<>();


            redisUtil.set(adminAccount.getAccount(),adminAccount);

            return R.ok("注册成功", map);


        }
        else {
            return R.error("错误");
        }


    }


    @PostMapping("/login")
    @ResponseBody
    public R login(AdminAccount loginAccount, HttpServletRequest request, HttpServletResponse response) {
        QueryWrapper<AdminAccount> queryWrapper=new QueryWrapper<>();
        AdminAccount serviceAccount=adminAccountService.getOne(queryWrapper.eq("account",loginAccount.getAccount()));
        HashMap<String, String> tokenMap = new HashMap<>();
        //用户存且密码正确在则颁发token
        if (null != serviceAccount && serviceAccount.getPassword().equals(DigestUtil.md5Hex(loginAccount.getPassword()))) {
            if (!StrUtil.isEmpty(serviceAccount.getPassword())) {
                response.setHeader("token", jwtUtils.generateToken(serviceAccount.getId()));
                tokenMap.put("token", jwtUtils.generateToken(serviceAccount.getId()));

                tokenMap.put("nickname",serviceAccount.getNickname());

                return R.ok("登录成功",tokenMap);
            }
            return R.error("不存在此用户");
        } else {
            return R.error("不存在此用户");
        }

    }


    //查看个人信息
    @GetMapping("/info")
    @ResponseBody
    public R info(AdminAccount adminAccount, HttpServletRequest httpServletRequest){
        String token = httpServletRequest.getHeader("token");
        System.out.println("token====="+token);
        mongoTemplate.save(adminAccount);
        return R.ok("测试正确",adminAccount);

    }


    @GetMapping("/test")
    @ResponseBody
    public R test(AdminAccount adminAccount, HttpServletRequest httpServletRequest){
        String token = httpServletRequest.getHeader("token");
        System.out.println("token====="+token);
        mongoTemplate.save(adminAccount);
        return R.ok("测试正确",adminAccount);

    }

    @GetMapping("/error")
    @ResponseBody
    public R errer(){

        return R.error("测试错误的接口，此接口没有token验证");

    }
}
