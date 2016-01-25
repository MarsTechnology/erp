package com.ms.rbac.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ms.common.constants.Constants;
import com.ms.rbac.entity.Group;
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
	public ModelAndView main(){
		
		return new ModelAndView("rbac/main");
	}
	
	@RequestMapping("/toAddUser")
	public String toAddUser(){
		userService.initAddUser();
		return "/rbac/addUser";
	}
	/**
	 * 
	 * @return
	 */
	@RequestMapping("tologin")
	public String tologin(){
		return "/rbac/login";
	}

	@RequestMapping("login")
	public String login(User user){ 
		
		return "/rbac/main";
	}
	
	@RequestMapping("addUser")
	public String addUser(User user){
		userService.saveUser(user);
		return "/rbac/addUser";
	}
	/**
	 * 初始化group页面
	 * @return
	 */
	@RequestMapping("groups")
	public ModelAndView groupsView(HttpServletRequest request){
		//query all group
		List<Group> groups = groupService.getAll();
		//User user =userService.getUserByid((String) request.getSession().getAttribute(Constants.SESSION_USER_KEY)); 
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("groups", groups);
		//map.put("user", user);
		ModelAndView mv = new ModelAndView("/rbac/groups","map",map);
		return mv;
	}

}
