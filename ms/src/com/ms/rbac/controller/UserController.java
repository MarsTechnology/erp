package com.ms.rbac.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ms.common.controller.BaseController;
import com.ms.rbac.entity.Group;
import com.ms.rbac.entity.User;
import com.ms.rbac.service.GroupService;
import com.ms.rbac.service.UserService;

/**
 * @author biantd 2016年7月23日
 * @describe
 */
@Controller
@RequestMapping("/rbac/userController")
public class UserController extends BaseController {

	@Autowired
	private UserService userServiceImpl;
	@Autowired
	private GroupService groupServiceImpl;

	/**
	 * 
	 */
	public UserController() {
	}

	/**
	 * 查询所有用户
	 * 
	 * @param request
	 * @return 用户列表
	 */
	@RequestMapping("userList")
	public ModelAndView getAllUser(final HttpServletRequest request) {

		final List<User> users = userServiceImpl.getAllUser();
		final List<Group> groups = groupServiceImpl.getAll();
		map.put("userList", users);
		map.put("groupList", groups);
		return mv("/rbac/user/userList", "map", map);

	}

	/**
	 * 保存单一用户
	 * 
	 * @param user
	 *            用户对象
	 * @param groupId
	 * @return 查询用户
	 */
	@RequestMapping("saveUser")
	public ModelAndView saveUser(final User user, final String groupId) {
		user.setGroup(groupServiceImpl.getById(groupId));
		userServiceImpl.saveUser(user);
		return mv("/rbac/user/userList", "map", map);
	}

}
