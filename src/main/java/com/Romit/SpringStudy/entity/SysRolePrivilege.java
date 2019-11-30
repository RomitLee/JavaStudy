package com.Romit.SpringStudy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * @author 李锐(Romit.Lee)
 * @date 2019/12/1 0:34
 */
@TableName(value = "sql_test.sys_role_privilege")
public class SysRolePrivilege implements Serializable {
    /**
     * 角色ID
     */
    @TableField(value = "role_id")
    private Long roleId;

    /**
     * 权限ID
     */
    @TableField(value = "privilege")
    private Long privilege;

    private static final long serialVersionUID = 1L;

    public static final String COL_ROLE_ID = "role_id";

    public static final String COL_PRIVILEGE = "privilege";

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", privilege=").append(privilege);
        sb.append("]");
        return sb.toString();
    }
}