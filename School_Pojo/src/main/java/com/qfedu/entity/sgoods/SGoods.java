package com.qfedu.entity.sgoods;

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

public class SGoods extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "g_id", type = IdType.AUTO)
    private Integer gId;

    private String gName;

    private String gContent;

    private String gUwant;

    private Integer gFlag;

    private String gUsernum;

    public String getgUsernum() {
        return gUsernum;
    }

    public void setgUsernum(String gUsernum) {
        this.gUsernum = gUsernum;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public String getgContent() {
        return gContent;
    }

    public void setgContent(String gContent) {
        this.gContent = gContent;
    }

    public String getgUwant() {
        return gUwant;
    }

    public void setgUwant(String gUwant) {
        this.gUwant = gUwant;
    }

    public Integer getgFlag() {
        return gFlag;
    }

    public void setgFlag(Integer gFlag) {
        this.gFlag = gFlag;
    }


}
