package com.Romit.SpringStudy;

import cn.hutool.core.util.ClassUtil;
import com.Romit.SpringStudy.entity.SysUser;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.sql.DataSource;


@SpringBootTest
public class AOPTest extends AbstractJUnit4SpringContextTests {

//    @Autowired
//    protected ApplicationContext ctx;


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private SysUser sysUser;



    /**
     * 详情描述:
     *
     * @param
     * @return void
     */
    //@Test
    public void aspectTest(){

//        UserServiceImpl userService= (UserServiceImpl) applicationContext.getBean("us1");
//        System.out.println("nihao");
//        //User user=new User("lirui","3333");
//
//
//
//        userService.printUser(user);
    }

    /**
     * 详情描述:
     *
     * @param
     * @return void
     */
    //@Test
    public void dataBaseTest(){
        DataSource dataSource=applicationContext.getBean(DataSource.class);
        System.out.println("开始查询");
        System.out.println(dataSource.getClass().getName());


        String sql = "insert into table_name1(column_1,column_2) " +
                "values(?,?)";



        int result= (int) jdbcTemplate.update(sql, 7,"dsb");
        System.out.println(result);
        //INSERT INTO sql_test.table_name1 (column_1, column_2) VALUES (4, 'romit');
    }

    /**
     * description:
     *
     * @param
     * @return void
     */

    /**
     * 详情描述:
     *
     * @param
     * @return void
     */
    @Test
    public void mybatisTest(){
       String pudcClassName= ClassUtil.getPackage(SysUser.class);
       System.out.println("~~~~~~~~~~~~~~~~"+pudcClassName);


    }


}
