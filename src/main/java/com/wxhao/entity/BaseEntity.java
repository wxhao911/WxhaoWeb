package com.wxhao.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;




import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;


/**
 * BaseEntity
 * @author wxhao
 * Base基类
 */
@JsonAutoDetect(fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, creatorVisibility = Visibility.NONE)
@MappedSuperclass
public class BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 3360244613288983219L;

	/**数据类型**/
	public enum DataState{
		/**有效**/
		valid,
		/**无效**/
		invalid
	}
	
	/** ID */
	private Long id;

	/** 创建日期 */
	private Date createDate;

	/** 修改日期 */
	private Date modifyDate;
	
	/** 数据状态 */
	private DataState dataState;
	
	/** 数据状态 */
	@Version
	private int version;
	

	/**
	 * 获取id
	 * @return
	 */
	@JsonProperty
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "sequenceGenerator")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	
	public DataState getDataState() {
		return dataState;
	}

	public void setDataState(DataState dataState) {
		this.dataState = dataState;
	}

	
	@Version
    @Column(name = "version",length = 11)
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	
	
}
