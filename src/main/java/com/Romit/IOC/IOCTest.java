package com.Romit.IOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;

/**
 * 此文件由 IntelliJ IDEA. 2019.3版本创建
 * \* 创建人: 李锐(Romit.Lee)
 * \* 创建日期: 2020/3/24
 * \* 创建时间: 21:55
 * \* 描述:
 * \
 */
@Test
public class IOCTest {
    @Autowired
    UserService userService;
    public static void main(String[] args) {


		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(IOCCofig.class);

		ac.getBean(UserService.class).getService();
    }



    public void setUserService(UserService userService) {

    }
}
