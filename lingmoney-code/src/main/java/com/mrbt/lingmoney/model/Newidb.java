package com.mrbt.lingmoney.model;

import java.io.Serializable;

public class Newidb implements Serializable {
    /**
     * 企业名称
     * 表字段 : newidb.comp_name
     */
    private String compName;

    /**
     * 部门
     * 表字段 : newidb.department
     */
    private String department;

    /**
     * 
     * 表字段 : newidb.employee_name
     */
    private String employeeName;

    /**
     * 
     * 表字段 : newidb.employeeID
     */
    private String employeeid;

    /**
     * 绑定手机(可用于登录)
     * 表字段 : newidb.telephone
     */
    private String telephone;

    /**
     * 姓名
     * 表字段 : newidb.name
     */
    private String name;

    /**
     * 推荐码
     * 表字段 : newidb.referral_code
     */
    private String referralCode;

    /**
     * 
     * 表字段 : newidb.u_id
     */
    private String uId;

    /**
     * 
     * 表字段 : newidb.referral_id
     */
    private String referralId;

    /**
     * 
     * 表字段 : newidb.level
     */
    private String level;

    /**
     * 
     * 表字段 : newidb.birthday
     */
    private String birthday;

    /**
     * 
     * 表字段 : newidb.age
     */
    private Double age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table newidb
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 企业名称 字段:newidb.comp_name
     *
     * @return newidb.comp_name, 企业名称
     */
    public String getCompName() {
        return compName;
    }

    /**
     * 设置 企业名称 字段:newidb.comp_name
     *
     * @param compName the value for newidb.comp_name, 企业名称
     */
    public void setCompName(String compName) {
        this.compName = compName == null ? null : compName.trim();
    }

    /**
     * 获取 部门 字段:newidb.department
     *
     * @return newidb.department, 部门
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置 部门 字段:newidb.department
     *
     * @param department the value for newidb.department, 部门
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    /**
     * 获取  字段:newidb.employee_name
     *
     * @return newidb.employee_name, 
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * 设置  字段:newidb.employee_name
     *
     * @param employeeName the value for newidb.employee_name, 
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    /**
     * 获取  字段:newidb.employeeID
     *
     * @return newidb.employeeID, 
     */
    public String getEmployeeid() {
        return employeeid;
    }

    /**
     * 设置  字段:newidb.employeeID
     *
     * @param employeeid the value for newidb.employeeID, 
     */
    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid == null ? null : employeeid.trim();
    }

    /**
     * 获取 绑定手机(可用于登录) 字段:newidb.telephone
     *
     * @return newidb.telephone, 绑定手机(可用于登录)
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置 绑定手机(可用于登录) 字段:newidb.telephone
     *
     * @param telephone the value for newidb.telephone, 绑定手机(可用于登录)
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * 获取 姓名 字段:newidb.name
     *
     * @return newidb.name, 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 姓名 字段:newidb.name
     *
     * @param name the value for newidb.name, 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取 推荐码 字段:newidb.referral_code
     *
     * @return newidb.referral_code, 推荐码
     */
    public String getReferralCode() {
        return referralCode;
    }

    /**
     * 设置 推荐码 字段:newidb.referral_code
     *
     * @param referralCode the value for newidb.referral_code, 推荐码
     */
    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode == null ? null : referralCode.trim();
    }

    /**
     * 获取  字段:newidb.u_id
     *
     * @return newidb.u_id, 
     */
    public String getuId() {
        return uId;
    }

    /**
     * 设置  字段:newidb.u_id
     *
     * @param uId the value for newidb.u_id, 
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * 获取  字段:newidb.referral_id
     *
     * @return newidb.referral_id, 
     */
    public String getReferralId() {
        return referralId;
    }

    /**
     * 设置  字段:newidb.referral_id
     *
     * @param referralId the value for newidb.referral_id, 
     */
    public void setReferralId(String referralId) {
        this.referralId = referralId == null ? null : referralId.trim();
    }

    /**
     * 获取  字段:newidb.level
     *
     * @return newidb.level, 
     */
    public String getLevel() {
        return level;
    }

    /**
     * 设置  字段:newidb.level
     *
     * @param level the value for newidb.level, 
     */
    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    /**
     * 获取  字段:newidb.birthday
     *
     * @return newidb.birthday, 
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置  字段:newidb.birthday
     *
     * @param birthday the value for newidb.birthday, 
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * 获取  字段:newidb.age
     *
     * @return newidb.age, 
     */
    public Double getAge() {
        return age;
    }

    /**
     * 设置  字段:newidb.age
     *
     * @param age the value for newidb.age, 
     */
    public void setAge(Double age) {
        this.age = age;
    }

    /**
     * ,newidb
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", compName=").append(compName);
        sb.append(", department=").append(department);
        sb.append(", employeeName=").append(employeeName);
        sb.append(", employeeid=").append(employeeid);
        sb.append(", telephone=").append(telephone);
        sb.append(", name=").append(name);
        sb.append(", referralCode=").append(referralCode);
        sb.append(", uId=").append(uId);
        sb.append(", referralId=").append(referralId);
        sb.append(", level=").append(level);
        sb.append(", birthday=").append(birthday);
        sb.append(", age=").append(age);
        sb.append("]");
        return sb.toString();
    }
}