package com.Romit.SpringStudy.Service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.Romit.SpringStudy.mapper.SysPrivilegeMapper;
import com.Romit.SpringStudy.entity.SysPrivilege;
import com.Romit.SpringStudy.Service.SysPrivilegeService;
@Service
public class SysPrivilegeServiceImpl implements SysPrivilegeService{

    @Resource
    private SysPrivilegeMapper sysPrivilegeMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return sysPrivilegeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysPrivilege record) {
        return sysPrivilegeMapper.insert(record);
    }

    @Override
    public int insertSelective(SysPrivilege record) {
        return sysPrivilegeMapper.insertSelective(record);
    }

    @Override
    public SysPrivilege selectByPrimaryKey(Long id) {
        return sysPrivilegeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysPrivilege record) {
        return sysPrivilegeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysPrivilege record) {
        return sysPrivilegeMapper.updateByPrimaryKey(record);
    }

}
