package com.Romit.SpringStudy.mapper;

import com.Romit.SpringStudy.entity.SysPrivilege;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysPrivilegeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysPrivilege record);

    int insertSelective(SysPrivilege record);

    SysPrivilege selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysPrivilege record);

    int updateByPrimaryKey(SysPrivilege record);
}