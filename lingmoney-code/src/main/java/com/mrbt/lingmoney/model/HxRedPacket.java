package com.mrbt.lingmoney.model;

import java.io.Serializable;
import java.util.Date;

public class HxRedPacket implements Serializable {
    /**
     * 数据ID
     * 表字段 : hx_red_packet.id
     */
    private String id;

    /**
     * 类型：1-加息券，2-返现红包
     * 表字段 : hx_red_packet.hrp_type
     */
    private Integer hrpType;

    /**
     * 名称，反显的名称
     * 表字段 : hx_red_packet.hrp_name
     */
    private String hrpName;

    /**
     * 备注：用于返现使用描述信息，JSON数组格式
     * 表字段 : hx_red_packet.hrp_remarks
     */
    private String hrpRemarks;

    /**
     * 使用描述信息，用于在使用了加息券或红包后，的提示信息，如：产品成立后红包自动返现到账户余额中
     * 表字段 : hx_red_packet.hrp_doc
     */
    private String hrpDoc;

    /**
     * 金额、比例，红包为具体金额，加息券为百分比小数
     * 表字段 : hx_red_packet.hrp_number
     */
    private Double hrpNumber;

    /**
     * 发布状态：0-初始化，1-发布，2-下线

     * 表字段 : hx_red_packet.status
     */
    private Integer status;

    /**
     * 获取方式：0-手动，1-注册后，2-开通E账户后，3-激活E账户后，4-首次理财后，5-理财后
     * 表字段 : hx_red_packet.acquis_mode
     */
    private Integer acquisMode;

    /**
     * 赠送开始时间
     * 表字段 : hx_red_packet.a_start_time
     */
    private Date aStartTime;

    /**
     * 赠送结束时间
     * 表字段 : hx_red_packet.a_end_time
     */
    private Date aEndTime;

    /**
     * 赠送产品批次
     * 表字段 : hx_red_packet.a_invest_pro_batch
     */
    private String aInvestProBatch;

    /**
     * 赠送产品类型
     * 表字段 : hx_red_packet.a_invest_pro_type
     */
    private String aInvestProType;

    /**
     * 赠送产品期限
     * 表字段 : hx_red_packet.a_invest_pro_day
     */
    private Integer aInvestProDay;

    /**
     * 赠送产品理财金额
     * 表字段 : hx_red_packet.a_invest_pro_amount
     */
    private Double aInvestProAmount;

    /**
     * 使用有效期，如果delayed字段不为空，无效，如果为空，有效
     * 表字段 : hx_red_packet.validity_time
     */
    private Date validityTime;

    /**
     * 使用购买产品批次
     * 表字段 : hx_red_packet.u_invest_pro_batch
     */
    private String uInvestProBatch;

    /**
     * 使用购买产品类型
     * 表字段 : hx_red_packet.u_invest_pro_type
     */
    private String uInvestProType;

    /**
     * 使用优惠券产品要求的期限下限    产品期限>=u_invest_pro_day
     * 表字段 : hx_red_packet.u_invest_pro_day
     */
    private Integer uInvestProDay;

    /**
     * 使用优惠券产品要求的期限上限       产品期限<=u_invest_pro_day
     * 表字段 : hx_red_packet.u_invest_pro_mixday
     */
    private Integer uInvestProMixday;

    /**
     * 使用最底购买金额
     * 表字段 : hx_red_packet.u_invest_pro_amount
     */
    private Double uInvestProAmount;

    /**
     * 文档说明
     * 表字段 : hx_red_packet.document
     */
    private String document;

    /**
     * 使用有效期，领取之后的第几天
     * 表字段 : hx_red_packet.delayed
     */
    private Integer delayed;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hx_red_packet
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 数据ID 字段:hx_red_packet.id
     *
     * @return hx_red_packet.id, 数据ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置 数据ID 字段:hx_red_packet.id
     *
     * @param id the value for hx_red_packet.id, 数据ID
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取 类型：1-加息券，2-返现红包 字段:hx_red_packet.hrp_type
     *
     * @return hx_red_packet.hrp_type, 类型：1-加息券，2-返现红包
     */
    public Integer getHrpType() {
        return hrpType;
    }

    /**
     * 设置 类型：1-加息券，2-返现红包 字段:hx_red_packet.hrp_type
     *
     * @param hrpType the value for hx_red_packet.hrp_type, 类型：1-加息券，2-返现红包
     */
    public void setHrpType(Integer hrpType) {
        this.hrpType = hrpType;
    }

    /**
     * 获取 名称，反显的名称 字段:hx_red_packet.hrp_name
     *
     * @return hx_red_packet.hrp_name, 名称，反显的名称
     */
    public String getHrpName() {
        return hrpName;
    }

    /**
     * 设置 名称，反显的名称 字段:hx_red_packet.hrp_name
     *
     * @param hrpName the value for hx_red_packet.hrp_name, 名称，反显的名称
     */
    public void setHrpName(String hrpName) {
        this.hrpName = hrpName == null ? null : hrpName.trim();
    }

    /**
     * 获取 备注：用于返现使用描述信息，JSON数组格式 字段:hx_red_packet.hrp_remarks
     *
     * @return hx_red_packet.hrp_remarks, 备注：用于返现使用描述信息，JSON数组格式
     */
    public String getHrpRemarks() {
        return hrpRemarks;
    }

    /**
     * 设置 备注：用于返现使用描述信息，JSON数组格式 字段:hx_red_packet.hrp_remarks
     *
     * @param hrpRemarks the value for hx_red_packet.hrp_remarks, 备注：用于返现使用描述信息，JSON数组格式
     */
    public void setHrpRemarks(String hrpRemarks) {
        this.hrpRemarks = hrpRemarks == null ? null : hrpRemarks.trim();
    }

    /**
     * 获取 使用描述信息，用于在使用了加息券或红包后，的提示信息，如：产品成立后红包自动返现到账户余额中 字段:hx_red_packet.hrp_doc
     *
     * @return hx_red_packet.hrp_doc, 使用描述信息，用于在使用了加息券或红包后，的提示信息，如：产品成立后红包自动返现到账户余额中
     */
    public String getHrpDoc() {
        return hrpDoc;
    }

    /**
     * 设置 使用描述信息，用于在使用了加息券或红包后，的提示信息，如：产品成立后红包自动返现到账户余额中 字段:hx_red_packet.hrp_doc
     *
     * @param hrpDoc the value for hx_red_packet.hrp_doc, 使用描述信息，用于在使用了加息券或红包后，的提示信息，如：产品成立后红包自动返现到账户余额中
     */
    public void setHrpDoc(String hrpDoc) {
        this.hrpDoc = hrpDoc == null ? null : hrpDoc.trim();
    }

    /**
     * 获取 金额、比例，红包为具体金额，加息券为百分比小数 字段:hx_red_packet.hrp_number
     *
     * @return hx_red_packet.hrp_number, 金额、比例，红包为具体金额，加息券为百分比小数
     */
    public Double getHrpNumber() {
        return hrpNumber;
    }

    /**
     * 设置 金额、比例，红包为具体金额，加息券为百分比小数 字段:hx_red_packet.hrp_number
     *
     * @param hrpNumber the value for hx_red_packet.hrp_number, 金额、比例，红包为具体金额，加息券为百分比小数
     */
    public void setHrpNumber(Double hrpNumber) {
        this.hrpNumber = hrpNumber;
    }

    /**
     * 获取 发布状态：0-初始化，1-发布，2-下线
 字段:hx_red_packet.status
     *
     * @return hx_red_packet.status, 发布状态：0-初始化，1-发布，2-下线

     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 发布状态：0-初始化，1-发布，2-下线
 字段:hx_red_packet.status
     *
     * @param status the value for hx_red_packet.status, 发布状态：0-初始化，1-发布，2-下线

     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 获取方式：0-手动，1-注册后，2-开通E账户后，3-激活E账户后，4-首次理财后，5-理财后 字段:hx_red_packet.acquis_mode
     *
     * @return hx_red_packet.acquis_mode, 获取方式：0-手动，1-注册后，2-开通E账户后，3-激活E账户后，4-首次理财后，5-理财后
     */
    public Integer getAcquisMode() {
        return acquisMode;
    }

    /**
     * 设置 获取方式：0-手动，1-注册后，2-开通E账户后，3-激活E账户后，4-首次理财后，5-理财后 字段:hx_red_packet.acquis_mode
     *
     * @param acquisMode the value for hx_red_packet.acquis_mode, 获取方式：0-手动，1-注册后，2-开通E账户后，3-激活E账户后，4-首次理财后，5-理财后
     */
    public void setAcquisMode(Integer acquisMode) {
        this.acquisMode = acquisMode;
    }

    /**
     * 获取 赠送开始时间 字段:hx_red_packet.a_start_time
     *
     * @return hx_red_packet.a_start_time, 赠送开始时间
     */
    public Date getaStartTime() {
        return aStartTime;
    }

    /**
     * 设置 赠送开始时间 字段:hx_red_packet.a_start_time
     *
     * @param aStartTime the value for hx_red_packet.a_start_time, 赠送开始时间
     */
    public void setaStartTime(Date aStartTime) {
        this.aStartTime = aStartTime;
    }

    /**
     * 获取 赠送结束时间 字段:hx_red_packet.a_end_time
     *
     * @return hx_red_packet.a_end_time, 赠送结束时间
     */
    public Date getaEndTime() {
        return aEndTime;
    }

    /**
     * 设置 赠送结束时间 字段:hx_red_packet.a_end_time
     *
     * @param aEndTime the value for hx_red_packet.a_end_time, 赠送结束时间
     */
    public void setaEndTime(Date aEndTime) {
        this.aEndTime = aEndTime;
    }

    /**
     * 获取 赠送产品批次 字段:hx_red_packet.a_invest_pro_batch
     *
     * @return hx_red_packet.a_invest_pro_batch, 赠送产品批次
     */
    public String getaInvestProBatch() {
        return aInvestProBatch;
    }

    /**
     * 设置 赠送产品批次 字段:hx_red_packet.a_invest_pro_batch
     *
     * @param aInvestProBatch the value for hx_red_packet.a_invest_pro_batch, 赠送产品批次
     */
    public void setaInvestProBatch(String aInvestProBatch) {
        this.aInvestProBatch = aInvestProBatch == null ? null : aInvestProBatch.trim();
    }

    /**
     * 获取 赠送产品类型 字段:hx_red_packet.a_invest_pro_type
     *
     * @return hx_red_packet.a_invest_pro_type, 赠送产品类型
     */
    public String getaInvestProType() {
        return aInvestProType;
    }

    /**
     * 设置 赠送产品类型 字段:hx_red_packet.a_invest_pro_type
     *
     * @param aInvestProType the value for hx_red_packet.a_invest_pro_type, 赠送产品类型
     */
    public void setaInvestProType(String aInvestProType) {
        this.aInvestProType = aInvestProType == null ? null : aInvestProType.trim();
    }

    /**
     * 获取 赠送产品期限 字段:hx_red_packet.a_invest_pro_day
     *
     * @return hx_red_packet.a_invest_pro_day, 赠送产品期限
     */
    public Integer getaInvestProDay() {
        return aInvestProDay;
    }

    /**
     * 设置 赠送产品期限 字段:hx_red_packet.a_invest_pro_day
     *
     * @param aInvestProDay the value for hx_red_packet.a_invest_pro_day, 赠送产品期限
     */
    public void setaInvestProDay(Integer aInvestProDay) {
        this.aInvestProDay = aInvestProDay;
    }

    /**
     * 获取 赠送产品理财金额 字段:hx_red_packet.a_invest_pro_amount
     *
     * @return hx_red_packet.a_invest_pro_amount, 赠送产品理财金额
     */
    public Double getaInvestProAmount() {
        return aInvestProAmount;
    }

    /**
     * 设置 赠送产品理财金额 字段:hx_red_packet.a_invest_pro_amount
     *
     * @param aInvestProAmount the value for hx_red_packet.a_invest_pro_amount, 赠送产品理财金额
     */
    public void setaInvestProAmount(Double aInvestProAmount) {
        this.aInvestProAmount = aInvestProAmount;
    }

    /**
     * 获取 使用有效期，如果delayed字段不为空，无效，如果为空，有效 字段:hx_red_packet.validity_time
     *
     * @return hx_red_packet.validity_time, 使用有效期，如果delayed字段不为空，无效，如果为空，有效
     */
    public Date getValidityTime() {
        return validityTime;
    }

    /**
     * 设置 使用有效期，如果delayed字段不为空，无效，如果为空，有效 字段:hx_red_packet.validity_time
     *
     * @param validityTime the value for hx_red_packet.validity_time, 使用有效期，如果delayed字段不为空，无效，如果为空，有效
     */
    public void setValidityTime(Date validityTime) {
        this.validityTime = validityTime;
    }

    /**
     * 获取 使用购买产品批次 字段:hx_red_packet.u_invest_pro_batch
     *
     * @return hx_red_packet.u_invest_pro_batch, 使用购买产品批次
     */
    public String getuInvestProBatch() {
        return uInvestProBatch;
    }

    /**
     * 设置 使用购买产品批次 字段:hx_red_packet.u_invest_pro_batch
     *
     * @param uInvestProBatch the value for hx_red_packet.u_invest_pro_batch, 使用购买产品批次
     */
    public void setuInvestProBatch(String uInvestProBatch) {
        this.uInvestProBatch = uInvestProBatch == null ? null : uInvestProBatch.trim();
    }

    /**
     * 获取 使用购买产品类型 字段:hx_red_packet.u_invest_pro_type
     *
     * @return hx_red_packet.u_invest_pro_type, 使用购买产品类型
     */
    public String getuInvestProType() {
        return uInvestProType;
    }

    /**
     * 设置 使用购买产品类型 字段:hx_red_packet.u_invest_pro_type
     *
     * @param uInvestProType the value for hx_red_packet.u_invest_pro_type, 使用购买产品类型
     */
    public void setuInvestProType(String uInvestProType) {
        this.uInvestProType = uInvestProType == null ? null : uInvestProType.trim();
    }

    /**
     * 获取 使用优惠券产品要求的期限下限    产品期限>=u_invest_pro_day 字段:hx_red_packet.u_invest_pro_day
     *
     * @return hx_red_packet.u_invest_pro_day, 使用优惠券产品要求的期限下限    产品期限>=u_invest_pro_day
     */
    public Integer getuInvestProDay() {
        return uInvestProDay;
    }

    /**
     * 设置 使用优惠券产品要求的期限下限    产品期限>=u_invest_pro_day 字段:hx_red_packet.u_invest_pro_day
     *
     * @param uInvestProDay the value for hx_red_packet.u_invest_pro_day, 使用优惠券产品要求的期限下限    产品期限>=u_invest_pro_day
     */
    public void setuInvestProDay(Integer uInvestProDay) {
        this.uInvestProDay = uInvestProDay;
    }

    /**
     * 获取 使用优惠券产品要求的期限上限       产品期限<=u_invest_pro_day 字段:hx_red_packet.u_invest_pro_mixday
     *
     * @return hx_red_packet.u_invest_pro_mixday, 使用优惠券产品要求的期限上限       产品期限<=u_invest_pro_day
     */
    public Integer getuInvestProMixday() {
        return uInvestProMixday;
    }

    /**
     * 设置 使用优惠券产品要求的期限上限       产品期限<=u_invest_pro_day 字段:hx_red_packet.u_invest_pro_mixday
     *
     * @param uInvestProMixday the value for hx_red_packet.u_invest_pro_mixday, 使用优惠券产品要求的期限上限       产品期限<=u_invest_pro_day
     */
    public void setuInvestProMixday(Integer uInvestProMixday) {
        this.uInvestProMixday = uInvestProMixday;
    }

    /**
     * 获取 使用最底购买金额 字段:hx_red_packet.u_invest_pro_amount
     *
     * @return hx_red_packet.u_invest_pro_amount, 使用最底购买金额
     */
    public Double getuInvestProAmount() {
        return uInvestProAmount;
    }

    /**
     * 设置 使用最底购买金额 字段:hx_red_packet.u_invest_pro_amount
     *
     * @param uInvestProAmount the value for hx_red_packet.u_invest_pro_amount, 使用最底购买金额
     */
    public void setuInvestProAmount(Double uInvestProAmount) {
        this.uInvestProAmount = uInvestProAmount;
    }

    /**
     * 获取 文档说明 字段:hx_red_packet.document
     *
     * @return hx_red_packet.document, 文档说明
     */
    public String getDocument() {
        return document;
    }

    /**
     * 设置 文档说明 字段:hx_red_packet.document
     *
     * @param document the value for hx_red_packet.document, 文档说明
     */
    public void setDocument(String document) {
        this.document = document == null ? null : document.trim();
    }

    /**
     * 获取 使用有效期，领取之后的第几天 字段:hx_red_packet.delayed
     *
     * @return hx_red_packet.delayed, 使用有效期，领取之后的第几天
     */
    public Integer getDelayed() {
        return delayed;
    }

    /**
     * 设置 使用有效期，领取之后的第几天 字段:hx_red_packet.delayed
     *
     * @param delayed the value for hx_red_packet.delayed, 使用有效期，领取之后的第几天
     */
    public void setDelayed(Integer delayed) {
        this.delayed = delayed;
    }

    /**
     * ,hx_red_packet
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", hrpType=").append(hrpType);
        sb.append(", hrpName=").append(hrpName);
        sb.append(", hrpRemarks=").append(hrpRemarks);
        sb.append(", hrpDoc=").append(hrpDoc);
        sb.append(", hrpNumber=").append(hrpNumber);
        sb.append(", status=").append(status);
        sb.append(", acquisMode=").append(acquisMode);
        sb.append(", aStartTime=").append(aStartTime);
        sb.append(", aEndTime=").append(aEndTime);
        sb.append(", aInvestProBatch=").append(aInvestProBatch);
        sb.append(", aInvestProType=").append(aInvestProType);
        sb.append(", aInvestProDay=").append(aInvestProDay);
        sb.append(", aInvestProAmount=").append(aInvestProAmount);
        sb.append(", validityTime=").append(validityTime);
        sb.append(", uInvestProBatch=").append(uInvestProBatch);
        sb.append(", uInvestProType=").append(uInvestProType);
        sb.append(", uInvestProDay=").append(uInvestProDay);
        sb.append(", uInvestProMixday=").append(uInvestProMixday);
        sb.append(", uInvestProAmount=").append(uInvestProAmount);
        sb.append(", document=").append(document);
        sb.append(", delayed=").append(delayed);
        sb.append("]");
        return sb.toString();
    }
}