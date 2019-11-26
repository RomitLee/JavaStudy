package com.Romit.SpringStudy.entity;

import java.io.Serializable;

/**
 * @author 李锐(Romit.Lee)
 * @date 2019/11/25 2:48
 */
public class SysRolePrivilege implements Serializable {
    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 权限ID
     */
    private Long privilege;

    private static final long serialVersionUID = 1L;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPrivilege() {
        return privilege;
    }

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