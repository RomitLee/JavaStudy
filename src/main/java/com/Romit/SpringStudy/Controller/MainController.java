package com.Romit.SpringStudy.Controller;

import cn.hutool.core.util.XmlUtil;
import cn.hutool.json.JSONObject;
import com.Romit.SpringStudy.entity.Person;
import com.Romit.SpringStudy.Service.PersonService;
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

    @RequestMapping("/")
    @ResponseBody
    public Map<String,String> main(){
        Map<String,String> map=new HashMap<String,String>();
        map.put("key","value");
        return map;

    }


    @RequestMapping("/getP")
    @ResponseBody
    public Person getPerson(Integer id){

        return personService.getPerson(id);
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
