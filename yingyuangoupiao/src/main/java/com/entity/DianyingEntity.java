package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 电影
 *
 * @author 
 * @email
 */
@TableName("dianying")
public class DianyingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DianyingEntity() {

	}

	public DianyingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 电影名称
     */
    @ColumnInfo(comment="电影名称",type="varchar(200)")
    @TableField(value = "dianying_name")

    private String dianyingName;


    /**
     * 电影海报
     */
    @ColumnInfo(comment="电影海报",type="varchar(200)")
    @TableField(value = "dianying_photo")

    private String dianyingPhoto;


    /**
     * 电影类型
     */
    @ColumnInfo(comment="电影类型",type="int(11)")
    @TableField(value = "dianying_types")

    private Integer dianyingTypes;


    /**
     * 上映日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @ColumnInfo(comment="上映日期",type="date")
    @TableField(value = "shangying_time")

    private Date shangyingTime;


    /**
     * 主演
     */
    @ColumnInfo(comment="主演",type="varchar(200)")
    @TableField(value = "dianying_zhuyan")

    private String dianyingZhuyan;


    /**
     * 电影地区
     */
    @ColumnInfo(comment="电影地区",type="varchar(200)")
    @TableField(value = "dianying_diqu")

    private String dianyingDiqu;


    /**
     * 语言
     */
    @ColumnInfo(comment="语言",type="varchar(200)")
    @TableField(value = "dianying_yuyan")

    private String dianyingYuyan;


    /**
     * 放映地点
     */
    @ColumnInfo(comment="放映地点",type="varchar(200)")
    @TableField(value = "dianying_didian")

    private String dianyingDidian;


    /**
     * 赞
     */
    @ColumnInfo(comment="赞",type="int(11)")
    @TableField(value = "zan_number")

    private Integer zanNumber;


    /**
     * 踩
     */
    @ColumnInfo(comment="踩",type="int(11)")
    @TableField(value = "cai_number")

    private Integer caiNumber;


    /**
     * 购买获得积分
     */
    @ColumnInfo(comment="购买获得积分",type="int(11)")
    @TableField(value = "dianying_price")

    private Integer dianyingPrice;


    /**
     * 电影原价
     */
    @ColumnInfo(comment="电影原价",type="decimal(10,2)")
    @TableField(value = "dianying_old_money")

    private Double dianyingOldMoney;


    /**
     * 现价/积分
     */
    @ColumnInfo(comment="现价/积分",type="decimal(10,2)")
    @TableField(value = "dianying_new_money")

    private Double dianyingNewMoney;


    /**
     * 座位
     */
    @ColumnInfo(comment="座位",type="int(11)")
    @TableField(value = "zuowei_number")

    private Integer zuoweiNumber;


    /**
     * 电影时长
     */
    @ColumnInfo(comment="电影时长",type="int(11)")
    @TableField(value = "dianying_shichang")

    private Integer dianyingShichang;


    /**
     * 电影热度
     */
    @ColumnInfo(comment="电影热度",type="int(11)")
    @TableField(value = "dianying_clicknum")

    private Integer dianyingClicknum;


    /**
     * 是否上架
     */
    @ColumnInfo(comment="是否上架",type="int(11)")
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "dianying_delete")

    private Integer dianyingDelete;


    /**
     * 电影简介
     */
    @ColumnInfo(comment="电影简介",type="longtext")
    @TableField(value = "dianying_content")

    private String dianyingContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 获取：电影名称
	 */
    public String getDianyingName() {
        return dianyingName;
    }
    /**
	 * 设置：电影名称
	 */

    public void setDianyingName(String dianyingName) {
        this.dianyingName = dianyingName;
    }
    /**
	 * 获取：电影海报
	 */
    public String getDianyingPhoto() {
        return dianyingPhoto;
    }
    /**
	 * 设置：电影海报
	 */

    public void setDianyingPhoto(String dianyingPhoto) {
        this.dianyingPhoto = dianyingPhoto;
    }
    /**
	 * 获取：电影类型
	 */
    public Integer getDianyingTypes() {
        return dianyingTypes;
    }
    /**
	 * 设置：电影类型
	 */

    public void setDianyingTypes(Integer dianyingTypes) {
        this.dianyingTypes = dianyingTypes;
    }
    /**
	 * 获取：上映日期
	 */
    public Date getShangyingTime() {
        return shangyingTime;
    }
    /**
	 * 设置：上映日期
	 */

    public void setShangyingTime(Date shangyingTime) {
        this.shangyingTime = shangyingTime;
    }
    /**
	 * 获取：主演
	 */
    public String getDianyingZhuyan() {
        return dianyingZhuyan;
    }
    /**
	 * 设置：主演
	 */

    public void setDianyingZhuyan(String dianyingZhuyan) {
        this.dianyingZhuyan = dianyingZhuyan;
    }
    /**
	 * 获取：电影地区
	 */
    public String getDianyingDiqu() {
        return dianyingDiqu;
    }
    /**
	 * 设置：电影地区
	 */

    public void setDianyingDiqu(String dianyingDiqu) {
        this.dianyingDiqu = dianyingDiqu;
    }
    /**
	 * 获取：语言
	 */
    public String getDianyingYuyan() {
        return dianyingYuyan;
    }
    /**
	 * 设置：语言
	 */

    public void setDianyingYuyan(String dianyingYuyan) {
        this.dianyingYuyan = dianyingYuyan;
    }
    /**
	 * 获取：放映地点
	 */
    public String getDianyingDidian() {
        return dianyingDidian;
    }
    /**
	 * 设置：放映地点
	 */

    public void setDianyingDidian(String dianyingDidian) {
        this.dianyingDidian = dianyingDidian;
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
	 * 获取：购买获得积分
	 */
    public Integer getDianyingPrice() {
        return dianyingPrice;
    }
    /**
	 * 设置：购买获得积分
	 */

    public void setDianyingPrice(Integer dianyingPrice) {
        this.dianyingPrice = dianyingPrice;
    }
    /**
	 * 获取：电影原价
	 */
    public Double getDianyingOldMoney() {
        return dianyingOldMoney;
    }
    /**
	 * 设置：电影原价
	 */

    public void setDianyingOldMoney(Double dianyingOldMoney) {
        this.dianyingOldMoney = dianyingOldMoney;
    }
    /**
	 * 获取：现价/积分
	 */
    public Double getDianyingNewMoney() {
        return dianyingNewMoney;
    }
    /**
	 * 设置：现价/积分
	 */

    public void setDianyingNewMoney(Double dianyingNewMoney) {
        this.dianyingNewMoney = dianyingNewMoney;
    }
    /**
	 * 获取：座位
	 */
    public Integer getZuoweiNumber() {
        return zuoweiNumber;
    }
    /**
	 * 设置：座位
	 */

    public void setZuoweiNumber(Integer zuoweiNumber) {
        this.zuoweiNumber = zuoweiNumber;
    }
    /**
	 * 获取：电影时长
	 */
    public Integer getDianyingShichang() {
        return dianyingShichang;
    }
    /**
	 * 设置：电影时长
	 */

    public void setDianyingShichang(Integer dianyingShichang) {
        this.dianyingShichang = dianyingShichang;
    }
    /**
	 * 获取：电影热度
	 */
    public Integer getDianyingClicknum() {
        return dianyingClicknum;
    }
    /**
	 * 设置：电影热度
	 */

    public void setDianyingClicknum(Integer dianyingClicknum) {
        this.dianyingClicknum = dianyingClicknum;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 设置：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getDianyingDelete() {
        return dianyingDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setDianyingDelete(Integer dianyingDelete) {
        this.dianyingDelete = dianyingDelete;
    }
    /**
	 * 获取：电影简介
	 */
    public String getDianyingContent() {
        return dianyingContent;
    }
    /**
	 * 设置：电影简介
	 */

    public void setDianyingContent(String dianyingContent) {
        this.dianyingContent = dianyingContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Dianying{" +
            ", id=" + id +
            ", dianyingName=" + dianyingName +
            ", dianyingPhoto=" + dianyingPhoto +
            ", dianyingTypes=" + dianyingTypes +
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
            ", shangxiaTypes=" + shangxiaTypes +
            ", dianyingDelete=" + dianyingDelete +
            ", dianyingContent=" + dianyingContent +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
