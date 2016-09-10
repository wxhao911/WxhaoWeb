package com.wxhao.controller.api;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.wxhao.dao.IUserDao;
import com.wxhao.entity.User;
import com.wxhao.service.IUserService;

/**
 * 测试controller
 * @author wxhao
 *
 */
@Controller("testController")
@RequestMapping("/api/test")
public class TestController {

	@Autowired
	private IUserService userService;
	
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
		
		User user = null;
		
		Random r=new Random();
		
		List<String> list=new ArrayList<String>();
		for(int i =0; i<2;i++){
			user = new User();
			user.setUsername("wxhao"+r.nextInt());
			user.setPassword("123456");
			String id=userService.save(user);
			list.add(id);
		}
		System.out.println("/////////");
		user = new User();
		user.setUsername("wxhao"+r.nextInt());
		user.setPassword("123456");
		userService.persist(user);
		System.out.println("++++++++");
		System.out.println("*-----------------");
		userService.flush();
		JSONObject json=new JSONObject();
//		userDao.findAll();
		json.put("list", list);
//		json.put("list", list);
		out.write(json.toString());
		out.flush();
		out.close();
	}
	
	
	
}
