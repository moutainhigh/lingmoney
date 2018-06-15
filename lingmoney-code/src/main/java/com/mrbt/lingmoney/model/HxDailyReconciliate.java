package com.mrbt.lingmoney.model;

import java.io.Serializable;
import java.util.Date;

public class HxDailyReconciliate implements Serializable {
    /**
     * 主键
     * 表字段 : hx_daily_reconciliate.id
     */
    private String id;

    /**
     * 对账日期
     * 表字段 : hx_daily_reconciliate.check_date
     */
    private Date checkDate;

    /**
     * 文件名
     * 表字段 : hx_daily_reconciliate.file_name
     */
    private String fileName;

    /**
     * 文件内容 base64
     * 表字段 : hx_daily_reconciliate.file_content
     */
    private String fileContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hx_daily_reconciliate
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 主键 字段:hx_daily_reconciliate.id
     *
     * @return hx_daily_reconciliate.id, 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置 主键 字段:hx_daily_reconciliate.id
     *
     * @param id the value for hx_daily_reconciliate.id, 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取 对账日期 字段:hx_daily_reconciliate.check_date
     *
     * @return hx_daily_reconciliate.check_date, 对账日期
     */
    public Date getCheckDate() {
        return checkDate;
    }

    /**
     * 设置 对账日期 字段:hx_daily_reconciliate.check_date
     *
     * @param checkDate the value for hx_daily_reconciliate.check_date, 对账日期
     */
    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    /**
     * 获取 文件名 字段:hx_daily_reconciliate.file_name
     *
     * @return hx_daily_reconciliate.file_name, 文件名
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 设置 文件名 字段:hx_daily_reconciliate.file_name
     *
     * @param fileName the value for hx_daily_reconciliate.file_name, 文件名
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * 获取 文件内容 base64 字段:hx_daily_reconciliate.file_content
     *
     * @return hx_daily_reconciliate.file_content, 文件内容 base64
     */
    public String getFileContent() {
        return fileContent;
    }

    /**
     * 设置 文件内容 base64 字段:hx_daily_reconciliate.file_content
     *
     * @param fileContent the value for hx_daily_reconciliate.file_content, 文件内容 base64
     */
    public void setFileContent(String fileContent) {
        this.fileContent = fileContent == null ? null : fileContent.trim();
    }

    /**
     * ,hx_daily_reconciliate
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", checkDate=").append(checkDate);
        sb.append(", fileName=").append(fileName);
        sb.append(", fileContent=").append(fileContent);
        sb.append("]");
        return sb.toString();
    }
}