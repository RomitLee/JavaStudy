package com.Romit.JavaStudy;

import com.Romit.JavaStudy.MutilIterator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 此文件由 IntelliJ IDEA. 2019.3版本创建
 * \* 创建人: 李锐(Romit.Lee)
 * \* 创建日期: 2019/12/7
 * \* 创建时间: 1:59
 * \* 描述:Iterable接口和的学习
 * \
 */
@SpringBootTest
public class IterableStudy  {

    /*
    任何实现了iterable接口的类 都可以进行forech进行遍历
    for (Integer i:list) {
            System.out.println(i);
        }

    */

    @Test
    public void iteratorTest(){
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(12);
        list.add(8);
        list.add(4);

        Iterator<Integer> iterator=list.iterator();  //获取ArrayList内部迭代器
        while(iterator.hasNext()){                   //hasNext()方法判断是否还有元素
            System.out.println(iterator.next());     //next()返回当前元素,并且将指针移向下个元素
        }

    }

    /**

     *@描述 深度讲述Iterable接口和Iterator接口的区别

     *@参数

     *@返回值

     *@创建人 李锐(Romit.Lee)

     *@创建时间 2019/12/7

     *@修改人和其它信息

     */
    @Test
    public void mutilleratorTest(){
        MutilIterator mi = new MutilIterator();
        //默认的迭代器

        for (String String : mi) {
            System.out.print(String + " ");
        }

        System.out.println();
        //反向迭代器
        for (String String : mi.reverseIterator()) {
            System.out.print(String + " ");
        }


        System.out.println();
        //随机迭代器
        for (String String : mi.randomized()) {
                System.out.print(String + " ");
        }

        System.out.println("");

        LinkedList<String> linkedList=new LinkedList<>();
        Iterator<String> iterator1= linkedList.listIterator();
        System.out.println(iterator1);
        Iterator<String> iterator2=linkedList.descendingIterator();
        System.out.println(iterator2);
        Iterator<String> iterator3=linkedList.iterator();
        System.out.println(iterator3);

    }


}
