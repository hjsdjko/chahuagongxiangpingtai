package com.entity.view;

import com.entity.ChahuaCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 插画收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("chahua_collection")
public class ChahuaCollectionView extends ChahuaCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String chahuaCollectionValue;



		//级联表 chahua
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
				* 插画类型的值
				*/
				private String chahuaValue;
			/**
			* 赞
			*/
			private Integer zanNumber;
			/**
			* 踩
			*/
			private Integer caiNumber;
			/**
			* 插画信息 的 用户
			*/
			private Integer chahuaYonghuId;
			/**
			* 插画详情
			*/
			private String chahuaContent;

		//级联表 yonghu
			/**
			* 名称
			*/
			private String yonghuName;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public ChahuaCollectionView() {

	}

	public ChahuaCollectionView(ChahuaCollectionEntity chahuaCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, chahuaCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getChahuaCollectionValue() {
				return chahuaCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setChahuaCollectionValue(String chahuaCollectionValue) {
				this.chahuaCollectionValue = chahuaCollectionValue;
			}




				//级联表的get和set chahua

					/**
					* 获取： 插画名称
					*/
					public String getChahuaName() {
						return chahuaName;
					}
					/**
					* 设置： 插画名称
					*/
					public void setChahuaName(String chahuaName) {
						this.chahuaName = chahuaName;
					}

					/**
					* 获取： 插画图片
					*/
					public String getChahuaPhoto() {
						return chahuaPhoto;
					}
					/**
					* 设置： 插画图片
					*/
					public void setChahuaPhoto(String chahuaPhoto) {
						this.chahuaPhoto = chahuaPhoto;
					}

					/**
					* 获取： 下载
					*/
					public String getChahuaFile() {
						return chahuaFile;
					}
					/**
					* 设置： 下载
					*/
					public void setChahuaFile(String chahuaFile) {
						this.chahuaFile = chahuaFile;
					}

					/**
					* 获取： 插画类型
					*/
					public Integer getChahuaTypes() {
						return chahuaTypes;
					}
					/**
					* 设置： 插画类型
					*/
					public void setChahuaTypes(Integer chahuaTypes) {
						this.chahuaTypes = chahuaTypes;
					}


						/**
						* 获取： 插画类型的值
						*/
						public String getChahuaValue() {
							return chahuaValue;
						}
						/**
						* 设置： 插画类型的值
						*/
						public void setChahuaValue(String chahuaValue) {
							this.chahuaValue = chahuaValue;
						}

					/**
					* 获取： 赞
					*/
					public Integer getZanNumber() {
						return zanNumber;
					}
					/**
					* 设置： 赞
					*/
					public void setZanNumber(Integer zanNumber) {
						this.zanNumber = zanNumber;
					}

					/**
					* 获取： 踩
					*/
					public Integer getCaiNumber() {
						return caiNumber;
					}
					/**
					* 设置： 踩
					*/
					public void setCaiNumber(Integer caiNumber) {
						this.caiNumber = caiNumber;
					}

					/**
					* 获取：插画信息 的 用户
					*/
					public Integer getChahuaYonghuId() {
						return chahuaYonghuId;
					}
					/**
					* 设置：插画信息 的 用户
					*/
					public void setChahuaYonghuId(Integer chahuaYonghuId) {
						this.chahuaYonghuId = chahuaYonghuId;
					}


					/**
					* 获取： 插画详情
					*/
					public String getChahuaContent() {
						return chahuaContent;
					}
					/**
					* 设置： 插画详情
					*/
					public void setChahuaContent(String chahuaContent) {
						this.chahuaContent = chahuaContent;
					}
















				//级联表的get和set yonghu

					/**
					* 获取： 名称
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 名称
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}



}
