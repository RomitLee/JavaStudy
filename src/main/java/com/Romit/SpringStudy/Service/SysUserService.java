package com.Romit.SpringStudy.Service;

import com.Romit.SpringStudy.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;
    /**
 * @author 李锐(Romit.Lee)
 * @date 2019/12/1 0:34
 */
public interface SysUserService extends IService<SysUser>{
/**

 *@描述

 *@参数

 *@返回值

 *@创建人 李锐(Romit.Lee)

 *@创建时间 2019/12/6

 *@修改人和其它信息

 */
    public SysUser saveUser(SysUser entity);

    public SysUser getUser(long id);
}
