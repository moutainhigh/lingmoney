package com.mrbt.lingmoney.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class HxBorrowerInfo implements Serializable {
    /**
     * 主键
     * 表字段 : hx_borrower_info.id
     */
    private String id;

    /**
     * 标的id
     * 表字段 : hx_borrower_info.bidding_id
     */
    private String biddingId;

    /**
     * 借款人id，关联hw_borrower表id
     * 表字段 : hx_borrower_info.bw_id
     */
    private String bwId;

    /**
     * 借款金额
     * 表字段 : hx_borrower_info.bw_amt
     */
    private BigDecimal bwAmt;

    /**
     * 借款人抵押品编号
     * 表字段 : hx_borrower_info.mortgage_id
     */
    private String mortgageId;

    /**
     * 借款人抵押品简单描述
     * 表字段 : hx_borrower_info.mortgage_info
     */
    private String mortgageInfo;

    /**
     * 借款人审批通过日期，YYYYMMDD
     * 表字段 : hx_borrower_info.check_date
     */
    private String checkDate;

    /**
     * 备注（其它未尽事宜）
     * 表字段 : hx_borrower_info.remark
     */
    private String remark;

    /**
     * 借款用途
     * 表字段 : hx_borrower_info.bw_use
     */
    private String bwUse;

    /**
     * 借款描述
     * 表字段 : hx_borrower_info.bw_info
     */
    private String bwInfo;

    /**
     * 抵押物所有权人
     * 表字段 : hx_borrower_info.mortgage_owner
     */
    private String mortgageOwner;

    /**
     * 抵押物共有情况
     * 表字段 : hx_borrower_info.mortgage_common
     */
    private String mortgageCommon;

    /**
     * 抵押物所有权取得方式
     * 表字段 : hx_borrower_info.mortgage_own_style
     */
    private String mortgageOwnStyle;

    /**
     * 抵押物所属地域
     * 表字段 : hx_borrower_info.mortgage_region
     */
    private String mortgageRegion;

    /**
     * 抵押物类型
     * 表字段 : hx_borrower_info.mortgage_type
     */
    private String mortgageType;

    /**
     * 抵押物购买价格
     * 表字段 : hx_borrower_info.mortgage_buy_price
     */
    private String mortgageBuyPrice;

    /**
     * 抵押物评估价格
     * 表字段 : hx_borrower_info.mortgage_evaluate_price
     */
    private String mortgageEvaluatePrice;

    /**
     * 抵押物抵押率
     * 表字段 : hx_borrower_info.mortgage_rate
     */
    private String mortgageRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hx_borrower_info
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 主键 字段:hx_borrower_info.id
     *
     * @return hx_borrower_info.id, 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置 主键 字段:hx_borrower_info.id
     *
     * @param id the value for hx_borrower_info.id, 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取 标的id 字段:hx_borrower_info.bidding_id
     *
     * @return hx_borrower_info.bidding_id, 标的id
     */
    public String getBiddingId() {
        return biddingId;
    }

    /**
     * 设置 标的id 字段:hx_borrower_info.bidding_id
     *
     * @param biddingId the value for hx_borrower_info.bidding_id, 标的id
     */
    public void setBiddingId(String biddingId) {
        this.biddingId = biddingId == null ? null : biddingId.trim();
    }

    /**
     * 获取 借款人id，关联hw_borrower表id 字段:hx_borrower_info.bw_id
     *
     * @return hx_borrower_info.bw_id, 借款人id，关联hw_borrower表id
     */
    public String getBwId() {
        return bwId;
    }

    /**
     * 设置 借款人id，关联hw_borrower表id 字段:hx_borrower_info.bw_id
     *
     * @param bwId the value for hx_borrower_info.bw_id, 借款人id，关联hw_borrower表id
     */
    public void setBwId(String bwId) {
        this.bwId = bwId == null ? null : bwId.trim();
    }

    /**
     * 获取 借款金额 字段:hx_borrower_info.bw_amt
     *
     * @return hx_borrower_info.bw_amt, 借款金额
     */
    public BigDecimal getBwAmt() {
        return bwAmt;
    }

    /**
     * 设置 借款金额 字段:hx_borrower_info.bw_amt
     *
     * @param bwAmt the value for hx_borrower_info.bw_amt, 借款金额
     */
    public void setBwAmt(BigDecimal bwAmt) {
        this.bwAmt = bwAmt;
    }

    /**
     * 获取 借款人抵押品编号 字段:hx_borrower_info.mortgage_id
     *
     * @return hx_borrower_info.mortgage_id, 借款人抵押品编号
     */
    public String getMortgageId() {
        return mortgageId;
    }

    /**
     * 设置 借款人抵押品编号 字段:hx_borrower_info.mortgage_id
     *
     * @param mortgageId the value for hx_borrower_info.mortgage_id, 借款人抵押品编号
     */
    public void setMortgageId(String mortgageId) {
        this.mortgageId = mortgageId == null ? null : mortgageId.trim();
    }

    /**
     * 获取 借款人抵押品简单描述 字段:hx_borrower_info.mortgage_info
     *
     * @return hx_borrower_info.mortgage_info, 借款人抵押品简单描述
     */
    public String getMortgageInfo() {
        return mortgageInfo;
    }

    /**
     * 设置 借款人抵押品简单描述 字段:hx_borrower_info.mortgage_info
     *
     * @param mortgageInfo the value for hx_borrower_info.mortgage_info, 借款人抵押品简单描述
     */
    public void setMortgageInfo(String mortgageInfo) {
        this.mortgageInfo = mortgageInfo == null ? null : mortgageInfo.trim();
    }

    /**
     * 获取 借款人审批通过日期，YYYYMMDD 字段:hx_borrower_info.check_date
     *
     * @return hx_borrower_info.check_date, 借款人审批通过日期，YYYYMMDD
     */
    public String getCheckDate() {
        return checkDate;
    }

    /**
     * 设置 借款人审批通过日期，YYYYMMDD 字段:hx_borrower_info.check_date
     *
     * @param checkDate the value for hx_borrower_info.check_date, 借款人审批通过日期，YYYYMMDD
     */
    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate == null ? null : checkDate.trim();
    }

    /**
     * 获取 备注（其它未尽事宜） 字段:hx_borrower_info.remark
     *
     * @return hx_borrower_info.remark, 备注（其它未尽事宜）
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置 备注（其它未尽事宜） 字段:hx_borrower_info.remark
     *
     * @param remark the value for hx_borrower_info.remark, 备注（其它未尽事宜）
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取 借款用途 字段:hx_borrower_info.bw_use
     *
     * @return hx_borrower_info.bw_use, 借款用途
     */
    public String getBwUse() {
        return bwUse;
    }

    /**
     * 设置 借款用途 字段:hx_borrower_info.bw_use
     *
     * @param bwUse the value for hx_borrower_info.bw_use, 借款用途
     */
    public void setBwUse(String bwUse) {
        this.bwUse = bwUse == null ? null : bwUse.trim();
    }

    /**
     * 获取 借款描述 字段:hx_borrower_info.bw_info
     *
     * @return hx_borrower_info.bw_info, 借款描述
     */
    public String getBwInfo() {
        return bwInfo;
    }

    /**
     * 设置 借款描述 字段:hx_borrower_info.bw_info
     *
     * @param bwInfo the value for hx_borrower_info.bw_info, 借款描述
     */
    public void setBwInfo(String bwInfo) {
        this.bwInfo = bwInfo == null ? null : bwInfo.trim();
    }

    /**
     * 获取 抵押物所有权人 字段:hx_borrower_info.mortgage_owner
     *
     * @return hx_borrower_info.mortgage_owner, 抵押物所有权人
     */
    public String getMortgageOwner() {
        return mortgageOwner;
    }

    /**
     * 设置 抵押物所有权人 字段:hx_borrower_info.mortgage_owner
     *
     * @param mortgageOwner the value for hx_borrower_info.mortgage_owner, 抵押物所有权人
     */
    public void setMortgageOwner(String mortgageOwner) {
        this.mortgageOwner = mortgageOwner == null ? null : mortgageOwner.trim();
    }

    /**
     * 获取 抵押物共有情况 字段:hx_borrower_info.mortgage_common
     *
     * @return hx_borrower_info.mortgage_common, 抵押物共有情况
     */
    public String getMortgageCommon() {
        return mortgageCommon;
    }

    /**
     * 设置 抵押物共有情况 字段:hx_borrower_info.mortgage_common
     *
     * @param mortgageCommon the value for hx_borrower_info.mortgage_common, 抵押物共有情况
     */
    public void setMortgageCommon(String mortgageCommon) {
        this.mortgageCommon = mortgageCommon == null ? null : mortgageCommon.trim();
    }

    /**
     * 获取 抵押物所有权取得方式 字段:hx_borrower_info.mortgage_own_style
     *
     * @return hx_borrower_info.mortgage_own_style, 抵押物所有权取得方式
     */
    public String getMortgageOwnStyle() {
        return mortgageOwnStyle;
    }

    /**
     * 设置 抵押物所有权取得方式 字段:hx_borrower_info.mortgage_own_style
     *
     * @param mortgageOwnStyle the value for hx_borrower_info.mortgage_own_style, 抵押物所有权取得方式
     */
    public void setMortgageOwnStyle(String mortgageOwnStyle) {
        this.mortgageOwnStyle = mortgageOwnStyle == null ? null : mortgageOwnStyle.trim();
    }

    /**
     * 获取 抵押物所属地域 字段:hx_borrower_info.mortgage_region
     *
     * @return hx_borrower_info.mortgage_region, 抵押物所属地域
     */
    public String getMortgageRegion() {
        return mortgageRegion;
    }

    /**
     * 设置 抵押物所属地域 字段:hx_borrower_info.mortgage_region
     *
     * @param mortgageRegion the value for hx_borrower_info.mortgage_region, 抵押物所属地域
     */
    public void setMortgageRegion(String mortgageRegion) {
        this.mortgageRegion = mortgageRegion == null ? null : mortgageRegion.trim();
    }

    /**
     * 获取 抵押物类型 字段:hx_borrower_info.mortgage_type
     *
     * @return hx_borrower_info.mortgage_type, 抵押物类型
     */
    public String getMortgageType() {
        return mortgageType;
    }

    /**
     * 设置 抵押物类型 字段:hx_borrower_info.mortgage_type
     *
     * @param mortgageType the value for hx_borrower_info.mortgage_type, 抵押物类型
     */
    public void setMortgageType(String mortgageType) {
        this.mortgageType = mortgageType == null ? null : mortgageType.trim();
    }

    /**
     * 获取 抵押物购买价格 字段:hx_borrower_info.mortgage_buy_price
     *
     * @return hx_borrower_info.mortgage_buy_price, 抵押物购买价格
     */
    public String getMortgageBuyPrice() {
        return mortgageBuyPrice;
    }

    /**
     * 设置 抵押物购买价格 字段:hx_borrower_info.mortgage_buy_price
     *
     * @param mortgageBuyPrice the value for hx_borrower_info.mortgage_buy_price, 抵押物购买价格
     */
    public void setMortgageBuyPrice(String mortgageBuyPrice) {
        this.mortgageBuyPrice = mortgageBuyPrice == null ? null : mortgageBuyPrice.trim();
    }

    /**
     * 获取 抵押物评估价格 字段:hx_borrower_info.mortgage_evaluate_price
     *
     * @return hx_borrower_info.mortgage_evaluate_price, 抵押物评估价格
     */
    public String getMortgageEvaluatePrice() {
        return mortgageEvaluatePrice;
    }

    /**
     * 设置 抵押物评估价格 字段:hx_borrower_info.mortgage_evaluate_price
     *
     * @param mortgageEvaluatePrice the value for hx_borrower_info.mortgage_evaluate_price, 抵押物评估价格
     */
    public void setMortgageEvaluatePrice(String mortgageEvaluatePrice) {
        this.mortgageEvaluatePrice = mortgageEvaluatePrice == null ? null : mortgageEvaluatePrice.trim();
    }

    /**
     * 获取 抵押物抵押率 字段:hx_borrower_info.mortgage_rate
     *
     * @return hx_borrower_info.mortgage_rate, 抵押物抵押率
     */
    public String getMortgageRate() {
        return mortgageRate;
    }

    /**
     * 设置 抵押物抵押率 字段:hx_borrower_info.mortgage_rate
     *
     * @param mortgageRate the value for hx_borrower_info.mortgage_rate, 抵押物抵押率
     */
    public void setMortgageRate(String mortgageRate) {
        this.mortgageRate = mortgageRate == null ? null : mortgageRate.trim();
    }

    /**
     * ,hx_borrower_info
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", biddingId=").append(biddingId);
        sb.append(", bwId=").append(bwId);
        sb.append(", bwAmt=").append(bwAmt);
        sb.append(", mortgageId=").append(mortgageId);
        sb.append(", mortgageInfo=").append(mortgageInfo);
        sb.append(", checkDate=").append(checkDate);
        sb.append(", remark=").append(remark);
        sb.append(", bwUse=").append(bwUse);
        sb.append(", bwInfo=").append(bwInfo);
        sb.append(", mortgageOwner=").append(mortgageOwner);
        sb.append(", mortgageCommon=").append(mortgageCommon);
        sb.append(", mortgageOwnStyle=").append(mortgageOwnStyle);
        sb.append(", mortgageRegion=").append(mortgageRegion);
        sb.append(", mortgageType=").append(mortgageType);
        sb.append(", mortgageBuyPrice=").append(mortgageBuyPrice);
        sb.append(", mortgageEvaluatePrice=").append(mortgageEvaluatePrice);
        sb.append(", mortgageRate=").append(mortgageRate);
        sb.append("]");
        return sb.toString();
    }
}