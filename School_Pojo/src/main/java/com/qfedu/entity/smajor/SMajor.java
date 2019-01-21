package com.qfedu.entity.smajor;

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

public class SMajor extends BaseEntity {

    private static final long serialVersionUID = 1L;


    private Integer mjId;

    private String mjName;

    private Integer mjFlag;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getMjId() {
        return mjId;
    }

    public void setMjId(Integer mjId) {
        this.mjId = mjId;
    }

    public String getMjName() {
        return mjName;
    }

    public void setMjName(String mjName) {
        this.mjName = mjName;
    }

    public Integer getMjFlag() {
        return mjFlag;
    }

    public void setMjFlag(Integer mjFlag) {
        this.mjFlag = mjFlag;
    }
}
