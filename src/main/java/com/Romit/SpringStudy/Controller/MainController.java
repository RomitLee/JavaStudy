package com.Romit.SpringStudy.Controller;

import cn.hutool.core.util.XmlUtil;
import cn.hutool.json.JSONObject;
import com.Romit.SpringStudy.Service.SysUserService;
import com.Romit.SpringStudy.Service.SysUserServiceImpl;
import com.Romit.SpringStudy.entity.Person;
import com.Romit.SpringStudy.Service.PersonService;
import com.Romit.SpringStudy.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MainController {
    @Autowired
    private PersonService personService;
    private DataSource dataSource;

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/")
    @ResponseBody
    public Map<String,String> main(){
        Map<String,String> map=new HashMap<String,String>();
        map.put("key","value");
        return map;

    }


    @RequestMapping("/getSysUser")
    @ResponseBody
    public SysUser getPerson(Long id){

        return sysUserService.selectByPrimaryKey(id);
    }

    @RequestMapping("/insertSysUser")
    @ResponseBody
    public int insertSysUser(SysUser user){

        return sysUserService.insert(user);
    }

    @RequestMapping("/deleteSysUser")
    @ResponseBody
    public int deleteSysUser(Long id){

        return sysUserService.deleteByPrimaryKey(id);
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
