package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.DianyingOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 电影订单
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("dianying_order")
public class DianyingOrderView extends DianyingOrderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 订单类型的值
	*/
	@ColumnInfo(comment="订单类型的字典表值",type="varchar(200)")
	private String dianyingOrderValue;
	/**
	* 支付类型的值
	*/
	@ColumnInfo(comment="支付类型的字典表值",type="varchar(200)")
	private String dianyingOrderPaymentValue;
	/**
	* 场次的值
	*/
	@ColumnInfo(comment="场次的字典表值",type="varchar(200)")
	private String changciValue;

	//级联表 电影
		/**
		* 电影名称
		*/

		@ColumnInfo(comment="电影名称",type="varchar(200)")
		private String dianyingName;
		/**
		* 电影海报
		*/

		@ColumnInfo(comment="电影海报",type="varchar(200)")
		private String dianyingPhoto;
		/**
		* 电影类型
		*/
		@ColumnInfo(comment="电影类型",type="int(11)")
		private Integer dianyingTypes;
			/**
			* 电影类型的值
			*/
			@ColumnInfo(comment="电影类型的字典表值",type="varchar(200)")
			private String dianyingValue;
		/**
		* 上映日期
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
		@DateTimeFormat
		@ColumnInfo(comment="上映日期",type="date")
		private Date shangyingTime;
		/**
		* 主演
		*/

		@ColumnInfo(comment="主演",type="varchar(200)")
		private String dianyingZhuyan;
		/**
		* 电影地区
		*/

		@ColumnInfo(comment="电影地区",type="varchar(200)")
		private String dianyingDiqu;
		/**
		* 语言
		*/

		@ColumnInfo(comment="语言",type="varchar(200)")
		private String dianyingYuyan;
		/**
		* 放映地点
		*/

		@ColumnInfo(comment="放映地点",type="varchar(200)")
		private String dianyingDidian;
		/**
		* 赞
		*/

		@ColumnInfo(comment="赞",type="int(11)")
		private Integer zanNumber;
		/**
		* 踩
		*/

		@ColumnInfo(comment="踩",type="int(11)")
		private Integer caiNumber;
		/**
		* 购买获得积分
		*/

		@ColumnInfo(comment="购买获得积分",type="int(11)")
		private Integer dianyingPrice;
		/**
		* 电影原价
		*/
		@ColumnInfo(comment="电影原价",type="decimal(10,2)")
		private Double dianyingOldMoney;
		/**
		* 现价/积分
		*/
		@ColumnInfo(comment="现价/积分",type="decimal(10,2)")
		private Double dianyingNewMoney;
		/**
		* 座位
		*/

		@ColumnInfo(comment="座位",type="int(11)")
		private Integer zuoweiNumber;
		/**
		* 电影时长
		*/

		@ColumnInfo(comment="电影时长",type="int(11)")
		private Integer dianyingShichang;
		/**
		* 电影热度
		*/

		@ColumnInfo(comment="电影热度",type="int(11)")
		private Integer dianyingClicknum;
		/**
		* 是否上架
		*/
		@ColumnInfo(comment="是否上架",type="int(11)")
		private Integer shangxiaTypes;
			/**
			* 是否上架的值
			*/
			@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
			private String shangxiaValue;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer dianyingDelete;
		/**
		* 电影简介
		*/

		@ColumnInfo(comment="电影简介",type="longtext")
		private String dianyingContent;
	//级联表 用户
		/**
		* 用户编号
		*/

		@ColumnInfo(comment="用户编号",type="varchar(200)")
		private String yonghuUuidNumber;
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 余额
		*/
		@ColumnInfo(comment="余额",type="decimal(10,2)")
		private Double newMoney;
		/**
		* 总积分
		*/
		@ColumnInfo(comment="总积分",type="decimal(10,2)")
		private Double yonghuSumJifen;
		/**
		* 现积分
		*/
		@ColumnInfo(comment="现积分",type="decimal(10,2)")
		private Double yonghuNewJifen;
		/**
		* 会员等级
		*/
		@ColumnInfo(comment="会员等级",type="int(11)")
		private Integer huiyuandengjiTypes;
			/**
			* 会员等级的值
			*/
			@ColumnInfo(comment="会员等级的字典表值",type="varchar(200)")
			private String huiyuandengjiValue;
		/**
		* 账户状态
		*/
		@ColumnInfo(comment="账户状态",type="int(11)")
		private Integer jinyongTypes;
			/**
			* 账户状态的值
			*/
			@ColumnInfo(comment="账户状态的字典表值",type="varchar(200)")
			private String jinyongValue;



	public DianyingOrderView() {

	}

	public DianyingOrderView(DianyingOrderEntity dianyingOrderEntity) {
		try {
			BeanUtils.copyProperties(this, dianyingOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 订单类型的值
	*/
	public String getDianyingOrderValue() {
		return dianyingOrderValue;
	}
	/**
	* 设置： 订单类型的值
	*/
	public void setDianyingOrderValue(String dianyingOrderValue) {
		this.dianyingOrderValue = dianyingOrderValue;
	}
	//当前表的
	/**
	* 获取： 支付类型的值
	*/
	public String getDianyingOrderPaymentValue() {
		return dianyingOrderPaymentValue;
	}
	/**
	* 设置： 支付类型的值
	*/
	public void setDianyingOrderPaymentValue(String dianyingOrderPaymentValue) {
		this.dianyingOrderPaymentValue = dianyingOrderPaymentValue;
	}
	//当前表的
	/**
	* 获取： 场次的值
	*/
	public String getChangciValue() {
		return changciValue;
	}
	/**
	* 设置： 场次的值
	*/
	public void setChangciValue(String changciValue) {
		this.changciValue = changciValue;
	}


	//级联表的get和set 电影

		/**
		* 获取： 电影名称
		*/
		public String getDianyingName() {
			return dianyingName;
		}
		/**
		* 设置： 电影名称
		*/
		public void setDianyingName(String dianyingName) {
			this.dianyingName = dianyingName;
		}

		/**
		* 获取： 电影海报
		*/
		public String getDianyingPhoto() {
			return dianyingPhoto;
		}
		/**
		* 设置： 电影海报
		*/
		public void setDianyingPhoto(String dianyingPhoto) {
			this.dianyingPhoto = dianyingPhoto;
		}
		/**
		* 获取： 电影类型
		*/
		public Integer getDianyingTypes() {
			return dianyingTypes;
		}
		/**
		* 设置： 电影类型
		*/
		public void setDianyingTypes(Integer dianyingTypes) {
			this.dianyingTypes = dianyingTypes;
		}


			/**
			* 获取： 电影类型的值
			*/
			public String getDianyingValue() {
				return dianyingValue;
			}
			/**
			* 设置： 电影类型的值
			*/
			public void setDianyingValue(String dianyingValue) {
				this.dianyingValue = dianyingValue;
			}

		/**
		* 获取： 上映日期
		*/
		public Date getShangyingTime() {
			return shangyingTime;
		}
		/**
		* 设置： 上映日期
		*/
		public void setShangyingTime(Date shangyingTime) {
			this.shangyingTime = shangyingTime;
		}

		/**
		* 获取： 主演
		*/
		public String getDianyingZhuyan() {
			return dianyingZhuyan;
		}
		/**
		* 设置： 主演
		*/
		public void setDianyingZhuyan(String dianyingZhuyan) {
			this.dianyingZhuyan = dianyingZhuyan;
		}

		/**
		* 获取： 电影地区
		*/
		public String getDianyingDiqu() {
			return dianyingDiqu;
		}
		/**
		* 设置： 电影地区
		*/
		public void setDianyingDiqu(String dianyingDiqu) {
			this.dianyingDiqu = dianyingDiqu;
		}

		/**
		* 获取： 语言
		*/
		public String getDianyingYuyan() {
			return dianyingYuyan;
		}
		/**
		* 设置： 语言
		*/
		public void setDianyingYuyan(String dianyingYuyan) {
			this.dianyingYuyan = dianyingYuyan;
		}

		/**
		* 获取： 放映地点
		*/
		public String getDianyingDidian() {
			return dianyingDidian;
		}
		/**
		* 设置： 放映地点
		*/
		public void setDianyingDidian(String dianyingDidian) {
			this.dianyingDidian = dianyingDidian;
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
		* 获取： 购买获得积分
		*/
		public Integer getDianyingPrice() {
			return dianyingPrice;
		}
		/**
		* 设置： 购买获得积分
		*/
		public void setDianyingPrice(Integer dianyingPrice) {
			this.dianyingPrice = dianyingPrice;
		}

		/**
		* 获取： 电影原价
		*/
		public Double getDianyingOldMoney() {
			return dianyingOldMoney;
		}
		/**
		* 设置： 电影原价
		*/
		public void setDianyingOldMoney(Double dianyingOldMoney) {
			this.dianyingOldMoney = dianyingOldMoney;
		}

		/**
		* 获取： 现价/积分
		*/
		public Double getDianyingNewMoney() {
			return dianyingNewMoney;
		}
		/**
		* 设置： 现价/积分
		*/
		public void setDianyingNewMoney(Double dianyingNewMoney) {
			this.dianyingNewMoney = dianyingNewMoney;
		}

		/**
		* 获取： 座位
		*/
		public Integer getZuoweiNumber() {
			return zuoweiNumber;
		}
		/**
		* 设置： 座位
		*/
		public void setZuoweiNumber(Integer zuoweiNumber) {
			this.zuoweiNumber = zuoweiNumber;
		}

		/**
		* 获取： 电影时长
		*/
		public Integer getDianyingShichang() {
			return dianyingShichang;
		}
		/**
		* 设置： 电影时长
		*/
		public void setDianyingShichang(Integer dianyingShichang) {
			this.dianyingShichang = dianyingShichang;
		}

		/**
		* 获取： 电影热度
		*/
		public Integer getDianyingClicknum() {
			return dianyingClicknum;
		}
		/**
		* 设置： 电影热度
		*/
		public void setDianyingClicknum(Integer dianyingClicknum) {
			this.dianyingClicknum = dianyingClicknum;
		}
		/**
		* 获取： 是否上架
		*/
		public Integer getShangxiaTypes() {
			return shangxiaTypes;
		}
		/**
		* 设置： 是否上架
		*/
		public void setShangxiaTypes(Integer shangxiaTypes) {
			this.shangxiaTypes = shangxiaTypes;
		}


			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getDianyingDelete() {
			return dianyingDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setDianyingDelete(Integer dianyingDelete) {
			this.dianyingDelete = dianyingDelete;
		}

		/**
		* 获取： 电影简介
		*/
		public String getDianyingContent() {
			return dianyingContent;
		}
		/**
		* 设置： 电影简介
		*/
		public void setDianyingContent(String dianyingContent) {
			this.dianyingContent = dianyingContent;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户编号
		*/
		public String getYonghuUuidNumber() {
			return yonghuUuidNumber;
		}
		/**
		* 设置： 用户编号
		*/
		public void setYonghuUuidNumber(String yonghuUuidNumber) {
			this.yonghuUuidNumber = yonghuUuidNumber;
		}

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}

		/**
		* 获取： 余额
		*/
		public Double getNewMoney() {
			return newMoney;
		}
		/**
		* 设置： 余额
		*/
		public void setNewMoney(Double newMoney) {
			this.newMoney = newMoney;
		}

		/**
		* 获取： 总积分
		*/
		public Double getYonghuSumJifen() {
			return yonghuSumJifen;
		}
		/**
		* 设置： 总积分
		*/
		public void setYonghuSumJifen(Double yonghuSumJifen) {
			this.yonghuSumJifen = yonghuSumJifen;
		}

		/**
		* 获取： 现积分
		*/
		public Double getYonghuNewJifen() {
			return yonghuNewJifen;
		}
		/**
		* 设置： 现积分
		*/
		public void setYonghuNewJifen(Double yonghuNewJifen) {
			this.yonghuNewJifen = yonghuNewJifen;
		}
		/**
		* 获取： 会员等级
		*/
		public Integer getHuiyuandengjiTypes() {
			return huiyuandengjiTypes;
		}
		/**
		* 设置： 会员等级
		*/
		public void setHuiyuandengjiTypes(Integer huiyuandengjiTypes) {
			this.huiyuandengjiTypes = huiyuandengjiTypes;
		}


			/**
			* 获取： 会员等级的值
			*/
			public String getHuiyuandengjiValue() {
				return huiyuandengjiValue;
			}
			/**
			* 设置： 会员等级的值
			*/
			public void setHuiyuandengjiValue(String huiyuandengjiValue) {
				this.huiyuandengjiValue = huiyuandengjiValue;
			}
		/**
		* 获取： 账户状态
		*/
		public Integer getJinyongTypes() {
			return jinyongTypes;
		}
		/**
		* 设置： 账户状态
		*/
		public void setJinyongTypes(Integer jinyongTypes) {
			this.jinyongTypes = jinyongTypes;
		}


			/**
			* 获取： 账户状态的值
			*/
			public String getJinyongValue() {
				return jinyongValue;
			}
			/**
			* 设置： 账户状态的值
			*/
			public void setJinyongValue(String jinyongValue) {
				this.jinyongValue = jinyongValue;
			}


	@Override
	public String toString() {
		return "DianyingOrderView{" +
			", dianyingOrderValue=" + dianyingOrderValue +
			", dianyingOrderPaymentValue=" + dianyingOrderPaymentValue +
			", changciValue=" + changciValue +
			", dianyingName=" + dianyingName +
			", dianyingPhoto=" + dianyingPhoto +
			", shangyingTime=" + DateUtil.convertString(shangyingTime,"yyyy-MM-dd") +
			", dianyingZhuyan=" + dianyingZhuyan +
			", dianyingDiqu=" + dianyingDiqu +
			", dianyingYuyan=" + dianyingYuyan +
			", dianyingDidian=" + dianyingDidian +
			", zanNumber=" + zanNumber +
			", caiNumber=" + caiNumber +
			", dianyingPrice=" + dianyingPrice +
			", dianyingOldMoney=" + dianyingOldMoney +
			", dianyingNewMoney=" + dianyingNewMoney +
			", zuoweiNumber=" + zuoweiNumber +
			", dianyingShichang=" + dianyingShichang +
			", dianyingClicknum=" + dianyingClicknum +
			", dianyingDelete=" + dianyingDelete +
			", dianyingContent=" + dianyingContent +
			", yonghuUuidNumber=" + yonghuUuidNumber +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", newMoney=" + newMoney +
			", yonghuSumJifen=" + yonghuSumJifen +
			", yonghuNewJifen=" + yonghuNewJifen +
			"} " + super.toString();
	}
}
