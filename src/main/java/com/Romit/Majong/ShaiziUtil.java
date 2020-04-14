package com.Romit.Majong;

import cn.hutool.core.util.RandomUtil;
import org.testng.annotations.Test;

/**
 * 此文件由 IntelliJ IDEA. 2019.3版本创建
 * \* 创建人: 李锐(Romit.Lee)
 * \* 创建日期: 2020/3/5
 * \* 创建时间: 20:21
 * \* 描述:
 * \
 */
public class ShaiziUtil {
    public static final  int[] shaiA={1,2,3,4,5,6};

    public static final  int[] shaiB={1,2,3,4,5,6};

    public int[] randomSha(){

        int a= RandomUtil.randomInt(1,7);
        int b= RandomUtil.randomInt(1,7);
        int[] shai={a,b};
        return shai;

    }
    @Test
    public void test(){
        int[]sha=randomSha();
        System.out.println("随机筛子："+sha[0]+"   "+sha[1]);

    }

}


