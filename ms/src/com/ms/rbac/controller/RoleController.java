package com.ms.rbac.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ms.common.controller.BaseController;
import com.ms.rbac.entity.Role;
import com.ms.rbac.service.RoleService;

/**
 * @author biantd 2016年7月23日
 * @describe
 */
@Controller
@RequestMapping("/rbac/roleController")
public class RoleController extends BaseController {

	@Autowired
	private RoleService roleServiceImpl;

	/**
	 * 
	 */
	public RoleController() {
	}

	/**
	 * 查询所有角色
	 * 
	 * @param request
	 * @return 角色列表
	 */
	@RequestMapping("roleList")
	public ModelAndView getAllRole(final HttpServletRequest request) {

		final List<Role> roles = roleServiceImpl.getAll();
		map.put("roleList", roles);
		return mv("/rbac/role/roleList", "map", map);

	}

	/**
	 * 保存单一角色
	 * 
	 * @param role
	 *            用户对象
	 * 
	 * @return 角色列表视图
	 */
	@RequestMapping("saveRole")
	public ModelAndView saveUser(final Role role) {
		roleServiceImpl.saveRole(role);
		return mv("/rbac/role/roleList", "map", map);
	}

}
