package com.wxhao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.wxhao.util.base.BaseEntity;


/**
 * 用户实体
 * @author wxhao
 *
 */
@Entity
@Table(name = "ho_user")
public class User extends BaseEntity {

	private static final long serialVersionUID = -541213882830242325L;

	/** 账号 **/
	private String username ;
	/** 密码 **/
	private String password ;

	@Column(nullable = false)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
