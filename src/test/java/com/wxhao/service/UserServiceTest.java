package com.wxhao.service;


import java.util.Random;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.wxhao.dao.IUserDao;
import com.wxhao.entity.User;


/**
 * 创建时间：2016-9-6 下午3:31:07
 * 
 * @author wxhao
 * @version 2.2
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-hibernate.xml" })
public class UserServiceTest {

	private static final Logger LOGGER = Logger
			.getLogger(UserServiceTest.class);

	@Autowired
	private IUserDao userDao;

	@Test
	public void save() {
		Random r=new Random();
		User user = new User();
		user = new User();
		user.setUsername("wxhao"+r.nextInt());
		user.setPassword("123456");
		String id=userDao.save(user);
		
		LOGGER.info(JSON.toJSONString(id));
	}

}