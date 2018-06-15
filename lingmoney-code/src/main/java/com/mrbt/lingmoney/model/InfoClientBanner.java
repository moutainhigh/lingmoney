package com.mrbt.lingmoney.model;

import java.io.Serializable;
import java.util.Date;

public class InfoClientBanner implements Serializable {
    /**
     * 编号
     * 表字段 : info_client_banner.id
     */
    private Integer id;

    /**
     * 名称
     * 表字段 : info_client_banner.name
     */
    private String name;

    /**
     * 跳转链接
     * 表字段 : info_client_banner.url
     */
    private String url;

    /**
     * 状态,0可用，1不可用
     * 表字段 : info_client_banner.status
     */
    private Integer status;

    /**
     * 优先级,由高到底排序
     * 表字段 : info_client_banner.level
     */
    private Integer level;

    /**
     * 创建时间
     * 表字段 : info_client_banner.create_time
     */
    private Date createTime;

    /**
     * 默认图片路径
     * 表字段 : info_client_banner.defult_path
     */
    private String defultPath;

    /**
     * 图片路径
     * 表字段 : info_client_banner.code_path1
     */
    private String codePath1;

    /**
     * 图片路径
     * 表字段 : info_client_banner.code_path2
     */
    private String codePath2;

    /**
     * 图片路径
     * 表字段 : info_client_banner.code_path3
     */
    private String codePath3;

    /**
     * 图片路径
     * 表字段 : info_client_banner.code_path4
     */
    private String codePath4;

    /**
     * 图片路径
     * 表字段 : info_client_banner.code_path5
     */
    private String codePath5;

    /**
     * 图片路径
     * 表字段 : info_client_banner.code_path6
     */
    private String codePath6;

    /**
     * 图片路径
     * 表字段 : info_client_banner.code_path7
     */
    private String codePath7;

    /**
     * 图片路径
     * 表字段 : info_client_banner.code_path8
     */
    private String codePath8;

    /**
     * 图片路径
     * 表字段 : info_client_banner.code_path9
     */
    private String codePath9;

    /**
     * 图片路径
     * 表字段 : info_client_banner.code_path10
     */
    private String codePath10;

    /**
     * 百度城市代码。000全国，131北京，236青岛
     * 表字段 : info_client_banner.city_code
     */
    private String cityCode;
    
    /**
     * 查询自定义字段
     */
    private String defult_path;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table info_client_banner
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 编号 字段:info_client_banner.id
     *
     * @return info_client_banner.id, 编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 编号 字段:info_client_banner.id
     *
     * @param id the value for info_client_banner.id, 编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 名称 字段:info_client_banner.name
     *
     * @return info_client_banner.name, 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 名称 字段:info_client_banner.name
     *
     * @param name the value for info_client_banner.name, 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取 跳转链接 字段:info_client_banner.url
     *
     * @return info_client_banner.url, 跳转链接
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置 跳转链接 字段:info_client_banner.url
     *
     * @param url the value for info_client_banner.url, 跳转链接
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取 状态,0可用，1不可用 字段:info_client_banner.status
     *
     * @return info_client_banner.status, 状态,0可用，1不可用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 状态,0可用，1不可用 字段:info_client_banner.status
     *
     * @param status the value for info_client_banner.status, 状态,0可用，1不可用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 优先级,由高到底排序 字段:info_client_banner.level
     *
     * @return info_client_banner.level, 优先级,由高到底排序
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置 优先级,由高到底排序 字段:info_client_banner.level
     *
     * @param level the value for info_client_banner.level, 优先级,由高到底排序
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取 创建时间 字段:info_client_banner.create_time
     *
     * @return info_client_banner.create_time, 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:info_client_banner.create_time
     *
     * @param createTime the value for info_client_banner.create_time, 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 默认图片路径 字段:info_client_banner.defult_path
     *
     * @return info_client_banner.defult_path, 默认图片路径
     */
    public String getDefultPath() {
        return defultPath;
    }

    /**
     * 设置 默认图片路径 字段:info_client_banner.defult_path
     *
     * @param defultPath the value for info_client_banner.defult_path, 默认图片路径
     */
    public void setDefultPath(String defultPath) {
        this.defultPath = defultPath == null ? null : defultPath.trim();
    }

    /**
     * 获取 图片路径 字段:info_client_banner.code_path1
     *
     * @return info_client_banner.code_path1, 图片路径
     */
    public String getCodePath1() {
        return codePath1;
    }

    /**
     * 设置 图片路径 字段:info_client_banner.code_path1
     *
     * @param codePath1 the value for info_client_banner.code_path1, 图片路径
     */
    public void setCodePath1(String codePath1) {
        this.codePath1 = codePath1 == null ? null : codePath1.trim();
    }

    /**
     * 获取 图片路径 字段:info_client_banner.code_path2
     *
     * @return info_client_banner.code_path2, 图片路径
     */
    public String getCodePath2() {
        return codePath2;
    }

    /**
     * 设置 图片路径 字段:info_client_banner.code_path2
     *
     * @param codePath2 the value for info_client_banner.code_path2, 图片路径
     */
    public void setCodePath2(String codePath2) {
        this.codePath2 = codePath2 == null ? null : codePath2.trim();
    }

    /**
     * 获取 图片路径 字段:info_client_banner.code_path3
     *
     * @return info_client_banner.code_path3, 图片路径
     */
    public String getCodePath3() {
        return codePath3;
    }

    /**
     * 设置 图片路径 字段:info_client_banner.code_path3
     *
     * @param codePath3 the value for info_client_banner.code_path3, 图片路径
     */
    public void setCodePath3(String codePath3) {
        this.codePath3 = codePath3 == null ? null : codePath3.trim();
    }

    /**
     * 获取 图片路径 字段:info_client_banner.code_path4
     *
     * @return info_client_banner.code_path4, 图片路径
     */
    public String getCodePath4() {
        return codePath4;
    }

    /**
     * 设置 图片路径 字段:info_client_banner.code_path4
     *
     * @param codePath4 the value for info_client_banner.code_path4, 图片路径
     */
    public void setCodePath4(String codePath4) {
        this.codePath4 = codePath4 == null ? null : codePath4.trim();
    }

    /**
     * 获取 图片路径 字段:info_client_banner.code_path5
     *
     * @return info_client_banner.code_path5, 图片路径
     */
    public String getCodePath5() {
        return codePath5;
    }

    /**
     * 设置 图片路径 字段:info_client_banner.code_path5
     *
     * @param codePath5 the value for info_client_banner.code_path5, 图片路径
     */
    public void setCodePath5(String codePath5) {
        this.codePath5 = codePath5 == null ? null : codePath5.trim();
    }

    /**
     * 获取 图片路径 字段:info_client_banner.code_path6
     *
     * @return info_client_banner.code_path6, 图片路径
     */
    public String getCodePath6() {
        return codePath6;
    }

    /**
     * 设置 图片路径 字段:info_client_banner.code_path6
     *
     * @param codePath6 the value for info_client_banner.code_path6, 图片路径
     */
    public void setCodePath6(String codePath6) {
        this.codePath6 = codePath6 == null ? null : codePath6.trim();
    }

    /**
     * 获取 图片路径 字段:info_client_banner.code_path7
     *
     * @return info_client_banner.code_path7, 图片路径
     */
    public String getCodePath7() {
        return codePath7;
    }

    /**
     * 设置 图片路径 字段:info_client_banner.code_path7
     *
     * @param codePath7 the value for info_client_banner.code_path7, 图片路径
     */
    public void setCodePath7(String codePath7) {
        this.codePath7 = codePath7 == null ? null : codePath7.trim();
    }

    /**
     * 获取 图片路径 字段:info_client_banner.code_path8
     *
     * @return info_client_banner.code_path8, 图片路径
     */
    public String getCodePath8() {
        return codePath8;
    }

    /**
     * 设置 图片路径 字段:info_client_banner.code_path8
     *
     * @param codePath8 the value for info_client_banner.code_path8, 图片路径
     */
    public void setCodePath8(String codePath8) {
        this.codePath8 = codePath8 == null ? null : codePath8.trim();
    }

    /**
     * 获取 图片路径 字段:info_client_banner.code_path9
     *
     * @return info_client_banner.code_path9, 图片路径
     */
    public String getCodePath9() {
        return codePath9;
    }

    /**
     * 设置 图片路径 字段:info_client_banner.code_path9
     *
     * @param codePath9 the value for info_client_banner.code_path9, 图片路径
     */
    public void setCodePath9(String codePath9) {
        this.codePath9 = codePath9 == null ? null : codePath9.trim();
    }

    /**
     * 获取 图片路径 字段:info_client_banner.code_path10
     *
     * @return info_client_banner.code_path10, 图片路径
     */
    public String getCodePath10() {
        return codePath10;
    }

    /**
     * 设置 图片路径 字段:info_client_banner.code_path10
     *
     * @param codePath10 the value for info_client_banner.code_path10, 图片路径
     */
    public void setCodePath10(String codePath10) {
        this.codePath10 = codePath10 == null ? null : codePath10.trim();
    }

    /**
     * 获取 百度城市代码。000全国，131北京，236青岛 字段:info_client_banner.city_code
     *
     * @return info_client_banner.city_code, 百度城市代码。000全国，131北京，236青岛
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * 设置 百度城市代码。000全国，131北京，236青岛 字段:info_client_banner.city_code
     *
     * @param cityCode the value for info_client_banner.city_code, 百度城市代码。000全国，131北京，236青岛
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }
    
    public String getDefult_path() {
		return defult_path;
	}

	public void setDefult_path(String defult_path) {
		this.defult_path = defult_path;
	}

    /**
     * ,info_client_banner
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", url=").append(url);
        sb.append(", status=").append(status);
        sb.append(", level=").append(level);
        sb.append(", createTime=").append(createTime);
        sb.append(", defultPath=").append(defultPath);
        sb.append(", codePath1=").append(codePath1);
        sb.append(", codePath2=").append(codePath2);
        sb.append(", codePath3=").append(codePath3);
        sb.append(", codePath4=").append(codePath4);
        sb.append(", codePath5=").append(codePath5);
        sb.append(", codePath6=").append(codePath6);
        sb.append(", codePath7=").append(codePath7);
        sb.append(", codePath8=").append(codePath8);
        sb.append(", codePath9=").append(codePath9);
        sb.append(", codePath10=").append(codePath10);
        sb.append(", cityCode=").append(cityCode);
        sb.append("]");
        return sb.toString();
    }
}