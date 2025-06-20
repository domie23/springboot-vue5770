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
 * 活动信息
 *
 * @author 
 * @email
 */
@TableName("huodong")
public class HuodongEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HuodongEntity() {

	}

	public HuodongEntity(T t) {
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
     * 活动名称
     */
    @ColumnInfo(comment="活动名称",type="varchar(200)")
    @TableField(value = "huodong_name")

    private String huodongName;


    /**
     * 活动图片
     */
    @ColumnInfo(comment="活动图片",type="varchar(200)")
    @TableField(value = "huodong_photo")

    private String huodongPhoto;


    /**
     * 活动类型
     */
    @ColumnInfo(comment="活动类型",type="int(11)")
    @TableField(value = "huodong_types")

    private Integer huodongTypes;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="发布时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 活动详情
     */
    @ColumnInfo(comment="活动详情",type="longtext")
    @TableField(value = "huodong_content")

    private String huodongContent;


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
	 * 获取：活动名称
	 */
    public String getHuodongName() {
        return huodongName;
    }
    /**
	 * 设置：活动名称
	 */

    public void setHuodongName(String huodongName) {
        this.huodongName = huodongName;
    }
    /**
	 * 获取：活动图片
	 */
    public String getHuodongPhoto() {
        return huodongPhoto;
    }
    /**
	 * 设置：活动图片
	 */

    public void setHuodongPhoto(String huodongPhoto) {
        this.huodongPhoto = huodongPhoto;
    }
    /**
	 * 获取：活动类型
	 */
    public Integer getHuodongTypes() {
        return huodongTypes;
    }
    /**
	 * 设置：活动类型
	 */

    public void setHuodongTypes(Integer huodongTypes) {
        this.huodongTypes = huodongTypes;
    }
    /**
	 * 获取：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：活动详情
	 */
    public String getHuodongContent() {
        return huodongContent;
    }
    /**
	 * 设置：活动详情
	 */

    public void setHuodongContent(String huodongContent) {
        this.huodongContent = huodongContent;
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
        return "Huodong{" +
            ", id=" + id +
            ", huodongName=" + huodongName +
            ", huodongPhoto=" + huodongPhoto +
            ", huodongTypes=" + huodongTypes +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", huodongContent=" + huodongContent +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
