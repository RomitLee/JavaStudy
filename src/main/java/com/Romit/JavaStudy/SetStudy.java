package com.Romit.JavaStudy;


import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.data.redis.connection.DataType;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.support.collections.RedisSet;
import org.testng.annotations.Test;


import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * 此文件由 IntelliJ IDEA. 2019.3版本创建
 * \* 创建人: 李锐(Romit.Lee)
 * \* 创建日期: 2019/12/9
 * \* 创建时间: 1:41
 * \* 描述:
 * \
 */
@SpringBootTest
public class SetStudy {

    @Test
    public void setTest(){
        Set<String> stringSet=new HashSet<>();
        stringSet.add("1");
        stringSet.add("2");
        stringSet.add("3");
        stringSet.add("5");
        stringSet.add("2");

        for (String s :
                stringSet) {
            System.out.println(s);
        }



    }
}
