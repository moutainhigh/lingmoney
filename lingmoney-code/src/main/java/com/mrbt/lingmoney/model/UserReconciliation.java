package com.mrbt.lingmoney.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UserReconciliation implements Serializable {
    /**
     * 主键
     * 表字段 : user_reconciliation.id
     */
    private Integer id;

    /**
     * 
     * 表字段 : user_reconciliation.u_id
     */
    private String uId;

    /**
     * 0:未处理，1已处理
     * 表字段 : user_reconciliation.status
     */
    private Integer status;

    /**
     * 
     * 表字段 : user_reconciliation.p_frozen_money
     */
    private BigDecimal pFrozenMoney;

    /**
     * 
     * 表字段 : user_reconciliation.y_frozen_money
     */
    private BigDecimal yFrozenMoney;

    /**
     * 
     * 表字段 : user_reconciliation.p_balance
     */
    private BigDecimal pBalance;

    /**
     * 
     * 表字段 : user_reconciliation.y_balance
     */
    private BigDecimal yBalance;

    /**
     * 
     * 表字段 : user_reconciliation.recon_date
     */
    private Date reconDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_reconciliation
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 主键 字段:user_reconciliation.id
     *
     * @return user_reconciliation.id, 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 主键 字段:user_reconciliation.id
     *
     * @param id the value for user_reconciliation.id, 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取  字段:user_reconciliation.u_id
     *
     * @return user_reconciliation.u_id, 
     */
    public String getuId() {
        return uId;
    }

    /**
     * 设置  字段:user_reconciliation.u_id
     *
     * @param uId the value for user_reconciliation.u_id, 
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * 获取 0:未处理，1已处理 字段:user_reconciliation.status
     *
     * @return user_reconciliation.status, 0:未处理，1已处理
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 0:未处理，1已处理 字段:user_reconciliation.status
     *
     * @param status the value for user_reconciliation.status, 0:未处理，1已处理
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取  字段:user_reconciliation.p_frozen_money
     *
     * @return user_reconciliation.p_frozen_money, 
     */
    public BigDecimal getpFrozenMoney() {
        return pFrozenMoney;
    }

    /**
     * 设置  字段:user_reconciliation.p_frozen_money
     *
     * @param pFrozenMoney the value for user_reconciliation.p_frozen_money, 
     */
    public void setpFrozenMoney(BigDecimal pFrozenMoney) {
        this.pFrozenMoney = pFrozenMoney;
    }

    /**
     * 获取  字段:user_reconciliation.y_frozen_money
     *
     * @return user_reconciliation.y_frozen_money, 
     */
    public BigDecimal getyFrozenMoney() {
        return yFrozenMoney;
    }

    /**
     * 设置  字段:user_reconciliation.y_frozen_money
     *
     * @param yFrozenMoney the value for user_reconciliation.y_frozen_money, 
     */
    public void setyFrozenMoney(BigDecimal yFrozenMoney) {
        this.yFrozenMoney = yFrozenMoney;
    }

    /**
     * 获取  字段:user_reconciliation.p_balance
     *
     * @return user_reconciliation.p_balance, 
     */
    public BigDecimal getpBalance() {
        return pBalance;
    }

    /**
     * 设置  字段:user_reconciliation.p_balance
     *
     * @param pBalance the value for user_reconciliation.p_balance, 
     */
    public void setpBalance(BigDecimal pBalance) {
        this.pBalance = pBalance;
    }

    /**
     * 获取  字段:user_reconciliation.y_balance
     *
     * @return user_reconciliation.y_balance, 
     */
    public BigDecimal getyBalance() {
        return yBalance;
    }

    /**
     * 设置  字段:user_reconciliation.y_balance
     *
     * @param yBalance the value for user_reconciliation.y_balance, 
     */
    public void setyBalance(BigDecimal yBalance) {
        this.yBalance = yBalance;
    }

    /**
     * 获取  字段:user_reconciliation.recon_date
     *
     * @return user_reconciliation.recon_date, 
     */
    public Date getReconDate() {
        return reconDate;
    }

    /**
     * 设置  字段:user_reconciliation.recon_date
     *
     * @param reconDate the value for user_reconciliation.recon_date, 
     */
    public void setReconDate(Date reconDate) {
        this.reconDate = reconDate;
    }

    /**
     * ,user_reconciliation
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uId=").append(uId);
        sb.append(", status=").append(status);
        sb.append(", pFrozenMoney=").append(pFrozenMoney);
        sb.append(", yFrozenMoney=").append(yFrozenMoney);
        sb.append(", pBalance=").append(pBalance);
        sb.append(", yBalance=").append(yBalance);
        sb.append(", reconDate=").append(reconDate);
        sb.append("]");
        return sb.toString();
    }
}