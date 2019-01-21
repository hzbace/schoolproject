package com.qfedu.entity.smesdetail;


import com.qfedu.entity.base.BaseEntity;

/**
 * <p>
 * 
 * </p>
 *
 * @author java1806
 * @since 2019-01-17
 */

public class SMesdetail extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Integer mdMid;

    private String mdText;

    private Integer mdOuid;

    private Integer mdFlag;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getMdMid() {
        return mdMid;
    }

    public void setMdMid(Integer mdMid) {
        this.mdMid = mdMid;
    }

    public String getMdText() {
        return mdText;
    }

    public void setMdText(String mdText) {
        this.mdText = mdText;
    }

    public Integer getMdOuid() {
        return mdOuid;
    }

    public void setMdOuid(Integer mdOuid) {
        this.mdOuid = mdOuid;
    }

    public Integer getMdFlag() {
        return mdFlag;
    }

    public void setMdFlag(Integer mdFlag) {
        this.mdFlag = mdFlag;
    }
}
