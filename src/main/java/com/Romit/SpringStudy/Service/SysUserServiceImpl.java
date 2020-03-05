package com.Romit.SpringStudy.Service;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.Romit.SpringStudy.entity.SysUser;
import com.Romit.SpringStudy.mapper.SysUserMapper;
import com.Romit.SpringStudy.Service.SysUserService;
/**
 * @author 李锐(Romit.Lee)
 * @date 2019/12/1 0:34
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService{
    @Override
    @CachePut(value = "redisCahce",key = "'redis_user_'+#result.id")
    public SysUser saveUser(SysUser entity) {
        //不做sql存储操作，单纯返回一个sysUser提供给@chacheable 用作redis缓存

        //entity.setCreateTime(Date date);
        return entity;

    }

    @Override
    @Cacheable(value = "redisCahce",key = "'redis_user_'+#id")
    public SysUser getUser(long id) {
        return this.getById(id);
    }
}
