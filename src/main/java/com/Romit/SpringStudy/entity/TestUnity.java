package com.Romit.SpringStudy.entity;

import java.io.Serializable;
import java.util.Date;

public class TestUnity implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * name
     */
    private String name;

    /**
     * creatTime
     */
    private Date creatTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", creatTime=").append(creatTime);
        sb.append("]");
        return sb.toString();
    }
}