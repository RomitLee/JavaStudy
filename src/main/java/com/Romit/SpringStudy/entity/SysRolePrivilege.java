package com.Romit.SpringStudy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * @author 李锐(Romit.Lee)
 * @date 2019/12/6 0:44
 */
@TableName(value = "sql_test.sys_role_privilege")
public class SysRolePrivilege implements Serializable {
    @TableId(value = "role_privilege_id", type = IdType.AUTO)
    private Long rolePrivilegeId;

    /**
     * 权限ID
     */
    @TableField(value = "privilege")
    private Long privilege;

    /**
     * 角色ID
     */
    @TableField(value = "role_id")
    private Long roleId;

    private static final long serialVersionUID = 1L;

    public static final String COL_ROLE_PRIVILEGE_ID = "role_privilege_id";

    public static final String COL_PRIVILEGE = "privilege";

    public static final String COL_ROLE_ID = "role_id";

    /**
     * @return role_privilege_id
     */
    public Long getRolePrivilegeId() {
        return rolePrivilegeId;
    }

    /**
     * @param rolePrivilegeId
     */
    public void setRolePrivilegeId(Long rolePrivilegeId) {
        this.rolePrivilegeId = rolePrivilegeId;
    }

    /**
     * 获取权限ID
     *
     * @return privilege - 权限ID
     */
    public Long getPrivilege() {
        return privilege;
    }

    /**
     * 设置权限ID
     *
     * @param privilege 权限ID
     */
    public void setPrivilege(Long privilege) {
        this.privilege = privilege;
    }

    /**
     * 获取角色ID
     *
     * @return role_id - 角色ID
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置角色ID
     *
     * @param roleId 角色ID
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rolePrivilegeId=").append(rolePrivilegeId);
        sb.append(", privilege=").append(privilege);
        sb.append(", roleId=").append(roleId);
        sb.append("]");
        return sb.toString();
    }
}