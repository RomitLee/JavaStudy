package com.Romit.SpringStudy.Service;
import java.util.List;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.Romit.SpringStudy.mapper.SysRolePrivilegeMapper;
import com.Romit.SpringStudy.entity.SysRolePrivilege;
import com.Romit.SpringStudy.Service.SysRolePrivilegeService;
/**
 * @author 李锐(Romit.Lee)
 * @date 2019/11/25 2:48
 */
@Service
public class SysRolePrivilegeServiceImpl implements SysRolePrivilegeService{

    @Resource
    private SysRolePrivilegeMapper sysRolePrivilegeMapper;

    @Override
    public int insert(SysRolePrivilege record) {
        return sysRolePrivilegeMapper.insert(record);
    }

    @Override
    public int insertSelective(SysRolePrivilege record) {
        return sysRolePrivilegeMapper.insertSelective(record);
    }

	@Override
	public int insertList(List<SysRolePrivilege> list){
		 return sysRolePrivilegeMapper.insertList(list);
	}




}
