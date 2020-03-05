package com.Romit.SpringStudy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;


 /** 此文件由 IntelliJ IDEA. 2019.3版本创建
 \* 创建人: 李锐(Romit.Lee)
 \* 创建日期: 2020/3/5 
 \* 创建时间: 15:18
 \* 描述: 
 \*/
@TableName(value = "mhxy_web.admin_account")
public class AdminAccount implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    /**
     * 账户
     */
    @TableField(value = "account")
    private String account;

    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 创建时间
     */
    @TableField(value = "creattime")
    private Date creattime;

    /**
     * 修改时间
     */
    @TableField(value = "updatatime")
    private Date updatatime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_ACCOUNT = "account";

    public static final String COL_PASSWORD = "password";

    public static final String COL_CREATTIME = "creattime";

    public static final String COL_UPDATATIME = "updatatime";

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取账户
     *
     * @return account - 账户
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置账户
     *
     * @param account 账户
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取创建时间
     *
     * @return creattime - 创建时间
     */
    public Date getCreattime() {
        return creattime;
    }

    /**
     * 设置创建时间
     *
     * @param creattime 创建时间
     */
    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    /**
     * 获取修改时间
     *
     * @return updatatime - 修改时间
     */
    public Date getUpdatatime() {
        return updatatime;
    }

    /**
     * 设置修改时间
     *
     * @param updatatime 修改时间
     */
    public void setUpdatatime(Date updatatime) {
        this.updatatime = updatatime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account=").append(account);
        sb.append(", password=").append(password);
        sb.append(", creattime=").append(creattime);
        sb.append(", updatatime=").append(updatatime);
        sb.append("]");
        return sb.toString();
    }
}