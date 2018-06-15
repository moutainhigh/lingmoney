package com.mrbt.lingmoney.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class HxRechargeWithdraw implements Serializable {
    /**
     * 32位UUID
     * 表字段 : hx_recharge_withdraw.id
     */
    private String id;

    /**
     * 账户id
     * 表字段 : hx_recharge_withdraw.acc_id
     */
    private String accId;

    /**
     * 应用标识 PC APP WX
     * 表字段 : hx_recharge_withdraw.app_id
     */
    private String appId;

    /**
     * 渠道流水号/原交易流水号
     * 表字段 : hx_recharge_withdraw.seq_no
     */
    private String seqNo;

    /**
     * 金额
     * 表字段 : hx_recharge_withdraw.amount
     */
    private BigDecimal amount;

    /**
     * 数据状态  
0：请求 
1：成功
  2：处理中  
3：失败 4 : 订单预授权中（非实时到账，下一工作日到账）
     * 表字段 : hx_recharge_withdraw.status
     */
    private Integer status;

    /**
     * 备注
     * 表字段 : hx_recharge_withdraw.remark
     */
    private String remark;

    /**
     * 交易类型 TransType.7=充值 TransType.8=提现
     * 表字段 : hx_recharge_withdraw.trans_type
     */
    private Integer transType;

    /**
     * 
     * 表字段 : hx_recharge_withdraw.operate_time
     */
    private Date operateTime;

    /**
     * 银行交易流水号
     * 表字段 : hx_recharge_withdraw.bank_seq_no
     */
    private String bankSeqNo;

    /**
     * 银行交易状态 R N P D S F
     * 表字段 : hx_recharge_withdraw.return_status
     */
    private String returnStatus;

    /**
     * 失败原因
     * 表字段 : hx_recharge_withdraw.error_msg
     */
    private String errorMsg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hx_recharge_withdraw
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 32位UUID 字段:hx_recharge_withdraw.id
     *
     * @return hx_recharge_withdraw.id, 32位UUID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置 32位UUID 字段:hx_recharge_withdraw.id
     *
     * @param id the value for hx_recharge_withdraw.id, 32位UUID
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取 账户id 字段:hx_recharge_withdraw.acc_id
     *
     * @return hx_recharge_withdraw.acc_id, 账户id
     */
    public String getAccId() {
        return accId;
    }

    /**
     * 设置 账户id 字段:hx_recharge_withdraw.acc_id
     *
     * @param accId the value for hx_recharge_withdraw.acc_id, 账户id
     */
    public void setAccId(String accId) {
        this.accId = accId == null ? null : accId.trim();
    }

    /**
     * 获取 应用标识 PC APP WX 字段:hx_recharge_withdraw.app_id
     *
     * @return hx_recharge_withdraw.app_id, 应用标识 PC APP WX
     */
    public String getAppId() {
        return appId;
    }

    /**
     * 设置 应用标识 PC APP WX 字段:hx_recharge_withdraw.app_id
     *
     * @param appId the value for hx_recharge_withdraw.app_id, 应用标识 PC APP WX
     */
    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    /**
     * 获取 渠道流水号/原交易流水号 字段:hx_recharge_withdraw.seq_no
     *
     * @return hx_recharge_withdraw.seq_no, 渠道流水号/原交易流水号
     */
    public String getSeqNo() {
        return seqNo;
    }

    /**
     * 设置 渠道流水号/原交易流水号 字段:hx_recharge_withdraw.seq_no
     *
     * @param seqNo the value for hx_recharge_withdraw.seq_no, 渠道流水号/原交易流水号
     */
    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo == null ? null : seqNo.trim();
    }

    /**
     * 获取 金额 字段:hx_recharge_withdraw.amount
     *
     * @return hx_recharge_withdraw.amount, 金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置 金额 字段:hx_recharge_withdraw.amount
     *
     * @param amount the value for hx_recharge_withdraw.amount, 金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取 数据状态  
0：请求 
1：成功
  2：处理中  
3：失败 4 : 订单预授权中（非实时到账，下一工作日到账） 字段:hx_recharge_withdraw.status
     *
     * @return hx_recharge_withdraw.status, 数据状态  
0：请求 
1：成功
  2：处理中  
3：失败 4 : 订单预授权中（非实时到账，下一工作日到账）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 数据状态  
0：请求 
1：成功
  2：处理中  
3：失败 4 : 订单预授权中（非实时到账，下一工作日到账） 字段:hx_recharge_withdraw.status
     *
     * @param status the value for hx_recharge_withdraw.status, 数据状态  
0：请求 
1：成功
  2：处理中  
3：失败 4 : 订单预授权中（非实时到账，下一工作日到账）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 备注 字段:hx_recharge_withdraw.remark
     *
     * @return hx_recharge_withdraw.remark, 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置 备注 字段:hx_recharge_withdraw.remark
     *
     * @param remark the value for hx_recharge_withdraw.remark, 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取 交易类型 TransType.7=充值 TransType.8=提现 字段:hx_recharge_withdraw.trans_type
     *
     * @return hx_recharge_withdraw.trans_type, 交易类型 TransType.7=充值 TransType.8=提现
     */
    public Integer getTransType() {
        return transType;
    }

    /**
     * 设置 交易类型 TransType.7=充值 TransType.8=提现 字段:hx_recharge_withdraw.trans_type
     *
     * @param transType the value for hx_recharge_withdraw.trans_type, 交易类型 TransType.7=充值 TransType.8=提现
     */
    public void setTransType(Integer transType) {
        this.transType = transType;
    }

    /**
     * 获取  字段:hx_recharge_withdraw.operate_time
     *
     * @return hx_recharge_withdraw.operate_time, 
     */
    public Date getOperateTime() {
        return operateTime;
    }

    /**
     * 设置  字段:hx_recharge_withdraw.operate_time
     *
     * @param operateTime the value for hx_recharge_withdraw.operate_time, 
     */
    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * 获取 银行交易流水号 字段:hx_recharge_withdraw.bank_seq_no
     *
     * @return hx_recharge_withdraw.bank_seq_no, 银行交易流水号
     */
    public String getBankSeqNo() {
        return bankSeqNo;
    }

    /**
     * 设置 银行交易流水号 字段:hx_recharge_withdraw.bank_seq_no
     *
     * @param bankSeqNo the value for hx_recharge_withdraw.bank_seq_no, 银行交易流水号
     */
    public void setBankSeqNo(String bankSeqNo) {
        this.bankSeqNo = bankSeqNo == null ? null : bankSeqNo.trim();
    }

    /**
     * 获取 银行交易状态 R N P D S F 字段:hx_recharge_withdraw.return_status
     *
     * @return hx_recharge_withdraw.return_status, 银行交易状态 R N P D S F
     */
    public String getReturnStatus() {
        return returnStatus;
    }

    /**
     * 设置 银行交易状态 R N P D S F 字段:hx_recharge_withdraw.return_status
     *
     * @param returnStatus the value for hx_recharge_withdraw.return_status, 银行交易状态 R N P D S F
     */
    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus == null ? null : returnStatus.trim();
    }

    /**
     * 获取 失败原因 字段:hx_recharge_withdraw.error_msg
     *
     * @return hx_recharge_withdraw.error_msg, 失败原因
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * 设置 失败原因 字段:hx_recharge_withdraw.error_msg
     *
     * @param errorMsg the value for hx_recharge_withdraw.error_msg, 失败原因
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg == null ? null : errorMsg.trim();
    }

    /**
     * ,hx_recharge_withdraw
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", accId=").append(accId);
        sb.append(", appId=").append(appId);
        sb.append(", seqNo=").append(seqNo);
        sb.append(", amount=").append(amount);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", transType=").append(transType);
        sb.append(", operateTime=").append(operateTime);
        sb.append(", bankSeqNo=").append(bankSeqNo);
        sb.append(", returnStatus=").append(returnStatus);
        sb.append(", errorMsg=").append(errorMsg);
        sb.append("]");
        return sb.toString();
    }
}