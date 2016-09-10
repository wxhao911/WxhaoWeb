package com.wxhao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxhao.dao.IUserDao;
import com.wxhao.entity.User;
import com.wxhao.service.IUserService;
import com.wxhao.util.base.BaseService;

@Service("userService")
public class UserService extends BaseService<User, String> implements IUserService{
	
	@Autowired
	IUserDao userDao;
	
	@Autowired
	public void setBaseDao(IUserDao userDao) {
		super.setBaseDao( userDao);
	}
	
}
