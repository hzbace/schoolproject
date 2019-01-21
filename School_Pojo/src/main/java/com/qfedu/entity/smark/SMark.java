package com.qfedu.entity.smark;

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

public class SMark extends BaseEntity {

    private static final long serialVersionUID = 1L;


    private Integer mkUid;

    private Integer mkCid;

    private Integer mkScore;

    private String mkName;

    private Integer mkGradeid;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getMkUid() {
        return mkUid;
    }

    public void setMkUid(Integer mkUid) {
        this.mkUid = mkUid;
    }

    public Integer getMkCid() {
        return mkCid;
    }

    public void setMkCid(Integer mkCid) {
        this.mkCid = mkCid;
    }

    public Integer getMkScore() {
        return mkScore;
    }

    public void setMkScore(Integer mkScore) {
        this.mkScore = mkScore;
    }

    public String getMkName() {
        return mkName;
    }

    public void setMkName(String mkName) {
        this.mkName = mkName;
    }

    public Integer getMkGradeid() {
        return mkGradeid;
    }

    public void setMkGradeid(Integer mkGradeid) {
        this.mkGradeid = mkGradeid;
    }
}
