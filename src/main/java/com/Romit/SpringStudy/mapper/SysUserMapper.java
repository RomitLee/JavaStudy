package com.Romit.SpringStudy.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.Romit.SpringStudy.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 李锐(Romit.Lee)
 * @date 2019/11/25 2:44
 */
@Mapper
public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    int insertList(@Param("list")List<SysUser> list);


}