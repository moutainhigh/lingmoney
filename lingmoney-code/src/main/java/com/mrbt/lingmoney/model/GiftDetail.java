package com.mrbt.lingmoney.model;

import java.io.Serializable;
import java.util.Date;

public class GiftDetail implements Serializable {
    /**
     * 主键
     * 表字段 : gift_detail.id
     */
    private Integer id;

    /**
     * 交易id
     * 表字段 : gift_detail.t_id
     */
    private Integer tId;

    /**
     * 产品id
     * 表字段 : gift_detail.p_id
     */
    private Integer pId;

    /**
     * 
     * 表字段 : gift_detail.u_id
     */
    private String uId;

    /**
     * 礼品id
     * 表字段 : gift_detail.g_id
     */
    private Integer gId;

    /**
     * 礼品名称
     * 表字段 : gift_detail.g_name
     */
    private String gName;

    /**
     * 份数
     * 表字段 : gift_detail.share
     */
    private Integer share;

    /**
     * 0.未发送，1已发送
     * 表字段 : gift_detail.state
     */
    private Integer state;

    /**
     * 创建日期
     * 表字段 : gift_detail.create_time
     */
    private Date createTime;

    /**
     * 发货时间
     * 表字段 : gift_detail.send_time
     */
    private Date sendTime;

    /**
     * 收货时间
     * 表字段 : gift_detail.receive_time
     */
    private Date receiveTime;

    /**
     * 充值卡号
     * 表字段 : gift_detail.recharge_account
     */
    private String rechargeAccount;

    /**
     * 充值卡密码
     * 表字段 : gift_detail.recharge_code
     */
    private String rechargeCode;

    /**
     * 充值手机号码
     * 表字段 : gift_detail.mobile
     */
    private String mobile;

    /**
     * 关联领宝礼品id
     * 表字段 : gift_detail.lingbao_gift_id
     */
    private Integer lingbaoGiftId;

    /**
     * 快递单号
     * 表字段 : gift_detail.express_number
     */
    private String expressNumber;

    /**
     * 快递公司名称
     * 表字段 : gift_detail.express_company
     */
    private String expressCompany;

    /**
     * 描述信息
     * 表字段 : gift_detail.g_desc
     */
    private String gDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table gift_detail
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 主键 字段:gift_detail.id
     *
     * @return gift_detail.id, 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 主键 字段:gift_detail.id
     *
     * @param id the value for gift_detail.id, 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 交易id 字段:gift_detail.t_id
     *
     * @return gift_detail.t_id, 交易id
     */
    public Integer gettId() {
        return tId;
    }

    /**
     * 设置 交易id 字段:gift_detail.t_id
     *
     * @param tId the value for gift_detail.t_id, 交易id
     */
    public void settId(Integer tId) {
        this.tId = tId;
    }

    /**
     * 获取 产品id 字段:gift_detail.p_id
     *
     * @return gift_detail.p_id, 产品id
     */
    public Integer getpId() {
        return pId;
    }

    /**
     * 设置 产品id 字段:gift_detail.p_id
     *
     * @param pId the value for gift_detail.p_id, 产品id
     */
    public void setpId(Integer pId) {
        this.pId = pId;
    }

    /**
     * 获取  字段:gift_detail.u_id
     *
     * @return gift_detail.u_id, 
     */
    public String getuId() {
        return uId;
    }

    /**
     * 设置  字段:gift_detail.u_id
     *
     * @param uId the value for gift_detail.u_id, 
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * 获取 礼品id 字段:gift_detail.g_id
     *
     * @return gift_detail.g_id, 礼品id
     */
    public Integer getgId() {
        return gId;
    }

    /**
     * 设置 礼品id 字段:gift_detail.g_id
     *
     * @param gId the value for gift_detail.g_id, 礼品id
     */
    public void setgId(Integer gId) {
        this.gId = gId;
    }

    /**
     * 获取 礼品名称 字段:gift_detail.g_name
     *
     * @return gift_detail.g_name, 礼品名称
     */
    public String getgName() {
        return gName;
    }

    /**
     * 设置 礼品名称 字段:gift_detail.g_name
     *
     * @param gName the value for gift_detail.g_name, 礼品名称
     */
    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    /**
     * 获取 份数 字段:gift_detail.share
     *
     * @return gift_detail.share, 份数
     */
    public Integer getShare() {
        return share;
    }

    /**
     * 设置 份数 字段:gift_detail.share
     *
     * @param share the value for gift_detail.share, 份数
     */
    public void setShare(Integer share) {
        this.share = share;
    }

    /**
     * 获取 0.未发送，1已发送 字段:gift_detail.state
     *
     * @return gift_detail.state, 0.未发送，1已发送
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置 0.未发送，1已发送 字段:gift_detail.state
     *
     * @param state the value for gift_detail.state, 0.未发送，1已发送
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取 创建日期 字段:gift_detail.create_time
     *
     * @return gift_detail.create_time, 创建日期
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建日期 字段:gift_detail.create_time
     *
     * @param createTime the value for gift_detail.create_time, 创建日期
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 发货时间 字段:gift_detail.send_time
     *
     * @return gift_detail.send_time, 发货时间
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * 设置 发货时间 字段:gift_detail.send_time
     *
     * @param sendTime the value for gift_detail.send_time, 发货时间
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * 获取 收货时间 字段:gift_detail.receive_time
     *
     * @return gift_detail.receive_time, 收货时间
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * 设置 收货时间 字段:gift_detail.receive_time
     *
     * @param receiveTime the value for gift_detail.receive_time, 收货时间
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * 获取 充值卡号 字段:gift_detail.recharge_account
     *
     * @return gift_detail.recharge_account, 充值卡号
     */
    public String getRechargeAccount() {
        return rechargeAccount;
    }

    /**
     * 设置 充值卡号 字段:gift_detail.recharge_account
     *
     * @param rechargeAccount the value for gift_detail.recharge_account, 充值卡号
     */
    public void setRechargeAccount(String rechargeAccount) {
        this.rechargeAccount = rechargeAccount == null ? null : rechargeAccount.trim();
    }

    /**
     * 获取 充值卡密码 字段:gift_detail.recharge_code
     *
     * @return gift_detail.recharge_code, 充值卡密码
     */
    public String getRechargeCode() {
        return rechargeCode;
    }

    /**
     * 设置 充值卡密码 字段:gift_detail.recharge_code
     *
     * @param rechargeCode the value for gift_detail.recharge_code, 充值卡密码
     */
    public void setRechargeCode(String rechargeCode) {
        this.rechargeCode = rechargeCode == null ? null : rechargeCode.trim();
    }

    /**
     * 获取 充值手机号码 字段:gift_detail.mobile
     *
     * @return gift_detail.mobile, 充值手机号码
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置 充值手机号码 字段:gift_detail.mobile
     *
     * @param mobile the value for gift_detail.mobile, 充值手机号码
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 获取 关联领宝礼品id 字段:gift_detail.lingbao_gift_id
     *
     * @return gift_detail.lingbao_gift_id, 关联领宝礼品id
     */
    public Integer getLingbaoGiftId() {
        return lingbaoGiftId;
    }

    /**
     * 设置 关联领宝礼品id 字段:gift_detail.lingbao_gift_id
     *
     * @param lingbaoGiftId the value for gift_detail.lingbao_gift_id, 关联领宝礼品id
     */
    public void setLingbaoGiftId(Integer lingbaoGiftId) {
        this.lingbaoGiftId = lingbaoGiftId;
    }

    /**
     * 获取 快递单号 字段:gift_detail.express_number
     *
     * @return gift_detail.express_number, 快递单号
     */
    public String getExpressNumber() {
        return expressNumber;
    }

    /**
     * 设置 快递单号 字段:gift_detail.express_number
     *
     * @param expressNumber the value for gift_detail.express_number, 快递单号
     */
    public void setExpressNumber(String expressNumber) {
        this.expressNumber = expressNumber == null ? null : expressNumber.trim();
    }

    /**
     * 获取 快递公司名称 字段:gift_detail.express_company
     *
     * @return gift_detail.express_company, 快递公司名称
     */
    public String getExpressCompany() {
        return expressCompany;
    }

    /**
     * 设置 快递公司名称 字段:gift_detail.express_company
     *
     * @param expressCompany the value for gift_detail.express_company, 快递公司名称
     */
    public void setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany == null ? null : expressCompany.trim();
    }

    /**
     * 获取 描述信息 字段:gift_detail.g_desc
     *
     * @return gift_detail.g_desc, 描述信息
     */
    public String getgDesc() {
        return gDesc;
    }

    /**
     * 设置 描述信息 字段:gift_detail.g_desc
     *
     * @param gDesc the value for gift_detail.g_desc, 描述信息
     */
    public void setgDesc(String gDesc) {
        this.gDesc = gDesc == null ? null : gDesc.trim();
    }

    /**
     * ,gift_detail
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tId=").append(tId);
        sb.append(", pId=").append(pId);
        sb.append(", uId=").append(uId);
        sb.append(", gId=").append(gId);
        sb.append(", gName=").append(gName);
        sb.append(", share=").append(share);
        sb.append(", state=").append(state);
        sb.append(", createTime=").append(createTime);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", receiveTime=").append(receiveTime);
        sb.append(", rechargeAccount=").append(rechargeAccount);
        sb.append(", rechargeCode=").append(rechargeCode);
        sb.append(", mobile=").append(mobile);
        sb.append(", lingbaoGiftId=").append(lingbaoGiftId);
        sb.append(", expressNumber=").append(expressNumber);
        sb.append(", expressCompany=").append(expressCompany);
        sb.append(", gDesc=").append(gDesc);
        sb.append("]");
        return sb.toString();
    }
}