package com.wxhao.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wxhao.entity.User;
import com.wxhao.service.IUserService;

@Controller("userController")
@RequestMapping("/user")
public class UserController {

	private static final Logger LOGGER = Logger.getLogger(UserController.class);

	@Autowired
	private IUserService userService;

	@RequestMapping("/showInfo/{userId}")
	public String showUserInfo(ModelMap modelMap, @PathVariable String userId) {
		//e2f9db4e-1739-4f83-93a8-eed12e889dd8
		LOGGER.info("查询用户：" + userId);
		User userInfo = userService.load(userId);
		modelMap.addAttribute("userInfo", userInfo);
		return "/user/showInfo";
	}

	@RequestMapping("/showInfos")
	public @ResponseBody List<User> showUserInfos() {
		LOGGER.info("查询用户全部用户");
		List<User> userInfos = userService.findAll();
		return userInfos;
	}
}
