package com.Romit.SpringStudy.Controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.json.JSONObject;
import com.Romit.SpringStudy.Common.R;
import com.Romit.SpringStudy.Service.SysRoleService;
import com.Romit.SpringStudy.Service.SysUserService;
import com.Romit.SpringStudy.entity.SysRole;
import com.Romit.SpringStudy.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MainController {
   @Autowired
    private SysRoleService sysRoleService;

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/")
    @ResponseBody
    public Map<String,String> main(){
        Map<String,String> map=new HashMap<String,String>();
        map.put("key1","value1");
        map.put("key2","value2");
        return map;

    }


    @RequestMapping("/getSysUser")
    @ResponseBody
    public SysUser getPerson(Long id){

        return sysUserService.getById(id);
    }

    @RequestMapping("/insertSysUser")
    @ResponseBody
    public R insertSysUser(SysUser user){

        sysUserService.save(user);
        return R.ok();
    }

    @RequestMapping("/insertSysRole")
    @ResponseBody
    public R insertSysUser(SysRole user){
        user.setCreateTime(DateUtil.date());
        if(sysRoleService.save(user)){
            return R.ok();

        }
        else{
            return R.error("插入失败");

        }

    }

    @RequestMapping("/deleteSysUser")
    @ResponseBody
    public boolean deleteSysUser(Serializable id){

        return sysUserService.removeById(id);
    }

    @RequestMapping("/xx")
    @ResponseBody
    public JSONObject getXX(){

        JSONObject jsonObject=new JSONObject();
        ArrayList<String> stringArrayList=new ArrayList<>();

        stringArrayList.add("222");
        stringArrayList.add("333");
        stringArrayList.add("444");
        jsonObject.put("2",stringArrayList);
        jsonObject.put("1","a");

        //dataSource.getConnection();

        return jsonObject;

    }




}
