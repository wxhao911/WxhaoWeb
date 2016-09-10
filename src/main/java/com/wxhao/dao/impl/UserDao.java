package com.wxhao.dao.impl;

import org.springframework.stereotype.Repository;

import com.wxhao.dao.IUserDao;
import com.wxhao.entity.User;
import com.wxhao.util.base.BaseDao;

@Repository("userDao")
public class UserDao extends BaseDao<User, String> implements IUserDao{


}
