package com.qfedu.entity.smessage;

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
 * @since 2019-01-17
 */

public class SMessage extends BaseEntity {

    private static final long serialVersionUID = 1L;


    private Integer mId;

    private Integer mUid;

    private Integer mType;

    private String mHead;

    private Integer mFlag;

    private LocalDateTime mTime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Integer getmUid() {
        return mUid;
    }

    public void setmUid(Integer mUid) {
        this.mUid = mUid;
    }

    public Integer getmType() {
        return mType;
    }

    public void setmType(Integer mType) {
        this.mType = mType;
    }

    public String getmHead() {
        return mHead;
    }

    public void setmHead(String mHead) {
        this.mHead = mHead;
    }

    public Integer getmFlag() {
        return mFlag;
    }

    public void setmFlag(Integer mFlag) {
        this.mFlag = mFlag;
    }

    public LocalDateTime getmTime() {
        return mTime;
    }

    public void setmTime(LocalDateTime mTime) {
        this.mTime = mTime;
    }
}
