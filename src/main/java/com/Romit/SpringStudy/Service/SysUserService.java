package com.Romit.SpringStudy.Service;

import com.Romit.SpringStudy.entity.SysUser;
    /**
 * @author 李锐(Romit.Lee)
 * @date 2019/11/25 2:44
 */
public interface SysUserService{


    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

}
