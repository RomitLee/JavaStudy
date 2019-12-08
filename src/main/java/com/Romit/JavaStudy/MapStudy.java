package com.Romit.JavaStudy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 此文件由 IntelliJ IDEA. 2019.3版本创建
 * \* 创建人: 李锐(Romit.Lee)
 * \* 创建日期: 2019/12/9
 * \* 创建时间: 1:27
 * \* 描述:
 * \
 */

@SpringBootTest
public class MapStudy {

    @Test
    public void hashmapTest(){
        Map<String,String> stringMap=new HashMap<>();
        stringMap.put("1","123");
        stringMap.put("2","234");
        stringMap.put("3","345");


        for (String s :
                stringMap.keySet()) {
            System.out.println(s+":"+stringMap.get(s));
        }

        System.out.println("entry的迭代方式：");
        for (HashMap.Entry entry :
                stringMap.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        System.out.println("iterator的迭代方式：");

        Set<String> set=stringMap.keySet();
        Iterator<String> iterator= set.iterator();
        while (iterator.hasNext()){
            String s=iterator.next();
            System.out.println(s+":"+stringMap.get(s));

        }


    }
}
