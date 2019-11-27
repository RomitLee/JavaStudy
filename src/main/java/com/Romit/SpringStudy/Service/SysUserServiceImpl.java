package com.Romit.SpringStudy.Service;
import java.util.List;

import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.Romit.SpringStudy.entity.SysUser;
import com.Romit.SpringStudy.mapper.SysUserMapper;
import com.Romit.SpringStudy.Service.SysUserService;
/**
 * @author 李锐(Romit.Lee)
 * @date 2019/11/25 2:44
 */
@Service
public class SysUserServiceImpl extends ServiceImpl implements SysUserService{

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return sysUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysUser record) {
        record.setCreateTime(DateUtil.date());

        System.out.println(DateUtil.date());
        return sysUserMapper.insert(record);
    }

    @Override
    public int insertSelective(SysUser record) {
        return sysUserMapper.insertSelective(record);
    }

    @Override
    public SysUser selectByPrimaryKey(Long id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysUser record) {
        return sysUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysUser record) {
        return sysUserMapper.updateByPrimaryKey(record);
    }


    public int insertList(List<SysUser> list) {
        return sysUserMapper.insertList(list);
    }
}
