package com.Romit.SpringStudy.entity;

import com.Romit.SpringStudy.mapper.PudcMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public class Pudc implements Serializable {
    /**
     * pudcId
     */
    private Integer pudcId;

    /**
     * pudcName
     */
    private String pudcName;

    private static final long serialVersionUID = 1L;


    public Integer getPudcId() {
        return pudcId;
    }

    public void setPudcId(Integer pudcId) {
        this.pudcId = pudcId;
    }

    public String getPudcName() {
        return pudcName;
    }

    public void setPudcName(String pudcName) {
        this.pudcName = pudcName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pudcId=").append(pudcId);
        sb.append(", pudcName=").append(pudcName);
        sb.append("]");

        //ddd
        return sb.toString();
    }


}