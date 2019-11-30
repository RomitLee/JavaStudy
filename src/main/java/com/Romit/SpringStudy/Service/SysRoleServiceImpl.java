package com.Romit.SpringStudy.Service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.Romit.SpringStudy.mapper.SysRoleMapper;
import com.Romit.SpringStudy.entity.SysRole;
import com.Romit.SpringStudy.Service.SysRoleService;
/**
 * @author 李锐(Romit.Lee)
 * @date 2019/12/1 0:34
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService{

}
