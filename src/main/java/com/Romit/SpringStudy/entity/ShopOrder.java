package com.Romit.SpringStudy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 李锐(Romit.Lee)
 * @date 2019/12/1 1:48
 */
@TableName(value = "sql_test.shop_order")
public class ShopOrder implements Serializable {
    @TableId(value = "order_id", type = IdType.AUTO)
    private Integer orderId;

    @TableField(value = "shop_id")
    private Integer shopId;

    //private SysUser sysUser;

//    public SysUser getSysUser() {
//        return sysUser;
//    }
//
//    public void setSysUser(SysUser sysUser) {
//        this.sysUser = sysUser;
//    }

    /**
     * 用户id
     */
    @TableField(value = "user_id")
    private Long userId;

    @TableField(value = "create_time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ORDER_ID = "order_id";

    public static final String COL_SHOP_ID = "shop_id";

    public static final String COL_USER_ID = "user_id";

    public static final String COL_CREATE_TIME = "create_time";

    /**
     * @return order_id
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * @return shop_id
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * @param shopId
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", shopId=").append(shopId);
        sb.append(", userId=").append(userId);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}