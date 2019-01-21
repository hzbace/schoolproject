package com.qfedu.entity.suwallet;

import com.qfedu.entity.base.BaseEntity;


/**
 * <p>
 * 
 * </p>
 *
 * @author java1806
 * @since 2019-01-17
 */

public class SUwallet extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Integer wUid;

    private Double wBalance;

    private String wBankcard;

    private Integer wScore;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getwUid() {
        return wUid;
    }

    public void setwUid(Integer wUid) {
        this.wUid = wUid;
    }

    public Double getwBalance() {
        return wBalance;
    }

    public void setwBalance(Double wBalance) {
        this.wBalance = wBalance;
    }

    public String getwBankcard() {
        return wBankcard;
    }

    public void setwBankcard(String wBankcard) {
        this.wBankcard = wBankcard;
    }

    public Integer getwScore() {
        return wScore;
    }

    public void setwScore(Integer wScore) {
        this.wScore = wScore;
    }
}
