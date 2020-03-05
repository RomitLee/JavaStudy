package com.Romit.JavaStudy;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.Dict;
import com.Romit.SpringStudy.entity.SysUser;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;

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


public class MapStudy {

    @Autowired
    private SysUser sysUser;

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

    @Test
    public void beanTest(){
        Map<String, Object> jiba= BeanUtil.beanToMap(sysUser);

        for (HashMap.Entry entry :
                jiba.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }

    @Test
    public void  dictTest(){
        Dict dict=new Dict();


    }
}
