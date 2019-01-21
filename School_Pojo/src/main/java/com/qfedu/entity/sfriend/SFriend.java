package com.qfedu.entity.sfriend;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.qfedu.entity.base.BaseEntity;

/**
 * <p>
 * 
 * </p>
 *
 * @author java1806
 * @since 2019-01-17
 */

public class SFriend extends BaseEntity {

    private static final long serialVersionUID = 1L;


    private Integer fUid;

    private Integer fOuid;

    private Integer fFlag;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getfUid() {
        return fUid;
    }

    public void setfUid(Integer fUid) {
        this.fUid = fUid;
    }

    public Integer getfOuid() {
        return fOuid;
    }

    public void setfOuid(Integer fOuid) {
        this.fOuid = fOuid;
    }

    public Integer getfFlag() {
        return fFlag;
    }

    public void setfFlag(Integer fFlag) {
        this.fFlag = fFlag;
    }
}
