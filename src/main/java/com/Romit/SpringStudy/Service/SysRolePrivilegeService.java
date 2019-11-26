package com.Romit.SpringStudy.Service;
import java.util.List;

import com.Romit.SpringStudy.entity.SysRolePrivilege;
    /**
 * @author 李锐(Romit.Lee)
 * @date 2019/11/25 2:48
 */
public interface SysRolePrivilegeService{


    int insert(SysRolePrivilege record);

    int insertSelective(SysRolePrivilege record);



	int insertList(List<SysRolePrivilege> list);


}
