package com.qfedu.entity.sclass;

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

public class SClass extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cl_id", type = IdType.AUTO)
    private Integer clId;

    private Integer clMjid;

    private String clName;

    private Integer clFlag;

    private Integer clGrade;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getClId() {
        return clId;
    }

    public void setClId(Integer clId) {
        this.clId = clId;
    }

    public Integer getClMjid() {
        return clMjid;
    }

    public void setClMjid(Integer clMjid) {
        this.clMjid = clMjid;
    }

    public String getClName() {
        return clName;
    }

    public void setClName(String clName) {
        this.clName = clName;
    }

    public Integer getClFlag() {
        return clFlag;
    }

    public void setClFlag(Integer clFlag) {
        this.clFlag = clFlag;
    }

    public Integer getClGrade() {
        return clGrade;
    }

    public void setClGrade(Integer clGrade) {
        this.clGrade = clGrade;
    }
}
