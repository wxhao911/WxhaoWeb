package com.wxhao.util.base;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.wxhao.util.DataConfig.DataState;

/**
 * BaseEntity
 * @author wxhao
 * Entity基类
 */
@JsonAutoDetect(fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, creatorVisibility = Visibility.NONE)
@MappedSuperclass
public class BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 4708659236836845794L;

	/** ID **/
	private String uid;

	/** 创建日期 **/
	private Date createDate;

	/** 修改日期 **/
	private Date modifyDate;
	
	/** 数据状态 **/
	private DataState dataState;
	
	/** 乐观锁 **/
	@Version
	private long version;

	public BaseEntity(){
		this.setUid(UUID.randomUUID().toString());
		this.setCreateDate(new Date());
		this.setModifyDate(new Date());
		this.setDataState(DataState.valid);
	}
	
	/**
	 * 获取uid
	 * @return
	 */
	@JsonProperty
	@Id
	@Column(name = "uid", unique = true, nullable = false, length = 36)
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	 * 获取创建日期
	 * 
	 * @return 创建日期
	 */
	@JsonProperty
	@Column(nullable = false, updatable = false)
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * 获取修改日期
	 * 
	 * @return 修改日期
	 */
	@JsonProperty
	@Column(nullable = false)
	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	/**
	 * 获取数据状态
	 * 
	 * @return 数据状态
	 */
	@JSONField(serialize=false)
	@JsonProperty
	@Column(nullable = false)
	public DataState getDataState() {
		return dataState;
	}

	public void setDataState(DataState dataState) {
		this.dataState = dataState;
	}

	@JSONField(serialize=false)
	@Version
    @Column(name = "version",length = 20)
	public long getVersion() {
		return version;
	}

	
	public void setVersion(long version) {
		this.version = version;
	}
	
	
	
}
