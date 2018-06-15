package com.mrbt.lingmoney.model.webView;

import java.math.BigDecimal;
import java.util.Date;

import com.mrbt.lingmoney.model.HxRedPacket;
import com.mrbt.lingmoney.model.Product;
import com.mrbt.lingmoney.model.UsersRedPacket;

/**
 * 用户理财记录展示信息
 * 
 * @author syb
 *
 */
public class TradingView implements java.io.Serializable {
	private static final long serialVersionUID = 1998806760383087706L;
	
	private int showContract;

	private double buyNetValue;
	/**
	 * 0:固定收益类，1:浮动类
	 */
	private Integer type;
	/**
	 * 0:无,1:固定不变，2:区间
	 */
	private Integer fixType;
	/**
	 * 本息,设置为字符串类型是为了格式化后在页面展示
	 */
	private String principal;
	private double runTime;
	private double lastNetValue;
	/**
	 * 1,上升，2，下降，0，没有
	 */
	private int netValueFlag;
	// 固定收益类-固定不变,理财时间
	private int dinanciaDay;
	/**
	 * 是否可用赎回标志 0 可赎回 1不可赎回
	 */
	private int redeemFlag;
	private int financialDays; // 理财天数
	private Date lastValueDt;
	/**
	 * 0：普通产品，1：随心取产品
	 */
	private int pudType;
	private BigDecimal difference; // 随心取
	/**
	 * 随心取现在档位
	 */
	private String stalls;
	/**
	 * 随心取下一当
	 */
	private String nextStalls;
	private String cardPan;
	private BigDecimal interest;
	private BigDecimal allInterest;
	private int upDay; // 距离升级利率天数
	private BigDecimal upDayRate; // 下一天数利率

	/**
	 * 支付剩余时间：毫秒数
	 */
	private long theRestTimeOfPayment;

	private Product product;
	private HxRedPacket hxRedPacket;
	private UsersRedPacket usersRedPacket;
	private BigDecimal hreatInterest;

	public BigDecimal getHreatInterest() {
		return hreatInterest;
	}

	public void setHreatInterest(BigDecimal hreatInterest) {
		this.hreatInterest = hreatInterest;
	}

	public HxRedPacket getHxRedPacket() {
		return hxRedPacket;
	}

	public void setHxRedPacket(HxRedPacket hxRedPacket) {
		this.hxRedPacket = hxRedPacket;
	}

	public UsersRedPacket getUsersRedPacket() {
		return usersRedPacket;
	}

	public void setUsersRedPacket(UsersRedPacket usersRedPacket) {
		this.usersRedPacket = usersRedPacket;
	}

	public long getTheRestTimeOfPayment() {
		return theRestTimeOfPayment;
	}

	/**
	 * 支付剩余时间（毫秒）
	 * 
	 * @param theRestTimeOfPayment
	 */
	public void setTheRestTimeOfPayment(long theRestTimeOfPayment) {
		this.theRestTimeOfPayment = theRestTimeOfPayment;
	}

	public String getStalls() {
		return stalls;
	}

	public void setStalls(String stalls) {
		this.stalls = stalls;
	}

	public String getNextStalls() {
		return nextStalls;
	}

	public void setNextStalls(String nextStalls) {
		this.nextStalls = nextStalls;
	}

	public BigDecimal getInterest() {
		return interest;
	}

	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

	public BigDecimal getAllInterest() {
		return allInterest;
	}

	public void setAllInterest(BigDecimal allInterest) {
		this.allInterest = allInterest;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column trading.id
	 *
	 * @mbggenerated Thu Jun 25 09:21:12 CST 2015
	 */

	public double getRunTime() {
		return runTime;
	}

	public void setRunTime(double runTime) {
		this.runTime = runTime;
	}

	public double getBuyNetValue() {
		return buyNetValue;
	}

	public void setBuyNetValue(double buyNetValue) {
		this.buyNetValue = buyNetValue;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getFixType() {
		return fixType;
	}

	public void setFixType(Integer fixType) {
		this.fixType = fixType;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	/*
	 * public double getBuyNetValue() { return buyNetValue; }
	 * 
	 * public void setBuyNetValue(double buyNetValue) { this.buyNetValue =
	 * buyNetValue; }
	 */
	public double getLastNetValue() {
		return lastNetValue;
	}

	public void setLastNetValue(double lastNetValue) {
		this.lastNetValue = lastNetValue;
	}

	public int getNetValueFlag() {
		return netValueFlag;
	}

	public void setNetValueFlag(int netValueFlag) {
		this.netValueFlag = netValueFlag;
	}

	public int getDinanciaDay() {
		return dinanciaDay;
	}

	public void setDinanciaDay(int dinanciaDay) {
		this.dinanciaDay = dinanciaDay;
	}

	public int getRedeemFlag() {
		return redeemFlag;
	}

	/**
	 * 是否可赎回 0 可赎回 1 不可赎回
	 * 
	 * @param redeemFlag
	 */
	public void setRedeemFlag(int redeemFlag) {
		this.redeemFlag = redeemFlag;
	}

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column trading.id
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	private Integer id;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column trading.u_id
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	private String uId;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column trading.p_id
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	private Integer pId;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column trading.p_code
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	private String pCode;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column trading.pc_type
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	private Integer pcType;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column trading.pc_id
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	private Integer pcId;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column trading.buy_money
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	private BigDecimal buyMoney;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column trading.financial_money
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	private BigDecimal financialMoney;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column trading.buy_dt
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	private Date buyDt;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column trading.value_dt
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	private Date valueDt;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column trading.w_value_dt
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	private Date wValueDt;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column trading.min_sell_dt
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	private Date minSellDt;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column trading.status
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	private Integer status;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column trading.biz_code
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	private String bizCode;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column trading.sell_dt
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	private Date sellDt;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column trading.sell_money
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	private BigDecimal sellMoney;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column trading.out_biz_code
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	private String outBizCode;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column trading.fix_invest
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	private Integer fixInvest;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column trading.auto_pay
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	private Integer autoPay;

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column trading.id
	 *
	 * @return the value of trading.id
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column trading.id
	 *
	 * @param id
	 *            the value for trading.id
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column trading.u_id
	 *
	 * @return the value of trading.u_id
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public String getuId() {
		return uId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column trading.u_id
	 *
	 * @param uId
	 *            the value for trading.u_id
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public void setuId(String uId) {
		this.uId = uId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column trading.p_id
	 *
	 * @return the value of trading.p_id
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public Integer getpId() {
		return pId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column trading.p_id
	 *
	 * @param pId
	 *            the value for trading.p_id
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public void setpId(Integer pId) {
		this.pId = pId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column trading.p_code
	 *
	 * @return the value of trading.p_code
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public String getpCode() {
		return pCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column trading.p_code
	 *
	 * @param pCode
	 *            the value for trading.p_code
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column trading.pc_type
	 *
	 * @return the value of trading.pc_type
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public Integer getPcType() {
		return pcType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column trading.pc_type
	 *
	 * @param pcType
	 *            the value for trading.pc_type
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public void setPcType(Integer pcType) {
		this.pcType = pcType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column trading.pc_id
	 *
	 * @return the value of trading.pc_id
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public Integer getPcId() {
		return pcId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column trading.pc_id
	 *
	 * @param pcId
	 *            the value for trading.pc_id
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public void setPcId(Integer pcId) {
		this.pcId = pcId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column trading.buy_money
	 *
	 * @return the value of trading.buy_money
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public BigDecimal getBuyMoney() {
		return buyMoney;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column trading.buy_money
	 *
	 * @param buyMoney
	 *            the value for trading.buy_money
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public void setBuyMoney(BigDecimal buyMoney) {
		this.buyMoney = buyMoney;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column trading.financial_money
	 *
	 * @return the value of trading.financial_money
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public BigDecimal getFinancialMoney() {
		return financialMoney;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column trading.financial_money
	 *
	 * @param financialMoney
	 *            the value for trading.financial_money
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public void setFinancialMoney(BigDecimal financialMoney) {
		this.financialMoney = financialMoney;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column trading.buy_dt
	 *
	 * @return the value of trading.buy_dt
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public Date getBuyDt() {
		return buyDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column trading.buy_dt
	 *
	 * @param buyDt
	 *            the value for trading.buy_dt
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public void setBuyDt(Date buyDt) {
		this.buyDt = buyDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column trading.value_dt
	 *
	 * @return the value of trading.value_dt
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public Date getValueDt() {
		return valueDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column trading.value_dt
	 *
	 * @param valueDt
	 *            the value for trading.value_dt
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public void setValueDt(Date valueDt) {
		this.valueDt = valueDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column trading.w_value_dt
	 *
	 * @return the value of trading.w_value_dt
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public Date getwValueDt() {
		return wValueDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column trading.w_value_dt
	 *
	 * @param wValueDt
	 *            the value for trading.w_value_dt
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public void setwValueDt(Date wValueDt) {
		this.wValueDt = wValueDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column trading.min_sell_dt
	 *
	 * @return the value of trading.min_sell_dt
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public Date getMinSellDt() {
		return minSellDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column trading.min_sell_dt
	 *
	 * @param minSellDt
	 *            the value for trading.min_sell_dt
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public void setMinSellDt(Date minSellDt) {
		this.minSellDt = minSellDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column trading.status
	 *
	 * @return the value of trading.status
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column trading.status
	 *
	 * @param status
	 *            the value for trading.status
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column trading.biz_code
	 *
	 * @return the value of trading.biz_code
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public String getBizCode() {
		return bizCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column trading.biz_code
	 *
	 * @param bizCode
	 *            the value for trading.biz_code
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column trading.sell_dt
	 *
	 * @return the value of trading.sell_dt
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public Date getSellDt() {
		return sellDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column trading.sell_dt
	 *
	 * @param sellDt
	 *            the value for trading.sell_dt
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public void setSellDt(Date sellDt) {
		this.sellDt = sellDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column trading.sell_money
	 *
	 * @return the value of trading.sell_money
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public BigDecimal getSellMoney() {
		return sellMoney;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column trading.sell_money
	 *
	 * @param sellMoney
	 *            the value for trading.sell_money
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public void setSellMoney(BigDecimal sellMoney) {
		this.sellMoney = sellMoney;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column trading.out_biz_code
	 *
	 * @return the value of trading.out_biz_code
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public String getOutBizCode() {
		return outBizCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column trading.out_biz_code
	 *
	 * @param outBizCode
	 *            the value for trading.out_biz_code
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public void setOutBizCode(String outBizCode) {
		this.outBizCode = outBizCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column trading.fix_invest
	 *
	 * @return the value of trading.fix_invest
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public Integer getFixInvest() {
		return fixInvest;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column trading.fix_invest
	 *
	 * @param fixInvest
	 *            the value for trading.fix_invest
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public void setFixInvest(Integer fixInvest) {
		this.fixInvest = fixInvest;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column trading.auto_pay
	 *
	 * @return the value of trading.auto_pay
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public Integer getAutoPay() {
		return autoPay;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column trading.auto_pay
	 *
	 * @param autoPay
	 *            the value for trading.auto_pay
	 *
	 * @mbggenerated Sat Jul 11 14:49:08 CST 2015
	 */
	public void setAutoPay(Integer autoPay) {
		this.autoPay = autoPay;
	}

	public String getCardPan() {
		return cardPan;
	}

	public void setCardPan(String cardPan) {
		this.cardPan = cardPan;
	}

	public int getFinancialDays() {
		return financialDays;
	}

	public void setFinancialDays(int financialDays) {
		this.financialDays = financialDays;
	}

	public BigDecimal getDifference() {
		return difference;
	}

	public void setDifference(BigDecimal difference) {
		this.difference = difference;
	}

	public Date getLastValueDt() {
		return lastValueDt;
	}

	public void setLastValueDt(Date lastValueDt) {
		this.lastValueDt = lastValueDt;
	}

	public int getPudType() {
		return pudType;
	}

	/**
	 * 产品类型 0 普通产品 1随心取
	 * 
	 * @param pudType
	 */
	public void setPudType(int pudType) {
		this.pudType = pudType;
	}

	public int getUpDay() {
		return upDay;
	}

	public void setUpDay(int upDay) {
		this.upDay = upDay;
	}

	public BigDecimal getUpDayRate() {
		return upDayRate;
	}

	public void setUpDayRate(BigDecimal upDayRate) {
		this.upDayRate = upDayRate;
	}

    @Override
    public String toString() {
        return "TradingView [buyNetValue=" + buyNetValue + ", showContract=" + showContract + ", type=" + type + ", fixType=" + fixType + ", principal="
                + principal + ", runTime=" + runTime + ", lastNetValue=" + lastNetValue + ", netValueFlag="
                + netValueFlag + ", dinanciaDay=" + dinanciaDay + ", redeemFlag=" + redeemFlag + ", financialDays="
                + financialDays + ", lastValueDt=" + lastValueDt + ", pudType=" + pudType + ", difference="
                + difference + ", stalls=" + stalls + ", nextStalls=" + nextStalls + ", cardPan=" + cardPan
                + ", interest=" + interest + ", allInterest=" + allInterest + ", upDay=" + upDay + ", upDayRate="
                + upDayRate + ", theRestTimeOfPayment=" + theRestTimeOfPayment + ", product=" + product
                + ", hxRedPacket=" + hxRedPacket + ", usersRedPacket=" + usersRedPacket + ", id=" + id + ", uId=" + uId
                + ", pId=" + pId + ", pCode=" + pCode + ", pcType=" + pcType + ", pcId=" + pcId + ", buyMoney="
                + buyMoney + ", financialMoney=" + financialMoney + ", buyDt=" + buyDt + ", valueDt=" + valueDt
                + ", wValueDt=" + wValueDt + ", minSellDt=" + minSellDt + ", status=" + status + ", bizCode=" + bizCode
                + ", sellDt=" + sellDt + ", sellMoney=" + sellMoney + ", outBizCode=" + outBizCode + ", fixInvest="
                + fixInvest + ", autoPay=" + autoPay + "]";
    }

	public int getShowContract() {
		return showContract;
	}

	public void setShowContract(int showContract) {
		this.showContract = showContract;
	}

}