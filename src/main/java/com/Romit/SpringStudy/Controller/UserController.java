package com.Romit.SpringStudy.Controller;

import com.Romit.SpringStudy.entity.SysUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {


//    @Autowired
//    DataSource dataSource;



    @RequestMapping("/")
    @ResponseBody
    public SysUser SetUser(){
        System.out.println("进入setUser");


        SysUser user=new SysUser();
        user.setUserName("lirui");


//        userService.printUser(user);
        return user;

    }

//    @RequestMapping("/restHello")
//    @ResponseBody
//    public Object restHello() throws Exception {
//        Connection connect = dataSource.getConnection();
//        PreparedStatement pre = connect.prepareStatement("select * from organization_name");
//        ResultSet result = pre.executeQuery();
//        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
//        while (result.next()) {
//            Map<String,Object> map = new HashMap<String, Object>();
//            map.put("id", result.getObject("id"));
//            map.put("organization_name", result.getObject("organization_name"));
//            map.put("parent_id", result.getObject("parent_id"));
//            map.put("organization_type", result.getObject("organization_type"));
//            list.add(map);
//        }
//        if(result!= null ) result.close();
//        if(pre!= null ) pre.close();
//        if(connect!= null ) connect.close();
//        return list;

    //INSERT INTO sql_test.table_name1 (column_1, column_2) VALUES (4, 'romit');
//    }

}
