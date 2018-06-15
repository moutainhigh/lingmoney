package com.mrbt.lingmoney.model;

import java.io.Serializable;

public class HxBidding implements Serializable {
    /**
     * 主键
     * 表字段 : hx_bidding.id
     */
    private String id;

    /**
     * 关联产品id
     * 表字段 : hx_bidding.p_id
     */
    private Integer pId;

    /**
     * 应用标识 PC APP WX
     * 表字段 : hx_bidding.app_id
     */
    private String appId;

    /**
     * 借款编号
     * 表字段 : hx_bidding.loan_no
     */
    private String loanNo;

    /**
     * 标的编号，目前与借款编号相同
     * 表字段 : hx_bidding.invest_id
     */
    private String investId;

    /**
     * 标的简介
     * 表字段 : hx_bidding.invest_obj_info
     */
    private String investObjInfo;

    /**
     * 还款日期，YYYYMMDD
     * 表字段 : hx_bidding.repay_date
     */
    private String repayDate;

    /**
     * 计息方式
     * 表字段 : hx_bidding.rate_stype
     */
    private String rateStype;

    /**
     * 标的状态，-1初始，0 正常，1 撤销 ，2 流标， 4 标的成立，5 发标失败
     * 表字段 : hx_bidding.invest_obj_state
     */
    private String investObjState;

    /**
     * 借款人总数
     * 表字段 : hx_bidding.bw_total_num
     */
    private Integer bwTotalNum;

    /**
     * 备注
     * 表字段 : hx_bidding.remark
     */
    private String remark;

    /**
     * 是否为债权转让标的，0 否，1 是
     * 表字段 : hx_bidding.zr_flag
     */
    private String zrFlag;

    /**
     * 债权转让原标的，当ZRFLAG=1时必填
     * 表字段 : hx_bidding.ref_loan_no
     */
    private String refLoanNo;

    /**
     * 原投标第三方交易流水号，当ZRFLAG=1时必填
     * 表字段 : hx_bidding.old_reqseq
     */
    private String oldReqseq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hx_bidding
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 主键 字段:hx_bidding.id
     *
     * @return hx_bidding.id, 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置 主键 字段:hx_bidding.id
     *
     * @param id the value for hx_bidding.id, 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取 关联产品id 字段:hx_bidding.p_id
     *
     * @return hx_bidding.p_id, 关联产品id
     */
    public Integer getpId() {
        return pId;
    }

    /**
     * 设置 关联产品id 字段:hx_bidding.p_id
     *
     * @param pId the value for hx_bidding.p_id, 关联产品id
     */
    public void setpId(Integer pId) {
        this.pId = pId;
    }

    /**
     * 获取 应用标识 PC APP WX 字段:hx_bidding.app_id
     *
     * @return hx_bidding.app_id, 应用标识 PC APP WX
     */
    public String getAppId() {
        return appId;
    }

    /**
     * 设置 应用标识 PC APP WX 字段:hx_bidding.app_id
     *
     * @param appId the value for hx_bidding.app_id, 应用标识 PC APP WX
     */
    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    /**
     * 获取 借款编号 字段:hx_bidding.loan_no
     *
     * @return hx_bidding.loan_no, 借款编号
     */
    public String getLoanNo() {
        return loanNo;
    }

    /**
     * 设置 借款编号 字段:hx_bidding.loan_no
     *
     * @param loanNo the value for hx_bidding.loan_no, 借款编号
     */
    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo == null ? null : loanNo.trim();
    }

    /**
     * 获取 标的编号，目前与借款编号相同 字段:hx_bidding.invest_id
     *
     * @return hx_bidding.invest_id, 标的编号，目前与借款编号相同
     */
    public String getInvestId() {
        return investId;
    }

    /**
     * 设置 标的编号，目前与借款编号相同 字段:hx_bidding.invest_id
     *
     * @param investId the value for hx_bidding.invest_id, 标的编号，目前与借款编号相同
     */
    public void setInvestId(String investId) {
        this.investId = investId == null ? null : investId.trim();
    }

    /**
     * 获取 标的简介 字段:hx_bidding.invest_obj_info
     *
     * @return hx_bidding.invest_obj_info, 标的简介
     */
    public String getInvestObjInfo() {
        return investObjInfo;
    }

    /**
     * 设置 标的简介 字段:hx_bidding.invest_obj_info
     *
     * @param investObjInfo the value for hx_bidding.invest_obj_info, 标的简介
     */
    public void setInvestObjInfo(String investObjInfo) {
        this.investObjInfo = investObjInfo == null ? null : investObjInfo.trim();
    }

    /**
     * 获取 还款日期，YYYYMMDD 字段:hx_bidding.repay_date
     *
     * @return hx_bidding.repay_date, 还款日期，YYYYMMDD
     */
    public String getRepayDate() {
        return repayDate;
    }

    /**
     * 设置 还款日期，YYYYMMDD 字段:hx_bidding.repay_date
     *
     * @param repayDate the value for hx_bidding.repay_date, 还款日期，YYYYMMDD
     */
    public void setRepayDate(String repayDate) {
        this.repayDate = repayDate == null ? null : repayDate.trim();
    }

    /**
     * 获取 计息方式 字段:hx_bidding.rate_stype
     *
     * @return hx_bidding.rate_stype, 计息方式
     */
    public String getRateStype() {
        return rateStype;
    }

    /**
     * 设置 计息方式 字段:hx_bidding.rate_stype
     *
     * @param rateStype the value for hx_bidding.rate_stype, 计息方式
     */
    public void setRateStype(String rateStype) {
        this.rateStype = rateStype == null ? null : rateStype.trim();
    }

    /**
     * 获取 标的状态，-1初始，0 正常，1 撤销 ，2 流标， 4 标的成立，5 发标失败 字段:hx_bidding.invest_obj_state
     *
     * @return hx_bidding.invest_obj_state, 标的状态，-1初始，0 正常，1 撤销 ，2 流标， 4 标的成立，5 发标失败
     */
    public String getInvestObjState() {
        return investObjState;
    }

    /**
     * 设置 标的状态，-1初始，0 正常，1 撤销 ，2 流标， 4 标的成立，5 发标失败 字段:hx_bidding.invest_obj_state
     *
     * @param investObjState the value for hx_bidding.invest_obj_state, 标的状态，-1初始，0 正常，1 撤销 ，2 流标， 4 标的成立，5 发标失败
     */
    public void setInvestObjState(String investObjState) {
        this.investObjState = investObjState == null ? null : investObjState.trim();
    }

    /**
     * 获取 借款人总数 字段:hx_bidding.bw_total_num
     *
     * @return hx_bidding.bw_total_num, 借款人总数
     */
    public Integer getBwTotalNum() {
        return bwTotalNum;
    }

    /**
     * 设置 借款人总数 字段:hx_bidding.bw_total_num
     *
     * @param bwTotalNum the value for hx_bidding.bw_total_num, 借款人总数
     */
    public void setBwTotalNum(Integer bwTotalNum) {
        this.bwTotalNum = bwTotalNum;
    }

    /**
     * 获取 备注 字段:hx_bidding.remark
     *
     * @return hx_bidding.remark, 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置 备注 字段:hx_bidding.remark
     *
     * @param remark the value for hx_bidding.remark, 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取 是否为债权转让标的，0 否，1 是 字段:hx_bidding.zr_flag
     *
     * @return hx_bidding.zr_flag, 是否为债权转让标的，0 否，1 是
     */
    public String getZrFlag() {
        return zrFlag;
    }

    /**
     * 设置 是否为债权转让标的，0 否，1 是 字段:hx_bidding.zr_flag
     *
     * @param zrFlag the value for hx_bidding.zr_flag, 是否为债权转让标的，0 否，1 是
     */
    public void setZrFlag(String zrFlag) {
        this.zrFlag = zrFlag == null ? null : zrFlag.trim();
    }

    /**
     * 获取 债权转让原标的，当ZRFLAG=1时必填 字段:hx_bidding.ref_loan_no
     *
     * @return hx_bidding.ref_loan_no, 债权转让原标的，当ZRFLAG=1时必填
     */
    public String getRefLoanNo() {
        return refLoanNo;
    }

    /**
     * 设置 债权转让原标的，当ZRFLAG=1时必填 字段:hx_bidding.ref_loan_no
     *
     * @param refLoanNo the value for hx_bidding.ref_loan_no, 债权转让原标的，当ZRFLAG=1时必填
     */
    public void setRefLoanNo(String refLoanNo) {
        this.refLoanNo = refLoanNo == null ? null : refLoanNo.trim();
    }

    /**
     * 获取 原投标第三方交易流水号，当ZRFLAG=1时必填 字段:hx_bidding.old_reqseq
     *
     * @return hx_bidding.old_reqseq, 原投标第三方交易流水号，当ZRFLAG=1时必填
     */
    public String getOldReqseq() {
        return oldReqseq;
    }

    /**
     * 设置 原投标第三方交易流水号，当ZRFLAG=1时必填 字段:hx_bidding.old_reqseq
     *
     * @param oldReqseq the value for hx_bidding.old_reqseq, 原投标第三方交易流水号，当ZRFLAG=1时必填
     */
    public void setOldReqseq(String oldReqseq) {
        this.oldReqseq = oldReqseq == null ? null : oldReqseq.trim();
    }

    /**
     * ,hx_bidding
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pId=").append(pId);
        sb.append(", appId=").append(appId);
        sb.append(", loanNo=").append(loanNo);
        sb.append(", investId=").append(investId);
        sb.append(", investObjInfo=").append(investObjInfo);
        sb.append(", repayDate=").append(repayDate);
        sb.append(", rateStype=").append(rateStype);
        sb.append(", investObjState=").append(investObjState);
        sb.append(", bwTotalNum=").append(bwTotalNum);
        sb.append(", remark=").append(remark);
        sb.append(", zrFlag=").append(zrFlag);
        sb.append(", refLoanNo=").append(refLoanNo);
        sb.append(", oldReqseq=").append(oldReqseq);
        sb.append("]");
        return sb.toString();
    }
}