package com.qfedu.entity.sblogcontent;

import com.qfedu.entity.base.BaseEntity;


/**
 * <p>
 * 
 * </p>
 *
 * @author java1806
 * @since 2019-01-22
 */

public class SBlogcontent extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String blcContent;

    private Integer blcBid;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getBlcContent() {
        return blcContent;
    }

    public void setBlcContent(String blcContent) {
        this.blcContent = blcContent;
    }

    public Integer getBlcBid() {
        return blcBid;
    }

    public void setBlcBid(Integer blcBid) {
        this.blcBid = blcBid;
    }
}
