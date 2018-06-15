package com.mrbt.lingmoney.model;

import java.io.Serializable;
import java.util.Date;

public class InfoClientFeedback implements Serializable {
    /**
     * 主键
     * 表字段 : info_client_feedback.id
     */
    private Integer id;

    /**
     * 
     * 表字段 : info_client_feedback.u_id
     */
    private String uId;

    /**
     * 发送时间
     * 表字段 : info_client_feedback.time
     */
    private Date time;

    /**
     * 消息内容
     * 表字段 : info_client_feedback.content
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table info_client_feedback
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 主键 字段:info_client_feedback.id
     *
     * @return info_client_feedback.id, 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 主键 字段:info_client_feedback.id
     *
     * @param id the value for info_client_feedback.id, 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取  字段:info_client_feedback.u_id
     *
     * @return info_client_feedback.u_id, 
     */
    public String getuId() {
        return uId;
    }

    /**
     * 设置  字段:info_client_feedback.u_id
     *
     * @param uId the value for info_client_feedback.u_id, 
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * 获取 发送时间 字段:info_client_feedback.time
     *
     * @return info_client_feedback.time, 发送时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置 发送时间 字段:info_client_feedback.time
     *
     * @param time the value for info_client_feedback.time, 发送时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取 消息内容 字段:info_client_feedback.content
     *
     * @return info_client_feedback.content, 消息内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置 消息内容 字段:info_client_feedback.content
     *
     * @param content the value for info_client_feedback.content, 消息内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * ,info_client_feedback
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uId=").append(uId);
        sb.append(", time=").append(time);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }
}