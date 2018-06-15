package com.mrbt.lingmoney.model;

import java.io.Serializable;

public class WinningCount implements Serializable {
    /**
     * 
     * 表字段 : winning_count.id
     */
    private Integer id;

    /**
     * 中奖人注册手机号
     * 表字段 : winning_count.telephone
     */
    private String telephone;

    /**
     * 数据生成状态：0导入，1抽奖生成
     * 表字段 : winning_count.status
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table winning_count
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:winning_count.id
     *
     * @return winning_count.id, 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:winning_count.id
     *
     * @param id the value for winning_count.id, 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 中奖人注册手机号 字段:winning_count.telephone
     *
     * @return winning_count.telephone, 中奖人注册手机号
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置 中奖人注册手机号 字段:winning_count.telephone
     *
     * @param telephone the value for winning_count.telephone, 中奖人注册手机号
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * 获取 数据生成状态：0导入，1抽奖生成 字段:winning_count.status
     *
     * @return winning_count.status, 数据生成状态：0导入，1抽奖生成
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 数据生成状态：0导入，1抽奖生成 字段:winning_count.status
     *
     * @param status the value for winning_count.status, 数据生成状态：0导入，1抽奖生成
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * ,winning_count
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", telephone=").append(telephone);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}