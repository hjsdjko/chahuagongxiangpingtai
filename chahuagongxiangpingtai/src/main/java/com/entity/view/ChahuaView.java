package com.entity.view;

import com.entity.ChahuaEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 插画信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("chahua")
public class ChahuaView extends ChahuaEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 插画类型的值
		*/
		private String chahuaValue;



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

	public ChahuaView() {

	}

	public ChahuaView(ChahuaEntity chahuaEntity) {
		try {
			BeanUtils.copyProperties(this, chahuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
