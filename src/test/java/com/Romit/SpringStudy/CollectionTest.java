package com.Romit.SpringStudy;

import cn.hutool.core.collection.CollUtil;
import com.Romit.SpringStudy.entity.SysUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.Format;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 李锐(Romit.Lee)
 * @date 2019/12/7 0:08
 */


@SpringBootTest
public class CollectionTest {


    @Autowired
    private SysUser sysUser;
    /**

     *@描述 哈希的学习

     *@参数

     *@返回值

     *@创建人 李锐(Romit.Lee)

     *@创建时间 2019/12/7

     *@修改人和其它信息

     */
    @Test
    public void hashTest(){
        SysUser sysUser1=new SysUser();
        SysUser sysUser2=new SysUser();

        System.out.println("实例化的SysUser1的哈希值"+sysUser1.hashCode());
        System.out.println("实例化的SysUser2的哈希值"+sysUser2.hashCode());
        System.out.println("bean的SysUser的哈希值"+this.sysUser.hashCode());

    }

    @Test
    public void arrayListTest(){
        List<SysUser> sysUserList=new ArrayList<>();
        SysUser sysUser1=new SysUser();
        SysUser sysUser2=new SysUser();
        SysUser sysUser3=new SysUser();

        sysUserList.add(sysUser1);
        sysUserList.add(sysUser2);
        sysUserList.add(sysUser3);

        for (SysUser user:sysUserList) {
            System.out.println(user.toString());
        }

        System.out.printf("长度:"+sysUserList.size());


        CollUtil.join(sysUserList,"#");
    }
}
