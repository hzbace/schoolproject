package com.qfedu.entity.sudetail;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.qfedu.entity.base.BaseEntity;

import java.time.LocalDate;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author java1806
 * @since 2019-01-17
 */

public class SUdetail extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Integer dUid;

    private String dHeadimg;

    private String dTel;

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date dBirth;

    private Integer dSex;

    private String dSnum;

    private String dName;

    private String dSign;

    private Integer dPro;

    private String dHome;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getdUid() {
        return dUid;
    }

    public void setdUid(Integer dUid) {
        this.dUid = dUid;
    }

    public String getdHeadimg() {
        return dHeadimg;
    }

    public void setdHeadimg(String dHeadimg) {
        this.dHeadimg = dHeadimg;
    }

    public String getdTel() {
        return dTel;
    }

    public void setdTel(String dTel) {
        this.dTel = dTel;
    }

    public Date getdBirth() {
        return dBirth;
    }

    public void setdBirth(Date dBirth) {
        this.dBirth = dBirth;
    }

    public Integer getdSex() {
        return dSex;
    }

    public void setdSex(Integer dSex) {
        this.dSex = dSex;
    }

    public String getdSnum() {
        return dSnum;
    }

    public void setdSnum(String dSnum) {
        this.dSnum = dSnum;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getdSign() {
        return dSign;
    }

    public void setdSign(String dSign) {
        this.dSign = dSign;
    }

    public Integer getdPro() {
        return dPro;
    }

    public void setdPro(Integer dPro) {
        this.dPro = dPro;
    }

    public String getdHome() {
        return dHome;
    }

    public void setdHome(String dHome) {
        this.dHome = dHome;
    }

    @Override
    public String toString() {
        return "SUdetail{" +
                "dUid=" + dUid +
                ", dHeadimg='" + dHeadimg + '\'' +
                ", dTel='" + dTel + '\'' +
                ", dBirth=" + dBirth +
                ", dSex=" + dSex +
                ", dSnum='" + dSnum + '\'' +
                ", dName='" + dName + '\'' +
                ", dSign='" + dSign + '\'' +
                ", dPro=" + dPro +
                ", dHome='" + dHome + '\'' +
                '}';
    }
}
