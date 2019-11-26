package com.Romit.SpringStudy.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.Romit.SpringStudy.entity.SysRolePrivilege;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 李锐(Romit.Lee)
 * @date 2019/11/25 2:48
 */
@Mapper
public interface SysRolePrivilegeMapper {
    int insert(SysRolePrivilege record);

    int insertSelective(SysRolePrivilege record);

    int insertList(@Param("list")List<SysRolePrivilege> list);


}