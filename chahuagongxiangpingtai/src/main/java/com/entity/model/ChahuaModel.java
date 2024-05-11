package com.entity.model;

import com.entity.ChahuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 插画信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ChahuaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 插画名称
     */
    private String chahuaName;


    /**
     * 插画图片
     */
    private String chahuaPhoto;


    /**
     * 下载
     */
    private String chahuaFile;


    /**
     * 插画类型
     */
    private Integer chahuaTypes;


    /**
     * 赞
     */
    private Integer zanNumber;


    /**
     * 踩
     */
    private Integer caiNumber;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 插画发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 插画详情
     */
    private String chahuaContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：插画名称
	 */
    public String getChahuaName() {
        return chahuaName;
    }


    /**
	 * 设置：插画名称
	 */
    public void setChahuaName(String chahuaName) {
        this.chahuaName = chahuaName;
    }
    /**
	 * 获取：插画图片
	 */
    public String getChahuaPhoto() {
        return chahuaPhoto;
    }


    /**
	 * 设置：插画图片
	 */
    public void setChahuaPhoto(String chahuaPhoto) {
        this.chahuaPhoto = chahuaPhoto;
    }
    /**
	 * 获取：下载
	 */
    public String getChahuaFile() {
        return chahuaFile;
    }


    /**
	 * 设置：下载
	 */
    public void setChahuaFile(String chahuaFile) {
        this.chahuaFile = chahuaFile;
    }
    /**
	 * 获取：插画类型
	 */
    public Integer getChahuaTypes() {
        return chahuaTypes;
    }


    /**
	 * 设置：插画类型
	 */
    public void setChahuaTypes(Integer chahuaTypes) {
        this.chahuaTypes = chahuaTypes;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 设置：赞
	 */
    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 设置：踩
	 */
    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：插画发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：插画发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：插画详情
	 */
    public String getChahuaContent() {
        return chahuaContent;
    }


    /**
	 * 设置：插画详情
	 */
    public void setChahuaContent(String chahuaContent) {
        this.chahuaContent = chahuaContent;
    }
    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
