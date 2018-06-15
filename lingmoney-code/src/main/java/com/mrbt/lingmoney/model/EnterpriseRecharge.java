package com.mrbt.lingmoney.model;

import java.io.Serializable;
import java.util.Date;

public class EnterpriseRecharge implements Serializable {
    /**
     * 
     * 表字段 : enterprise_recharge.id
     */
    private String id;

    /**
     * 第三方交易流水号（存管账户）
     * 表字段 : enterprise_recharge.req_seq_no
     */
    private String reqSeqNo;

    /**
     * 银行账号
     * 表字段 : enterprise_recharge.bank_account_no
     */
    private String bankAccountNo;

    /**
     * 交易类型：0 收入 1支出
     * 表字段 : enterprise_recharge.trans_type
     */
    private String transType;

    /**
     * 对方账号
     * 表字段 : enterprise_recharge.opp_account_no
     */
    private String oppAccountNo;

    /**
     * 对方户名
     * 表字段 : enterprise_recharge.opp_account_name
     */
    private String oppAccountName;

    /**
     * 对方开户行
     * 表字段 : enterprise_recharge.opp_acc_open_bank_no
     */
    private String oppAccOpenBankNo;

    /**
     * 对方账户开户行名称
     * 表字段 : enterprise_recharge.opp_acc_open_bank_name
     */
    private String oppAccOpenBankName;

    /**
     * 附言
     * 表字段 : enterprise_recharge.post_script
     */
    private String postScript;

    /**
     * 备注
     * 表字段 : enterprise_recharge.comments
     */
    private String comments;

    /**
     * 摘要
     * 表字段 : enterprise_recharge.summary_info
     */
    private String summaryInfo;

    /**
     * 摘要码对应的中文描述
     * 表字段 : enterprise_recharge.summary_info_msg
     */
    private String summaryInfoMsg;

    /**
     * 交易金额
     * 表字段 : enterprise_recharge.amount
     */
    private String amount;

    /**
     * 交易日期
     * 表字段 : enterprise_recharge.trans_date
     */
    private String transDate;

    /**
     * 备用字段1
     * 表字段 : enterprise_recharge.ext_filed_1
     */
    private String extFiled1;

    /**
     * 备用字段2
     * 表字段 : enterprise_recharge.ext_field_2
     */
    private String extField2;

    /**
     * 备用字段3
     * 表字段 : enterprise_recharge.ext_field_3
     */
    private String extField3;

    /**
     * 收到回调结果时间
     * 表字段 : enterprise_recharge.callback_date
     */
    private Date callbackDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table enterprise_recharge
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:enterprise_recharge.id
     *
     * @return enterprise_recharge.id, 
     */
    public String getId() {
        return id;
    }

    /**
     * 设置  字段:enterprise_recharge.id
     *
     * @param id the value for enterprise_recharge.id, 
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取 第三方交易流水号（存管账户） 字段:enterprise_recharge.req_seq_no
     *
     * @return enterprise_recharge.req_seq_no, 第三方交易流水号（存管账户）
     */
    public String getReqSeqNo() {
        return reqSeqNo;
    }

    /**
     * 设置 第三方交易流水号（存管账户） 字段:enterprise_recharge.req_seq_no
     *
     * @param reqSeqNo the value for enterprise_recharge.req_seq_no, 第三方交易流水号（存管账户）
     */
    public void setReqSeqNo(String reqSeqNo) {
        this.reqSeqNo = reqSeqNo == null ? null : reqSeqNo.trim();
    }

    /**
     * 获取 银行账号 字段:enterprise_recharge.bank_account_no
     *
     * @return enterprise_recharge.bank_account_no, 银行账号
     */
    public String getBankAccountNo() {
        return bankAccountNo;
    }

    /**
     * 设置 银行账号 字段:enterprise_recharge.bank_account_no
     *
     * @param bankAccountNo the value for enterprise_recharge.bank_account_no, 银行账号
     */
    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo == null ? null : bankAccountNo.trim();
    }

    /**
     * 获取 交易类型：0 收入 1支出 字段:enterprise_recharge.trans_type
     *
     * @return enterprise_recharge.trans_type, 交易类型：0 收入 1支出
     */
    public String getTransType() {
        return transType;
    }

    /**
     * 设置 交易类型：0 收入 1支出 字段:enterprise_recharge.trans_type
     *
     * @param transType the value for enterprise_recharge.trans_type, 交易类型：0 收入 1支出
     */
    public void setTransType(String transType) {
        this.transType = transType == null ? null : transType.trim();
    }

    /**
     * 获取 对方账号 字段:enterprise_recharge.opp_account_no
     *
     * @return enterprise_recharge.opp_account_no, 对方账号
     */
    public String getOppAccountNo() {
        return oppAccountNo;
    }

    /**
     * 设置 对方账号 字段:enterprise_recharge.opp_account_no
     *
     * @param oppAccountNo the value for enterprise_recharge.opp_account_no, 对方账号
     */
    public void setOppAccountNo(String oppAccountNo) {
        this.oppAccountNo = oppAccountNo == null ? null : oppAccountNo.trim();
    }

    /**
     * 获取 对方户名 字段:enterprise_recharge.opp_account_name
     *
     * @return enterprise_recharge.opp_account_name, 对方户名
     */
    public String getOppAccountName() {
        return oppAccountName;
    }

    /**
     * 设置 对方户名 字段:enterprise_recharge.opp_account_name
     *
     * @param oppAccountName the value for enterprise_recharge.opp_account_name, 对方户名
     */
    public void setOppAccountName(String oppAccountName) {
        this.oppAccountName = oppAccountName == null ? null : oppAccountName.trim();
    }

    /**
     * 获取 对方开户行 字段:enterprise_recharge.opp_acc_open_bank_no
     *
     * @return enterprise_recharge.opp_acc_open_bank_no, 对方开户行
     */
    public String getOppAccOpenBankNo() {
        return oppAccOpenBankNo;
    }

    /**
     * 设置 对方开户行 字段:enterprise_recharge.opp_acc_open_bank_no
     *
     * @param oppAccOpenBankNo the value for enterprise_recharge.opp_acc_open_bank_no, 对方开户行
     */
    public void setOppAccOpenBankNo(String oppAccOpenBankNo) {
        this.oppAccOpenBankNo = oppAccOpenBankNo == null ? null : oppAccOpenBankNo.trim();
    }

    /**
     * 获取 对方账户开户行名称 字段:enterprise_recharge.opp_acc_open_bank_name
     *
     * @return enterprise_recharge.opp_acc_open_bank_name, 对方账户开户行名称
     */
    public String getOppAccOpenBankName() {
        return oppAccOpenBankName;
    }

    /**
     * 设置 对方账户开户行名称 字段:enterprise_recharge.opp_acc_open_bank_name
     *
     * @param oppAccOpenBankName the value for enterprise_recharge.opp_acc_open_bank_name, 对方账户开户行名称
     */
    public void setOppAccOpenBankName(String oppAccOpenBankName) {
        this.oppAccOpenBankName = oppAccOpenBankName == null ? null : oppAccOpenBankName.trim();
    }

    /**
     * 获取 附言 字段:enterprise_recharge.post_script
     *
     * @return enterprise_recharge.post_script, 附言
     */
    public String getPostScript() {
        return postScript;
    }

    /**
     * 设置 附言 字段:enterprise_recharge.post_script
     *
     * @param postScript the value for enterprise_recharge.post_script, 附言
     */
    public void setPostScript(String postScript) {
        this.postScript = postScript == null ? null : postScript.trim();
    }

    /**
     * 获取 备注 字段:enterprise_recharge.comments
     *
     * @return enterprise_recharge.comments, 备注
     */
    public String getComments() {
        return comments;
    }

    /**
     * 设置 备注 字段:enterprise_recharge.comments
     *
     * @param comments the value for enterprise_recharge.comments, 备注
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    /**
     * 获取 摘要 字段:enterprise_recharge.summary_info
     *
     * @return enterprise_recharge.summary_info, 摘要
     */
    public String getSummaryInfo() {
        return summaryInfo;
    }

    /**
     * 设置 摘要 字段:enterprise_recharge.summary_info
     *
     * @param summaryInfo the value for enterprise_recharge.summary_info, 摘要
     */
    public void setSummaryInfo(String summaryInfo) {
        this.summaryInfo = summaryInfo == null ? null : summaryInfo.trim();
    }

    /**
     * 获取 摘要码对应的中文描述 字段:enterprise_recharge.summary_info_msg
     *
     * @return enterprise_recharge.summary_info_msg, 摘要码对应的中文描述
     */
    public String getSummaryInfoMsg() {
        return summaryInfoMsg;
    }

    /**
     * 设置 摘要码对应的中文描述 字段:enterprise_recharge.summary_info_msg
     *
     * @param summaryInfoMsg the value for enterprise_recharge.summary_info_msg, 摘要码对应的中文描述
     */
    public void setSummaryInfoMsg(String summaryInfoMsg) {
        this.summaryInfoMsg = summaryInfoMsg == null ? null : summaryInfoMsg.trim();
    }

    /**
     * 获取 交易金额 字段:enterprise_recharge.amount
     *
     * @return enterprise_recharge.amount, 交易金额
     */
    public String getAmount() {
        return amount;
    }

    /**
     * 设置 交易金额 字段:enterprise_recharge.amount
     *
     * @param amount the value for enterprise_recharge.amount, 交易金额
     */
    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    /**
     * 获取 交易日期 字段:enterprise_recharge.trans_date
     *
     * @return enterprise_recharge.trans_date, 交易日期
     */
    public String getTransDate() {
        return transDate;
    }

    /**
     * 设置 交易日期 字段:enterprise_recharge.trans_date
     *
     * @param transDate the value for enterprise_recharge.trans_date, 交易日期
     */
    public void setTransDate(String transDate) {
        this.transDate = transDate == null ? null : transDate.trim();
    }

    /**
     * 获取 备用字段1 字段:enterprise_recharge.ext_filed_1
     *
     * @return enterprise_recharge.ext_filed_1, 备用字段1
     */
    public String getExtFiled1() {
        return extFiled1;
    }

    /**
     * 设置 备用字段1 字段:enterprise_recharge.ext_filed_1
     *
     * @param extFiled1 the value for enterprise_recharge.ext_filed_1, 备用字段1
     */
    public void setExtFiled1(String extFiled1) {
        this.extFiled1 = extFiled1 == null ? null : extFiled1.trim();
    }

    /**
     * 获取 备用字段2 字段:enterprise_recharge.ext_field_2
     *
     * @return enterprise_recharge.ext_field_2, 备用字段2
     */
    public String getExtField2() {
        return extField2;
    }

    /**
     * 设置 备用字段2 字段:enterprise_recharge.ext_field_2
     *
     * @param extField2 the value for enterprise_recharge.ext_field_2, 备用字段2
     */
    public void setExtField2(String extField2) {
        this.extField2 = extField2 == null ? null : extField2.trim();
    }

    /**
     * 获取 备用字段3 字段:enterprise_recharge.ext_field_3
     *
     * @return enterprise_recharge.ext_field_3, 备用字段3
     */
    public String getExtField3() {
        return extField3;
    }

    /**
     * 设置 备用字段3 字段:enterprise_recharge.ext_field_3
     *
     * @param extField3 the value for enterprise_recharge.ext_field_3, 备用字段3
     */
    public void setExtField3(String extField3) {
        this.extField3 = extField3 == null ? null : extField3.trim();
    }

    /**
     * 获取 收到回调结果时间 字段:enterprise_recharge.callback_date
     *
     * @return enterprise_recharge.callback_date, 收到回调结果时间
     */
    public Date getCallbackDate() {
        return callbackDate;
    }

    /**
     * 设置 收到回调结果时间 字段:enterprise_recharge.callback_date
     *
     * @param callbackDate the value for enterprise_recharge.callback_date, 收到回调结果时间
     */
    public void setCallbackDate(Date callbackDate) {
        this.callbackDate = callbackDate;
    }

    /**
     * ,enterprise_recharge
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", reqSeqNo=").append(reqSeqNo);
        sb.append(", bankAccountNo=").append(bankAccountNo);
        sb.append(", transType=").append(transType);
        sb.append(", oppAccountNo=").append(oppAccountNo);
        sb.append(", oppAccountName=").append(oppAccountName);
        sb.append(", oppAccOpenBankNo=").append(oppAccOpenBankNo);
        sb.append(", oppAccOpenBankName=").append(oppAccOpenBankName);
        sb.append(", postScript=").append(postScript);
        sb.append(", comments=").append(comments);
        sb.append(", summaryInfo=").append(summaryInfo);
        sb.append(", summaryInfoMsg=").append(summaryInfoMsg);
        sb.append(", amount=").append(amount);
        sb.append(", transDate=").append(transDate);
        sb.append(", extFiled1=").append(extFiled1);
        sb.append(", extField2=").append(extField2);
        sb.append(", extField3=").append(extField3);
        sb.append(", callbackDate=").append(callbackDate);
        sb.append("]");
        return sb.toString();
    }
}