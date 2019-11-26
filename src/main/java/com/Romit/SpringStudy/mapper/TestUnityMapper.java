package com.Romit.SpringStudy.mapper;

import org.apache.ibatis.annotations.Param;

import com.Romit.SpringStudy.entity.TestUnity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestUnityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestUnity record);

    int insertSelective(@Param("record") TestUnity record, @Param("name") String name, @Param("creatTime") String creatTime);

    TestUnity selectByPrimaryKey(@Param("id") Integer id);

    int updateByPrimaryKeySelective(TestUnity record);

    int updateByPrimaryKey(TestUnity record);

    int deleteById(@Param("id") Integer id);


}