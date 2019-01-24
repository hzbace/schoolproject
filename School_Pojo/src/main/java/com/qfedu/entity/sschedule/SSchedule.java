package com.qfedu.entity.sschedule;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.qfedu.entity.base.BaseEntity;

import java.io.Serializable;


/**
 * <p>
 * 
 * </p>
 *
 * @author java1806
 * @since 2019-01-21
 */

public class SSchedule extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "sd_id", type = IdType.AUTO)
    private Integer sdId;

    private Integer sdMjid;

    private Integer sdNoon;

    private Integer sdDay;

    private String sdSubject;

    private Integer sdFlag;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getSdId() {
        return sdId;
    }

    public void setSdId(Integer sdId) {
        this.sdId = sdId;
    }

    public Integer getSdMjid() {
        return sdMjid;
    }

    public void setSdMjid(Integer sdMjid) {
        this.sdMjid = sdMjid;
    }

    public Integer getSdNoon() {
        return sdNoon;
    }

    public void setSdNoon(Integer sdNoon) {
        this.sdNoon = sdNoon;
    }

    public Integer getSdDay() {
        return sdDay;
    }

    public void setSdDay(Integer sdDay) {
        this.sdDay = sdDay;
    }

    public String getSdSubject() {
        return sdSubject;
    }

    public void setSdSubject(String sdSubject) {
        this.sdSubject = sdSubject;
    }

    public Integer getSdFlag() {
        return sdFlag;
    }

    public void setSdFlag(Integer sdFlag) {
        this.sdFlag = sdFlag;
    }
}
