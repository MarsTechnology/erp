package com.ms.rbac.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ms.common.controller.BaseController;
import com.ms.rbac.entity.Role;
import com.ms.rbac.entity.User;
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

		return mv("/rbac/user/userList", "map",
				userRoleServiceImpl.getUserRoleView());

	}

	@RequestMapping("saveUserRole")
	public ModelAndView saveUserRole(final User user, final List<Role> roles) {

		return mv("/rbac/user/userList", "map", map);

	}

}
