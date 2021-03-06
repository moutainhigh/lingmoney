package com.mrbt.lingmoney.model;

import java.io.Serializable;

public class ReferralEid implements Serializable {
    /**
     * 企业名称
     * 表字段 : referral_eid.comp_name
     */
    private String compName;

    /**
     * 部门
     * 表字段 : referral_eid.department
     */
    private String department;

    /**
     * 
     * 表字段 : referral_eid.employee_name
     */
    private String employeeName;

    /**
     * 
     * 表字段 : referral_eid.employeeID
     */
    private String employeeid;

    /**
     * 
     * 表字段 : referral_eid.regisId
     */
    private String regisid;

    /**
     * 
     * 表字段 : referral_eid.u_id
     */
    private String uId;

    /**
     * 绑定手机(可用于登录)
     * 表字段 : referral_eid.telephone
     */
    private String telephone;

    /**
     * 姓名
     * 表字段 : referral_eid.name
     */
    private String name;

    /**
     * 
     * 表字段 : referral_eid.level
     */
    private String level;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table referral_eid
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 企业名称 字段:referral_eid.comp_name
     *
     * @return referral_eid.comp_name, 企业名称
     */
    public String getCompName() {
        return compName;
    }

    /**
     * 设置 企业名称 字段:referral_eid.comp_name
     *
     * @param compName the value for referral_eid.comp_name, 企业名称
     */
    public void setCompName(String compName) {
        this.compName = compName == null ? null : compName.trim();
    }

    /**
     * 获取 部门 字段:referral_eid.department
     *
     * @return referral_eid.department, 部门
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置 部门 字段:referral_eid.department
     *
     * @param department the value for referral_eid.department, 部门
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    /**
     * 获取  字段:referral_eid.employee_name
     *
     * @return referral_eid.employee_name, 
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * 设置  字段:referral_eid.employee_name
     *
     * @param employeeName the value for referral_eid.employee_name, 
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    /**
     * 获取  字段:referral_eid.employeeID
     *
     * @return referral_eid.employeeID, 
     */
    public String getEmployeeid() {
        return employeeid;
    }

    /**
     * 设置  字段:referral_eid.employeeID
     *
     * @param employeeid the value for referral_eid.employeeID, 
     */
    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid == null ? null : employeeid.trim();
    }

    /**
     * 获取  字段:referral_eid.regisId
     *
     * @return referral_eid.regisId, 
     */
    public String getRegisid() {
        return regisid;
    }

    /**
     * 设置  字段:referral_eid.regisId
     *
     * @param regisid the value for referral_eid.regisId, 
     */
    public void setRegisid(String regisid) {
        this.regisid = regisid == null ? null : regisid.trim();
    }

    /**
     * 获取  字段:referral_eid.u_id
     *
     * @return referral_eid.u_id, 
     */
    public String getuId() {
        return uId;
    }

    /**
     * 设置  字段:referral_eid.u_id
     *
     * @param uId the value for referral_eid.u_id, 
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * 获取 绑定手机(可用于登录) 字段:referral_eid.telephone
     *
     * @return referral_eid.telephone, 绑定手机(可用于登录)
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置 绑定手机(可用于登录) 字段:referral_eid.telephone
     *
     * @param telephone the value for referral_eid.telephone, 绑定手机(可用于登录)
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * 获取 姓名 字段:referral_eid.name
     *
     * @return referral_eid.name, 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 姓名 字段:referral_eid.name
     *
     * @param name the value for referral_eid.name, 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取  字段:referral_eid.level
     *
     * @return referral_eid.level, 
     */
    public String getLevel() {
        return level;
    }

    /**
     * 设置  字段:referral_eid.level
     *
     * @param level the value for referral_eid.level, 
     */
    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    /**
     * ,referral_eid
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
        sb.append(", regisid=").append(regisid);
        sb.append(", uId=").append(uId);
        sb.append(", telephone=").append(telephone);
        sb.append(", name=").append(name);
        sb.append(", level=").append(level);
        sb.append("]");
        return sb.toString();
    }
}