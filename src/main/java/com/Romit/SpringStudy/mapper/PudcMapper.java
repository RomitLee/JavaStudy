package com.Romit.SpringStudy.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.Romit.SpringStudy.entity.Pudc;

@Mapper
public interface PudcMapper {
    int deleteByPrimaryKey(Integer pudcId);

    int insert(Pudc record);

    int insertSelective(Pudc record);

    Pudc selectByPrimaryKey(Integer pudcId);

    int updateByPrimaryKeySelective(Pudc record);

    int updateByPrimaryKey(Pudc record);

    List<Pudc> findAllByPudcName(@Param("pudcName") String pudcName);

    int insertList(@Param("list") List<Pudc> list);

    Integer countByPudcNameAndPudcId(@Param("pudcName")String pudcName,@Param("pudcId")Integer pudcId);


    List<Pudc> selectAllByPudcName(@Param("pudcName")String pudcName);








}