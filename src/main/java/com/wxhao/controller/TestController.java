package com.wxhao.controller;

import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wxhao.dao.UserDao;
import com.wxhao.entity.AcctUser;

@Controller("testController")
@RequestMapping("/test")
public class TestController {

	@Autowired
	private UserDao userDao;
	
	/**
	 * api/test/t.jhtml?
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping("/t")
	@ResponseBody
	public void t(HttpServletRequest request,HttpServletResponse response)throws Exception{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		
		//int data =OrderItemDao.countSale(DateUtil.getTimesWeekmorning(), DateUtil.getTimesWeeknight(), new Long(67),"quantity");
//		AcctUser user = new AcctUser();
//		user.setNickName("wxhao");
//		user.setTelephone("123456");
//		userDao.persist(user);
		AcctUser acctUser = new AcctUser();
		acctUser.setId(UUID.randomUUID().toString());
		acctUser.setNickName("andy");
		acctUser.setRegisterTime(new Date());
		acctUser.setTelephone("13022221111");
		String id = userDao.save(acctUser);
		userDao.flush();
		List<AcctUser> list=userDao.findAll();
		JSONObject json=new JSONObject();
		json.put("id", id);
		json.put("list", list);
		out.write(json.toString());
		out.flush();
		out.close();
	}
}
