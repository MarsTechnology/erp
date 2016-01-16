package com.ms.rbac.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ms.rbac.entity.User;
import com.ms.rbac.service.UserService;

/**
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/rbac")
public class RbacController { 
	@Resource(name="userService")
	private UserService userService;
	/**
	 * 增加用户controller
	 * @return
	 */
	@RequestMapping("/toAddUser")
	public String toAddUser(){
		userService.initAddUser();
		return "/rbac/addUser";
	}
	/**
	 * 登录controller
	 * @return
	 */
	@RequestMapping("tologin")
	public String tologin(){
		return "/rbac/login";
	}

	@RequestMapping("login")
	public String login(){ 
		return "/rbac/main";
	}
	
	@RequestMapping("addUser")
	public String addUser(User user){
		//user.setId("1");
		userService.saveUser(user);
		return "/rbac/addUser";
	}

}
