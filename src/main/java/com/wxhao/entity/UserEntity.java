package com.wxhao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 用户
 * @author wxhao
 */
@Entity
@Table(name = "hao_user")
@SequenceGenerator(name = "sequenceGenerator", sequenceName = "hao_user_sequence")
public class UserEntity extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2215483077462058532L;


	/** 用户名 */
	private String username;


	/** 密码 */
	private String password;

	/**
	 * 获取用户名
	 * @return
	 */
	@Column(nullable = false, updatable = false, unique = true, length = 100)
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * 获取密码
	 * 
	 * @return 密码
	 */
	@Column(nullable = false)
	@JSONField(serialize = false)
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
