package com.ms.rbac.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ms.common.controller.BaseController;
import com.ms.rbac.service.UserRoleService;

/**
 * @author biantd 2016年7月24日
 * @describe 用户角色原子操作controller
 */
@Controller
@RequestMapping("/rbac/userRoleController")
public class UserRoleController extends BaseController {

	@Autowired
	private UserRoleService userRoleServiceImpl;

	/**
	 * 
	 */
	public UserRoleController() {
	}

	@RequestMapping("userRoleView")
	public ModelAndView getUserRoleView(final HttpServletRequest request) {

		return mv("/rbac/userRole/userRole", "map",
				userRoleServiceImpl.getUserRoleView());

	}

	@RequestMapping("saveUserRole")
	public ModelAndView saveUserRole(final String userId, final String roleIds) {

		userRoleServiceImpl.grantUserRole(userId, roleIds);

		return mv("/rbac/user/userList", "map", map);

	}

}
