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
 * @since 2019-01-24
 */

public class SFriend extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "f_id", type = IdType.AUTO)
    private Integer fId;

    private Integer fUid;

    private Integer fFuid;

    private Integer fFlag;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public Integer getfUid() {
        return fUid;
    }

    public void setfUid(Integer fUid) {
        this.fUid = fUid;
    }

    public Integer getfFuid() {
        return fFuid;
    }

    public void setfFuid(Integer fFuid) {
        this.fFuid = fFuid;
    }

    public Integer getfFlag() {
        return fFlag;
    }

    public void setfFlag(Integer fFlag) {
        this.fFlag = fFlag;
    }
}
