package com.entity.vo;

import com.entity.DianyingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 电影
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("dianying")
public class DianyingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 电影名称
     */

    @TableField(value = "dianying_name")
    private String dianyingName;


    /**
     * 电影海报
     */

    @TableField(value = "dianying_photo")
    private String dianyingPhoto;


    /**
     * 电影类型
     */

    @TableField(value = "dianying_types")
    private Integer dianyingTypes;


    /**
     * 上映日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "shangying_time")
    private Date shangyingTime;


    /**
     * 主演
     */

    @TableField(value = "dianying_zhuyan")
    private String dianyingZhuyan;


    /**
     * 电影地区
     */

    @TableField(value = "dianying_diqu")
    private String dianyingDiqu;


    /**
     * 语言
     */

    @TableField(value = "dianying_yuyan")
    private String dianyingYuyan;


    /**
     * 放映地点
     */

    @TableField(value = "dianying_didian")
    private String dianyingDidian;


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
     * 购买获得积分
     */

    @TableField(value = "dianying_price")
    private Integer dianyingPrice;


    /**
     * 电影原价
     */

    @TableField(value = "dianying_old_money")
    private Double dianyingOldMoney;


    /**
     * 现价/积分
     */

    @TableField(value = "dianying_new_money")
    private Double dianyingNewMoney;


    /**
     * 座位
     */

    @TableField(value = "zuowei_number")
    private Integer zuoweiNumber;


    /**
     * 电影时长
     */

    @TableField(value = "dianying_shichang")
    private Integer dianyingShichang;


    /**
     * 电影热度
     */

    @TableField(value = "dianying_clicknum")
    private Integer dianyingClicknum;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "dianying_delete")
    private Integer dianyingDelete;


    /**
     * 电影简介
     */

    @TableField(value = "dianying_content")
    private String dianyingContent;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 设置：电影名称
	 */
    public String getDianyingName() {
        return dianyingName;
    }


    /**
	 * 获取：电影名称
	 */

    public void setDianyingName(String dianyingName) {
        this.dianyingName = dianyingName;
    }
    /**
	 * 设置：电影海报
	 */
    public String getDianyingPhoto() {
        return dianyingPhoto;
    }


    /**
	 * 获取：电影海报
	 */

    public void setDianyingPhoto(String dianyingPhoto) {
        this.dianyingPhoto = dianyingPhoto;
    }
    /**
	 * 设置：电影类型
	 */
    public Integer getDianyingTypes() {
        return dianyingTypes;
    }


    /**
	 * 获取：电影类型
	 */

    public void setDianyingTypes(Integer dianyingTypes) {
        this.dianyingTypes = dianyingTypes;
    }
    /**
	 * 设置：上映日期
	 */
    public Date getShangyingTime() {
        return shangyingTime;
    }


    /**
	 * 获取：上映日期
	 */

    public void setShangyingTime(Date shangyingTime) {
        this.shangyingTime = shangyingTime;
    }
    /**
	 * 设置：主演
	 */
    public String getDianyingZhuyan() {
        return dianyingZhuyan;
    }


    /**
	 * 获取：主演
	 */

    public void setDianyingZhuyan(String dianyingZhuyan) {
        this.dianyingZhuyan = dianyingZhuyan;
    }
    /**
	 * 设置：电影地区
	 */
    public String getDianyingDiqu() {
        return dianyingDiqu;
    }


    /**
	 * 获取：电影地区
	 */

    public void setDianyingDiqu(String dianyingDiqu) {
        this.dianyingDiqu = dianyingDiqu;
    }
    /**
	 * 设置：语言
	 */
    public String getDianyingYuyan() {
        return dianyingYuyan;
    }


    /**
	 * 获取：语言
	 */

    public void setDianyingYuyan(String dianyingYuyan) {
        this.dianyingYuyan = dianyingYuyan;
    }
    /**
	 * 设置：放映地点
	 */
    public String getDianyingDidian() {
        return dianyingDidian;
    }


    /**
	 * 获取：放映地点
	 */

    public void setDianyingDidian(String dianyingDidian) {
        this.dianyingDidian = dianyingDidian;
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
	 * 设置：购买获得积分
	 */
    public Integer getDianyingPrice() {
        return dianyingPrice;
    }


    /**
	 * 获取：购买获得积分
	 */

    public void setDianyingPrice(Integer dianyingPrice) {
        this.dianyingPrice = dianyingPrice;
    }
    /**
	 * 设置：电影原价
	 */
    public Double getDianyingOldMoney() {
        return dianyingOldMoney;
    }


    /**
	 * 获取：电影原价
	 */

    public void setDianyingOldMoney(Double dianyingOldMoney) {
        this.dianyingOldMoney = dianyingOldMoney;
    }
    /**
	 * 设置：现价/积分
	 */
    public Double getDianyingNewMoney() {
        return dianyingNewMoney;
    }


    /**
	 * 获取：现价/积分
	 */

    public void setDianyingNewMoney(Double dianyingNewMoney) {
        this.dianyingNewMoney = dianyingNewMoney;
    }
    /**
	 * 设置：座位
	 */
    public Integer getZuoweiNumber() {
        return zuoweiNumber;
    }


    /**
	 * 获取：座位
	 */

    public void setZuoweiNumber(Integer zuoweiNumber) {
        this.zuoweiNumber = zuoweiNumber;
    }
    /**
	 * 设置：电影时长
	 */
    public Integer getDianyingShichang() {
        return dianyingShichang;
    }


    /**
	 * 获取：电影时长
	 */

    public void setDianyingShichang(Integer dianyingShichang) {
        this.dianyingShichang = dianyingShichang;
    }
    /**
	 * 设置：电影热度
	 */
    public Integer getDianyingClicknum() {
        return dianyingClicknum;
    }


    /**
	 * 获取：电影热度
	 */

    public void setDianyingClicknum(Integer dianyingClicknum) {
        this.dianyingClicknum = dianyingClicknum;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getDianyingDelete() {
        return dianyingDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setDianyingDelete(Integer dianyingDelete) {
        this.dianyingDelete = dianyingDelete;
    }
    /**
	 * 设置：电影简介
	 */
    public String getDianyingContent() {
        return dianyingContent;
    }


    /**
	 * 获取：电影简介
	 */

    public void setDianyingContent(String dianyingContent) {
        this.dianyingContent = dianyingContent;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
