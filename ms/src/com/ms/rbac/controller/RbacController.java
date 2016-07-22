package com.ms.rbac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ms.rbac.entity.User;
import com.ms.rbac.service.GroupService;
import com.ms.rbac.service.UserService;

/**
 * 
 * @author Administrator
 * 
 */
@Controller
@RequestMapping("/rbac")
public class RbacController {
	@Autowired
	private UserService userService;
	@Autowired
	private GroupService groupService;

	/**
	 * 
	 * @return
	 */
	@RequestMapping("/main")
	public ModelAndView main() {

		return new ModelAndView("rbac/main");
	}

	@RequestMapping("/toAddUser")
	public String toAddUser() {
		userService.initAddUser();
		return "/rbac/addUser";
	}

	/**
	 * 
	 * @return
	 */
	@RequestMapping("tologin")
	public String tologin() {
		return "/rbac/login";
	}

	@RequestMapping("login")
	public String login(final User user) {

		return "/rbac/main";
	}

	@RequestMapping("addUser")
	public String addUser(final User user) {
		userService.saveUser(user);
		return "/rbac/addUser";
	}

}
