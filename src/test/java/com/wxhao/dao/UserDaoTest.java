package com.wxhao.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wxhao.entity.AcctUser;
import com.wxhao.entity.UserEntity;
import com.wxhao.util.Hibernate4Util;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-hibernate.xml" })
public class UserDaoTest {
	
	
	
	public void save(){
		
		
		Session session = null;
		  Transaction tx = null;
		  try {
		   session =Hibernate4Util.getCurrentSession();
		   tx = session.beginTransaction();
		   
		   UserEntity user = new UserEntity();
			user.setUsername("wxhao");
			user.setPassword("123456");
		   session.save(user);

		  } catch (HibernateException e) {
		   if (tx != null)
		    tx.rollback();
		   throw e;  //这个时候最好是把异常抛出去，因为如果只是回滚的话，就没有任何提示给调用者。
		  } finally {
		   session.close();
		  }
	}
	
	@Autowired
	private UserDao userDao;
	
	
	@Test
	public void test2(){
		AcctUser user = new AcctUser();
		user.setNickName("wxhao");
		user.setTelephone("123456");
		userDao.persist(user);
	}
	
	
//	public static void main(String[] args) {
//		UserDaoTest xx=new UserDaoTest();
//		xx.test2();
//	}
}
