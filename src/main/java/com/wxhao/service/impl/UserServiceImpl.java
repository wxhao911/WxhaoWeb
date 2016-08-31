package com.wxhao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxhao.dao.UserDao;
import com.wxhao.entity.UserEntity;
import com.wxhao.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	public UserEntity load(String id) {
		
		return userDao.load(id); 
	}

	public UserEntity get(String id) {
		// TODO Auto-generated method stub
		return userDao.get(id);
	}

	public List<UserEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void persist(UserEntity entity) {
		// TODO Auto-generated method stub
		userDao.persist(entity);
	}

	public String save(UserEntity entity) {
		// TODO Auto-generated method stub
		return userDao.save(entity);
	}

	public void saveOrUpdate(UserEntity entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	public void flush() {
		// TODO Auto-generated method stub
		
	}

}
