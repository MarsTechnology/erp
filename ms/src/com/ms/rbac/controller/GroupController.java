package com.ms.rbac.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
@RequestMapping("/rbac/groupController")
public class GroupController { 
	@Resource(name="groupService")
	private GroupService groupService;
	
	@RequestMapping("/toAddGroup")
	public String toAdd(){
		return "/rbac/addGroup";
	}
	
	@RequestMapping("tologin")
	public String tologin(){
		return "/rbac/login";
	}

	@RequestMapping("login")
	public String login(){ 
		return "/rbac/main";
	}
	
	@RequestMapping("addGroup")
	public String addUser(Group group){
		groupService.saveGroup(group);
		return "/rbac/addGroup";
	}

}
