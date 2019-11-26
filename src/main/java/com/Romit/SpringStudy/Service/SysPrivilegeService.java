package com.Romit.SpringStudy.Service;

import com.Romit.SpringStudy.entity.SysPrivilege;
public interface SysPrivilegeService{


    int deleteByPrimaryKey(Long id);

    int insert(SysPrivilege record);

    int insertSelective(SysPrivilege record);

    SysPrivilege selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysPrivilege record);

    int updateByPrimaryKey(SysPrivilege record);

}
