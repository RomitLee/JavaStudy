package com.Romit.Majong;

import cn.hutool.core.util.RandomUtil;
import com.Romit.SpringStudy.entity.SysUser;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.*;

/**
 * 此文件由 IntelliJ IDEA. 2019.3版本创建
 * \* 创建人: 李锐(Romit.Lee)
 * \* 创建日期: 2020/3/5
 * \* 创建时间: 19:04
 * \* 描述:
 * \
 */
public class MarkUtil {
    public static HashMap<Integer, String> getAllPaiKey() {
        HashMap<Integer, String> pai = new HashMap<>();
        pai.put(11, "一万");
        pai.put(12, "二万");
        pai.put(13, "三万");
        pai.put(14, "四万");
        pai.put(15, "五万");
        pai.put(16, "六万");
        pai.put(17, "七万");
        pai.put(18, "八万");
        pai.put(19, "九万");
        pai.put(21, "一筒");
        pai.put(22, "二筒");
        pai.put(23, "三筒");
        pai.put(24, "四筒");
        pai.put(25, "五筒");
        pai.put(26, "六筒");
        pai.put(27, "七筒");
        pai.put(28, "八筒");
        pai.put(29, "九筒");
        pai.put(31, "一条");
        pai.put(32, "二条");
        pai.put(33, "三条");
        pai.put(34, "四条");
        pai.put(35, "五条");
        pai.put(36, "六条");
        pai.put(37, "七条");
        pai.put(38, "八条");
        pai.put(39, "九条");
        pai.put(41, "东风");
        pai.put(43, "南风");
        pai.put(45, "西风");
        pai.put(47, "北风");
        pai.put(49, "白板");
        pai.put(51, "红中");
        pai.put(53, "发财");
        return pai;


    }

    public static final int[] Pai = {11, 11, 11, 11, 12, 12, 12, 12, 13, 13,
            13, 13, 14, 14, 14, 14, 15, 15, 15, 15, 16, 16, 16, 16, 17, 17,
            17, 17, 18, 18, 18, 18, 19, 19, 19, 19, 21, 21, 21, 21, 22, 22,
            22, 22, 23, 23, 23, 23, 24, 24, 24, 24, 25, 25, 25, 25, 26, 26,
            26, 26, 27, 27, 27, 27, 28, 28, 28, 28, 29, 29, 29, 29, 31, 31, 31, 31, 32, 32, 32,
            32, 33, 33, 33, 33, 34, 34, 34, 34, 35, 35, 35, 35, 36, 36, 36, 36, 37, 37, 37, 37
            , 38, 38, 38, 38, 39, 39, 39, 39, 41, 41, 41, 41, 43, 43, 43, 43, 45, 45, 45, 45, 47, 47, 47, 47, 49,
            49, 49, 49, 51, 51, 51, 51, 53, 53, 53, 53};

    public ArrayList<Integer> fapai(){
        ArrayList<Integer> newpai=new ArrayList<>();
        for (int a:Pai
             ) {
            newpai.add(a);

        }

        ArrayList<Integer> paiResult=new ArrayList<>();
        paiResult=(ArrayList<Integer>) RandomUtil.randomEles(newpai,14);
        return paiResult;

    }
    @Test
    public void test(){
        HashMap<Integer,String> map=getAllPaiKey();
        ArrayList<String> paihanzi=new ArrayList<>();
        ArrayList<Integer> pai=fapai();
        pai.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);

            }
        });
        for (Integer a:
           pai  ) {
            paihanzi.add(map.get(a));
        }
        System.out.println(paihanzi.toString());

    }
}
