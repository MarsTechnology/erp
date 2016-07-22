package com.ms.rbac.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ms.rbac.entity.Group;
import com.ms.rbac.service.GroupService;

/**
 * 
 * @author Administrator
 * 
 */
@Controller
@RequestMapping("/rbac/groupController")
public class GroupController {
	@Autowired
	private GroupService groupService;

	/**
	 * 初始化group页面
	 * 
	 * @return
	 */
	@RequestMapping("groups")
	public ModelAndView groupsView(final HttpServletRequest request) {
		// query all group
		final List<Group> groups = groupService.getAll();
		// User user =userService.getUserByid((String)
		// request.getSession().getAttribute(Constants.SESSION_USER_KEY));
		final Map<String, Object> map = new HashMap<String, Object>();
		map.put("groups", groups);
		// map.put("user", user);
		final ModelAndView mv = new ModelAndView("/rbac/group/groups", "map",
				map);
		return mv;
	}

	/**
	 * 保存部门
	 * 
	 * @param request
	 * @param group
	 * @return
	 */
	@RequestMapping("saveGroup")
	public ModelAndView saveGroup(final HttpServletRequest request,
			final Group group) {
		groupService.saveGroup(group);
		final ModelAndView mv = new ModelAndView("redirect:/rbac/group/groups");
		return mv;
	}

}
