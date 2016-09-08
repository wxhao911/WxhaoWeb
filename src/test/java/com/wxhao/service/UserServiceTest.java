package com.wxhao.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.wxhao.entity.UserEntity;

/**
 * 创建时间：2015-2-6 下午3:31:07
 * 
 * @author andy
 * @version 2.2
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-hibernate.xml" })
public class UserServiceTest {

	private static final Logger LOGGER = Logger
			.getLogger(UserServiceTest.class);

//	@Autowired
//	private UserService userService;
//
//	@Test
//	public void save() {
//		UserEntity user = new UserEntity();
//		user.setUsername("wxhao");
//		user.setPassword("123456");
//		
//		String id = userService.save(user);
//		LOGGER.info(JSON.toJSONString(id));
//	}

}