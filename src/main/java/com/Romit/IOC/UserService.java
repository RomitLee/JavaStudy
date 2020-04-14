package com.Romit.IOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 此文件由 IntelliJ IDEA. 2019.3版本创建
 * \* 创建人: 李锐(Romit.Lee)
 * \* 创建日期: 2020/3/24
 * \* 创建时间: 21:53
 * \* 描述:
 * \
 */
@Component
public class UserService {

    @Autowired
    IndexService indexService;

    public UserService() {
        System.out.println("____________________________-ni");
    }

    public void getService(){
        System.out.println(indexService);
        System.out.println("____________________________-ni");

    }
}
