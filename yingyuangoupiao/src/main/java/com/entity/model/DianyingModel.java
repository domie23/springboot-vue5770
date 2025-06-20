package com.entity.model;

import com.entity.DianyingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 电影
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class DianyingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 电影名称
     */
    private String dianyingName;


    /**
     * 电影海报
     */
    private String dianyingPhoto;


    /**
     * 电影类型
     */
    private Integer dianyingTypes;


    /**
     * 上映日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date shangyingTime;


    /**
     * 主演
     */
    private String dianyingZhuyan;


    /**
     * 电影地区
     */
    private String dianyingDiqu;


    /**
     * 语言
     */
    private String dianyingYuyan;


    /**
     * 放映地点
     */
    private String dianyingDidian;


    /**
     * 赞
     */
    private Integer zanNumber;


    /**
     * 踩
     */
    private Integer caiNumber;


    /**
     * 购买获得积分
     */
    private Integer dianyingPrice;


    /**
     * 电影原价
     */
    private Double dianyingOldMoney;


    /**
     * 现价/积分
     */
    private Double dianyingNewMoney;


    /**
     * 座位
     */
    private Integer zuoweiNumber;


    /**
     * 电影时长
     */
    private Integer dianyingShichang;


    /**
     * 电影热度
     */
    private Integer dianyingClicknum;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer dianyingDelete;


    /**
     * 电影简介
     */
    private String dianyingContent;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
