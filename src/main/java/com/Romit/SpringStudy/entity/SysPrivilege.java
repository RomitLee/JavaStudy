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
@TableName(value = "sql_test.sys_privilege")
public class SysPrivilege implements Serializable {
    /**
     * 权限ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 权限名称
     */
    @TableField(value = "privilege_name")
    private String privilegeName;

    /**
     * 权限URL
     */
    @TableField(value = "privilege_uri")
    private String privilegeUri;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_PRIVILEGE_NAME = "privilege_name";

    public static final String COL_PRIVILEGE_URI = "privilege_uri";

    /**
     * 获取权限ID
     *
     * @return id - 权限ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置权限ID
     *
     * @param id 权限ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取权限名称
     *
     * @return privilege_name - 权限名称
     */
    public String getPrivilegeName() {
        return privilegeName;
    }

    /**
     * 设置权限名称
     *
     * @param privilegeName 权限名称
     */
    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }

    /**
     * 获取权限URL
     *
     * @return privilege_uri - 权限URL
     */
    public String getPrivilegeUri() {
        return privilegeUri;
    }

    /**
     * 设置权限URL
     *
     * @param privilegeUri 权限URL
     */
    public void setPrivilegeUri(String privilegeUri) {
        this.privilegeUri = privilegeUri;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", privilegeName=").append(privilegeName);
        sb.append(", privilegeUri=").append(privilegeUri);
        sb.append("]");
        return sb.toString();
    }
}