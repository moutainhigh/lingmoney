package com.mrbt.lingmoney.model;

import java.io.Serializable;
import java.util.Date;

public class UsersBank implements Serializable {
	/**
	 * 银行限额
	 */
	private String upperLimit;

	/**
	 * 银行LOGO
	 */
	private String bankLogo;

	/**
	 * 银行简称
	 */
	private String bankShort;

	/**
	 * 主键 表字段 : users_bank.id
	 */
	private Integer id;

	/**
	 * 
	 * 表字段 : users_bank.u_id
	 */
	private String uId;

	/**
	 * 银行名称 表字段 : users_bank.name
	 */
	private String name;

	/**
	 * 银行卡号 表字段 : users_bank.number
	 */
	private String number;

	/**
	 * 开户行所在省 表字段 : users_bank.province
	 */
	private String province;

	/**
	 * 开户行所在市 表字段 : users_bank.city
	 */
	private String city;

	/**
	 * 开户行所在区县 表字段 : users_bank.town
	 */
	private String town;

	/**
	 * 开户行 表字段 : users_bank.bank
	 */
	private String bank;

	/**
	 * 
	 * 表字段 : users_bank.tel
	 */
	private String tel;

	/**
	 * 
	 * 表字段 : users_bank.bankcode
	 */
	private String bankcode;

	/**
	 * 
	 * 表字段 : users_bank.status
	 */
	private String status;

	/**
	 * 
	 * 表字段 : users_bank.isdefault
	 */
	private String isdefault;

	/**
	 * 绑定时间 表字段 : users_bank.bindtime
	 */
	private Date bindtime;

	/**
	 * 绑定平台 表字段 : users_bank.platform_type
	 */
	private Integer platformType;

	public String getUpperLimit() {
		return upperLimit;
	}

	public void setUpperLimit(String upperLimit) {
		this.upperLimit = upperLimit;
	}

	public String getBankLogo() {
		return bankLogo;
	}

	public void setBankLogo(String bankLogo) {
		this.bankLogo = bankLogo;
	}

	public String getBankShort() {
		return bankShort;
	}

	public void setBankShort(String bankShort) {
		this.bankShort = bankShort;
	}

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database table users_bank
	 *
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 获取 主键 字段:users_bank.id
	 *
	 * @return users_bank.id, 主键
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 设置 主键 字段:users_bank.id
	 *
	 * @param id
	 *            the value for users_bank.id, 主键
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 获取 字段:users_bank.u_id
	 *
	 * @return users_bank.u_id,
	 */
	public String getuId() {
		return uId;
	}

	/**
	 * 设置 字段:users_bank.u_id
	 *
	 * @param uId
	 *            the value for users_bank.u_id,
	 */
	public void setuId(String uId) {
		this.uId = uId == null ? null : uId.trim();
	}

	/**
	 * 获取 银行名称 字段:users_bank.name
	 *
	 * @return users_bank.name, 银行名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置 银行名称 字段:users_bank.name
	 *
	 * @param name
	 *            the value for users_bank.name, 银行名称
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * 获取 银行卡号 字段:users_bank.number
	 *
	 * @return users_bank.number, 银行卡号
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * 设置 银行卡号 字段:users_bank.number
	 *
	 * @param number
	 *            the value for users_bank.number, 银行卡号
	 */
	public void setNumber(String number) {
		this.number = number == null ? null : number.trim();
	}

	/**
	 * 获取 开户行所在省 字段:users_bank.province
	 *
	 * @return users_bank.province, 开户行所在省
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * 设置 开户行所在省 字段:users_bank.province
	 *
	 * @param province
	 *            the value for users_bank.province, 开户行所在省
	 */
	public void setProvince(String province) {
		this.province = province == null ? null : province.trim();
	}

	/**
	 * 获取 开户行所在市 字段:users_bank.city
	 *
	 * @return users_bank.city, 开户行所在市
	 */
	public String getCity() {
		return city;
	}

	/**
	 * 设置 开户行所在市 字段:users_bank.city
	 *
	 * @param city
	 *            the value for users_bank.city, 开户行所在市
	 */
	public void setCity(String city) {
		this.city = city == null ? null : city.trim();
	}

	/**
	 * 获取 开户行所在区县 字段:users_bank.town
	 *
	 * @return users_bank.town, 开户行所在区县
	 */
	public String getTown() {
		return town;
	}

	/**
	 * 设置 开户行所在区县 字段:users_bank.town
	 *
	 * @param town
	 *            the value for users_bank.town, 开户行所在区县
	 */
	public void setTown(String town) {
		this.town = town == null ? null : town.trim();
	}

	/**
	 * 获取 开户行 字段:users_bank.bank
	 *
	 * @return users_bank.bank, 开户行
	 */
	public String getBank() {
		return bank;
	}

	/**
	 * 设置 开户行 字段:users_bank.bank
	 *
	 * @param bank
	 *            the value for users_bank.bank, 开户行
	 */
	public void setBank(String bank) {
		this.bank = bank == null ? null : bank.trim();
	}

	/**
	 * 获取 字段:users_bank.tel
	 *
	 * @return users_bank.tel,
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * 设置 字段:users_bank.tel
	 *
	 * @param tel
	 *            the value for users_bank.tel,
	 */
	public void setTel(String tel) {
		this.tel = tel == null ? null : tel.trim();
	}

	/**
	 * 获取 字段:users_bank.bankcode
	 *
	 * @return users_bank.bankcode,
	 */
	public String getBankcode() {
		return bankcode;
	}

	/**
	 * 设置 字段:users_bank.bankcode
	 *
	 * @param bankcode
	 *            the value for users_bank.bankcode,
	 */
	public void setBankcode(String bankcode) {
		this.bankcode = bankcode == null ? null : bankcode.trim();
	}

	/**
	 * 获取 字段:users_bank.status
	 *
	 * @return users_bank.status,
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * 设置 字段:users_bank.status
	 *
	 * @param status
	 *            the value for users_bank.status,
	 */
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	/**
	 * 获取 字段:users_bank.isdefault
	 *
	 * @return users_bank.isdefault,
	 */
	public String getIsdefault() {
		return isdefault;
	}

	/**
	 * 设置 字段:users_bank.isdefault
	 *
	 * @param isdefault
	 *            the value for users_bank.isdefault,
	 */
	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault == null ? null : isdefault.trim();
	}

	/**
	 * 获取 绑定时间 字段:users_bank.bindtime
	 *
	 * @return users_bank.bindtime, 绑定时间
	 */
	public Date getBindtime() {
		return bindtime;
	}

	/**
	 * 设置 绑定时间 字段:users_bank.bindtime
	 *
	 * @param bindtime
	 *            the value for users_bank.bindtime, 绑定时间
	 */
	public void setBindtime(Date bindtime) {
		this.bindtime = bindtime;
	}

	/**
	 * 获取 绑定平台 字段:users_bank.platform_type
	 *
	 * @return users_bank.platform_type, 绑定平台
	 */
	public Integer getPlatformType() {
		return platformType;
	}

	/**
	 * 设置 绑定平台 字段:users_bank.platform_type
	 *
	 * @param platformType
	 *            the value for users_bank.platform_type, 绑定平台
	 */
	public void setPlatformType(Integer platformType) {
		this.platformType = platformType;
	}

	/**
	 * ,users_bank
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", uId=").append(uId);
		sb.append(", name=").append(name);
		sb.append(", number=").append(number);
		sb.append(", province=").append(province);
		sb.append(", city=").append(city);
		sb.append(", town=").append(town);
		sb.append(", bank=").append(bank);
		sb.append(", tel=").append(tel);
		sb.append(", bankcode=").append(bankcode);
		sb.append(", status=").append(status);
		sb.append(", isdefault=").append(isdefault);
		sb.append(", bindtime=").append(bindtime);
		sb.append(", platformType=").append(platformType);
		sb.append("]");
		return sb.toString();
	}

	private String userTel;// 用户手机号
	private String userName;// 用户姓名

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}