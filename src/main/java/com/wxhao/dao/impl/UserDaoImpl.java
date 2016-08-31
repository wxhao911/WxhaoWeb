package com.wxhao.dao.impl;

import org.springframework.stereotype.Repository;

import com.wxhao.dao.UserDao;
import com.wxhao.entity.UserEntity;

/**
 * 创建时间：2015-2-6 下午2:45:14
 * 
 * @author andy
 * @version 2.2
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<UserEntity, String> implements UserDao  {


}