package com.mrbt.lingmoney.model;

import java.io.Serializable;
import java.util.Date;

public class WalletBigsellConstr implements Serializable {
    /**
     * 
     * 表字段 : wallet_bigsell_constr.id
     */
    private Integer id;

    /**
     * 上线金额
     * 表字段 : wallet_bigsell_constr.max_money
     */
    private Integer maxMoney;

    /**
     * 下限金额
     * 表字段 : wallet_bigsell_constr.min_money
     */
    private Integer minMoney;

    /**
     * 触发时间
     * 表字段 : wallet_bigsell_constr.wallet_dt
     */
    private Date walletDt;

    /**
     * 操作时间
     * 表字段 : wallet_bigsell_constr.oper_dt
     */
    private Date operDt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wallet_bigsell_constr
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:wallet_bigsell_constr.id
     *
     * @return wallet_bigsell_constr.id, 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:wallet_bigsell_constr.id
     *
     * @param id the value for wallet_bigsell_constr.id, 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 上线金额 字段:wallet_bigsell_constr.max_money
     *
     * @return wallet_bigsell_constr.max_money, 上线金额
     */
    public Integer getMaxMoney() {
        return maxMoney;
    }

    /**
     * 设置 上线金额 字段:wallet_bigsell_constr.max_money
     *
     * @param maxMoney the value for wallet_bigsell_constr.max_money, 上线金额
     */
    public void setMaxMoney(Integer maxMoney) {
        this.maxMoney = maxMoney;
    }

    /**
     * 获取 下限金额 字段:wallet_bigsell_constr.min_money
     *
     * @return wallet_bigsell_constr.min_money, 下限金额
     */
    public Integer getMinMoney() {
        return minMoney;
    }

    /**
     * 设置 下限金额 字段:wallet_bigsell_constr.min_money
     *
     * @param minMoney the value for wallet_bigsell_constr.min_money, 下限金额
     */
    public void setMinMoney(Integer minMoney) {
        this.minMoney = minMoney;
    }

    /**
     * 获取 触发时间 字段:wallet_bigsell_constr.wallet_dt
     *
     * @return wallet_bigsell_constr.wallet_dt, 触发时间
     */
    public Date getWalletDt() {
        return walletDt;
    }

    /**
     * 设置 触发时间 字段:wallet_bigsell_constr.wallet_dt
     *
     * @param walletDt the value for wallet_bigsell_constr.wallet_dt, 触发时间
     */
    public void setWalletDt(Date walletDt) {
        this.walletDt = walletDt;
    }

    /**
     * 获取 操作时间 字段:wallet_bigsell_constr.oper_dt
     *
     * @return wallet_bigsell_constr.oper_dt, 操作时间
     */
    public Date getOperDt() {
        return operDt;
    }

    /**
     * 设置 操作时间 字段:wallet_bigsell_constr.oper_dt
     *
     * @param operDt the value for wallet_bigsell_constr.oper_dt, 操作时间
     */
    public void setOperDt(Date operDt) {
        this.operDt = operDt;
    }

    /**
     * ,wallet_bigsell_constr
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", maxMoney=").append(maxMoney);
        sb.append(", minMoney=").append(minMoney);
        sb.append(", walletDt=").append(walletDt);
        sb.append(", operDt=").append(operDt);
        sb.append("]");
        return sb.toString();
    }
}