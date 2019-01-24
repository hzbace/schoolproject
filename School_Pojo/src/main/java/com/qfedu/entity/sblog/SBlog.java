package com.qfedu.entity.sblog;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.qfedu.entity.base.BaseEntity;


import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author java1806
 * @since 2019-01-22
 */

public class SBlog extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "bl_id", type = IdType.AUTO)
    private Integer blId;

    private Integer blStyle;

    private Integer blSharenum;

    private Integer blCommentnum;

    private String blItem;

    private Integer blUid;

    private LocalDateTime blCreatetime;

    private Integer blFlag;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getBlId() {
        return blId;
    }

    public void setBlId(Integer blId) {
        this.blId = blId;
    }

    public Integer getBlStyle() {
        return blStyle;
    }

    public void setBlStyle(Integer blStyle) {
        this.blStyle = blStyle;
    }

    public Integer getBlSharenum() {
        return blSharenum;
    }

    public void setBlSharenum(Integer blSharenum) {
        this.blSharenum = blSharenum;
    }

    public Integer getBlCommentnum() {
        return blCommentnum;
    }

    public void setBlCommentnum(Integer blCommentnum) {
        this.blCommentnum = blCommentnum;
    }

    public String getBlItem() {
        return blItem;
    }

    public void setBlItem(String blItem) {
        this.blItem = blItem;
    }

    public Integer getBlUid() {
        return blUid;
    }

    public void setBlUid(Integer blUid) {
        this.blUid = blUid;
    }

    public LocalDateTime getBlCreatetime() {
        return blCreatetime;
    }

    public void setBlCreatetime(LocalDateTime blCreatetime) {
        this.blCreatetime = blCreatetime;
    }

    public Integer getBlFlag() {
        return blFlag;
    }

    public void setBlFlag(Integer blFlag) {
        this.blFlag = blFlag;
    }
}
