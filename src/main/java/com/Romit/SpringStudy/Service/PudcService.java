package com.Romit.SpringStudy.Service;

import com.Romit.SpringStudy.entity.Pudc;

import java.awt.*;

public interface PudcService {


    int deleteByPrimaryKey(Integer pudcId);

    int insert(Pudc record);

    int insertSelective(Pudc record);

    Pudc selectByPrimaryKey(Integer pudcId);

    int updateByPrimaryKeySelective(Pudc record);
    /**
    
     *@描述
    
     *@参数 
    
     *@返回值 
    
     *@创建人 李锐(Romit.Lee)
    
     *@创建时间 2019/11/25
    
     *@修改人和其它信息
    
     */
    /**

     *@描述

     *@参数 

     *@返回值

     *@创建人 李锐(Romit.Lee)

     *@创建时间 2019/11/25

     *@修改人和其它信息

     */
    int updateByPrimaryKey(Pudc record);



}

