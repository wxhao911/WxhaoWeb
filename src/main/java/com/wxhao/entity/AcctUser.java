package com.wxhao.entity;
//Generated 2015-2-3 10:43:00 by Hibernate Tools 4.0.0

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Table(name = "acct_user")
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class AcctUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6980093847795726310L;
	private String id;
	private String nickName;
	private String telephone;
	private Date registerTime;

	public AcctUser() {

	}

	public AcctUser(String id, String nickName) {
		this.id = id;
		this.nickName = nickName;
	}


	@Id
	@Column(name = "id", unique = true, nullable = false, length = 36)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "nick_name", nullable = false)
	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Column(name = "telephone")
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "register_time", length = 19)
	public Date getRegisterTime() {
		return this.registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}


}