package com.entity.vo;

import com.entity.ChahuaEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 插画信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("chahua")
public class ChahuaVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 插画名称
     */

    @TableField(value = "chahua_name")
    private String chahuaName;


    /**
     * 插画图片
     */

    @TableField(value = "chahua_photo")
    private String chahuaPhoto;


    /**
     * 下载
     */

    @TableField(value = "chahua_file")
    private String chahuaFile;


    /**
     * 插画类型
     */

    @TableField(value = "chahua_types")
    private Integer chahuaTypes;


    /**
     * 赞
     */

    @TableField(value = "zan_number")
    private Integer zanNumber;


    /**
     * 踩
     */

    @TableField(value = "cai_number")
    private Integer caiNumber;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 插画发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 插画详情
     */

    @TableField(value = "chahua_content")
    private String chahuaContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：插画名称
	 */
    public String getChahuaName() {
        return chahuaName;
    }


    /**
	 * 获取：插画名称
	 */

    public void setChahuaName(String chahuaName) {
        this.chahuaName = chahuaName;
    }
    /**
	 * 设置：插画图片
	 */
    public String getChahuaPhoto() {
        return chahuaPhoto;
    }


    /**
	 * 获取：插画图片
	 */

    public void setChahuaPhoto(String chahuaPhoto) {
        this.chahuaPhoto = chahuaPhoto;
    }
    /**
	 * 设置：下载
	 */
    public String getChahuaFile() {
        return chahuaFile;
    }


    /**
	 * 获取：下载
	 */

    public void setChahuaFile(String chahuaFile) {
        this.chahuaFile = chahuaFile;
    }
    /**
	 * 设置：插画类型
	 */
    public Integer getChahuaTypes() {
        return chahuaTypes;
    }


    /**
	 * 获取：插画类型
	 */

    public void setChahuaTypes(Integer chahuaTypes) {
        this.chahuaTypes = chahuaTypes;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：插画发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：插画发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：插画详情
	 */
    public String getChahuaContent() {
        return chahuaContent;
    }


    /**
	 * 获取：插画详情
	 */

    public void setChahuaContent(String chahuaContent) {
        this.chahuaContent = chahuaContent;
    }
    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
