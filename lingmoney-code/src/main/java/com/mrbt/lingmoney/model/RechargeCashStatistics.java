package com.mrbt.lingmoney.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RechargeCashStatistics implements Serializable {
    /**
     * 主键
     * 表字段 : recharge_cash_statistics.id
     */
    private Integer id;

    /**
     * 充值金额
     * 表字段 : recharge_cash_statistics.recharge_money
     */
    private BigDecimal rechargeMoney;

    /**
     * 取现金额
     * 表字段 : recharge_cash_statistics.cach_money
     */
    private BigDecimal cachMoney;

    /**
     * 统计日期
     * 表字段 : recharge_cash_statistics.statistics_date
     */
    private Date statisticsDate;

    /**
     * 备注
     * 表字段 : recharge_cash_statistics.remark
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table recharge_cash_statistics
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 主键 字段:recharge_cash_statistics.id
     *
     * @return recharge_cash_statistics.id, 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 主键 字段:recharge_cash_statistics.id
     *
     * @param id the value for recharge_cash_statistics.id, 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 充值金额 字段:recharge_cash_statistics.recharge_money
     *
     * @return recharge_cash_statistics.recharge_money, 充值金额
     */
    public BigDecimal getRechargeMoney() {
        return rechargeMoney;
    }

    /**
     * 设置 充值金额 字段:recharge_cash_statistics.recharge_money
     *
     * @param rechargeMoney the value for recharge_cash_statistics.recharge_money, 充值金额
     */
    public void setRechargeMoney(BigDecimal rechargeMoney) {
        this.rechargeMoney = rechargeMoney;
    }

    /**
     * 获取 取现金额 字段:recharge_cash_statistics.cach_money
     *
     * @return recharge_cash_statistics.cach_money, 取现金额
     */
    public BigDecimal getCachMoney() {
        return cachMoney;
    }

    /**
     * 设置 取现金额 字段:recharge_cash_statistics.cach_money
     *
     * @param cachMoney the value for recharge_cash_statistics.cach_money, 取现金额
     */
    public void setCachMoney(BigDecimal cachMoney) {
        this.cachMoney = cachMoney;
    }

    /**
     * 获取 统计日期 字段:recharge_cash_statistics.statistics_date
     *
     * @return recharge_cash_statistics.statistics_date, 统计日期
     */
    public Date getStatisticsDate() {
        return statisticsDate;
    }

    /**
     * 设置 统计日期 字段:recharge_cash_statistics.statistics_date
     *
     * @param statisticsDate the value for recharge_cash_statistics.statistics_date, 统计日期
     */
    public void setStatisticsDate(Date statisticsDate) {
        this.statisticsDate = statisticsDate;
    }

    /**
     * 获取 备注 字段:recharge_cash_statistics.remark
     *
     * @return recharge_cash_statistics.remark, 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置 备注 字段:recharge_cash_statistics.remark
     *
     * @param remark the value for recharge_cash_statistics.remark, 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * ,recharge_cash_statistics
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", rechargeMoney=").append(rechargeMoney);
        sb.append(", cachMoney=").append(cachMoney);
        sb.append(", statisticsDate=").append(statisticsDate);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}