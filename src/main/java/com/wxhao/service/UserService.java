package com.wxhao.service;

import java.util.List;

import com.wxhao.entity.UserEntity;


/**
 * 创建时间：2015-2-6 下午3:18:57
 * 
 * @author wxhao
 * @version 2.2
 *  userService接口
 */

public interface UserService {
	UserEntity load(String id);

	UserEntity get(String id);

	List<UserEntity> findAll();

	void persist(UserEntity entity);

	String save(UserEntity entity);

	void saveOrUpdate(UserEntity entity);

	void delete(String id);

	void flush();
}