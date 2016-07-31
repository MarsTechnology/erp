package com.ms.rbac.controller;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ms.common.Response;
import com.ms.common.constants.Constants;
import com.ms.common.constants.ErrorMessageConstants;
import com.ms.common.enums.Status;
import com.ms.rbac.entity.User;
import com.ms.rbac.service.UserService;

@Controller
@RequestMapping("/")
public class NavigatorController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/validate", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView authenticate(
			@RequestParam(required = false, value = "username") final String username,
			@RequestParam(required = false, value = "password") final String password,
			final HttpServletRequest request,
			final ServletResponse servletResponse) {
		User dbuser = null;
		ModelAndView mv = null;
		final Response response = new Response();
		dbuser = userService.getUserBylogName(username);
		final HttpSession session = request.getSession();
		if (dbuser != null) {
			// login success
			if (password.equals(dbuser.getPassword())) {
				response.setStatus(Status.SUCCESS);
				response.setMessage(ErrorMessageConstants.LOGIN_SUCCESS);
				mv = new ModelAndView("redirect:rbac/main", "response",
						response);
				session.setAttribute(Constants.SESSION_USER_KEY, dbuser.getId());
				session.setAttribute(Constants.SESSION_GROUP_KEY, dbuser
						.getGroup().getId());
			} else {
				// password error
				response.setStatus(Status.FAIL);
				response.setMessage(ErrorMessageConstants.AUTHENTICATION_ERROR);
				mv = new ModelAndView("redirect:/", "response", response);
			}
		} else {
			// user not exist
			response.setStatus(Status.FAIL);
			response.setMessage(ErrorMessageConstants.USERNOTEXIST_ERROR);
			mv = new ModelAndView("redirect:/", "response", response);
		}
		return mv;
	}

	@RequestMapping(value = "/logout")
	@ResponseBody
	public ModelAndView logout(final HttpServletRequest request) {
		final HttpSession session = request.getSession();
		session.invalidate();
		final ModelAndView mv = new ModelAndView("redirect:/");
		return mv;
	}

	/**
	 * 根据登录员权限进行菜单展示
	 * 
	 * @return
	 */
	@RequestMapping(value = "/menuJson", method = RequestMethod.GET, produces = { "text/json;charset=UTF-8" })
	public @ResponseBody
	String getMenuJson(final HttpSession session) {
		// 登录员id
		final String userId = (String) session
				.getAttribute(Constants.SESSION_USER_KEY);
		// 根据登录员id获取对应的权限，进行菜单展示

		final String temp = "[{\"id\":1, \"pid\":0, \"name\":\"权限管理\", \"open\":\"false\"},"
				+ "{\"id\":101, \"pid\":1, \"name\":\"用户组管理\", \"file\":\"/rbac/groupController/groups\"},"
				+ "{\"id\":102, \"pid\":1, \"name\":\"用户管理\", \"file\":\"/rbac/userController/userList\"},"
				+ "{\"id\":103, \"pid\":1, \"name\":\"角色管理\", \"file\":\"/rbac/roleController/roleList\"},"
				+ "{\"id\":104, \"pid\":1, \"name\":\"用户授权\", \"file\":\"/rbac/userRoleController/userRoleView\"},"
				+ "{\"id\":2, \"pid\":0, \"name\":\"待添加\", \"open\":\"false\"},"
				+ "{\"id\":201, \"pid\":2, \"name\":\"待添加\", \"file\":\"excheck/checkbox\"}]";
		return temp;
	}
}
