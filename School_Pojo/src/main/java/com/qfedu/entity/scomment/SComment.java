package com.qfedu.entity.scomment;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.qfedu.entity.base.BaseEntity;

/**
 * <p>
 * 
 * </p>
 *
 * @author java1806
 * @since 2019-01-22
 */

public class SComment extends BaseEntity {

    private static final long serialVersionUID = 1L;


    private Integer cmId;

    private Integer cmUid;

    private String cmContent;

    private Integer cmFlag;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getCmId() {
        return cmId;
    }

    public void setCmId(Integer cmId) {
        this.cmId = cmId;
    }

    public Integer getCmUid() {
        return cmUid;
    }

    public void setCmUid(Integer cmUid) {
        this.cmUid = cmUid;
    }

    public String getCmContent() {
        return cmContent;
    }

    public void setCmContent(String cmContent) {
        this.cmContent = cmContent;
    }

    public Integer getCmFlag() {
        return cmFlag;
    }

    public void setCmFlag(Integer cmFlag) {
        this.cmFlag = cmFlag;
    }
}
