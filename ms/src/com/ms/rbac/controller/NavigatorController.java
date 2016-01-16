package com.ms.rbac.controller;

import javax.annotation.Resource;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

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
	
	@Resource(name="userService")
	private UserService userService;
	
	@SuppressWarnings("unused")
	@RequestMapping(value = "/validate", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView authenticate(@RequestParam(required = false, value = "username") String username,
			@RequestParam(required = false, value = "password") String password,HttpServletRequest request, ServletResponse servletResponse) {
		User dbuser = null;
		ModelAndView mv = null;
		Response response = new Response();
	//	User dbuser = userService.getUserByUserName(username);
		HttpSession session = request.getSession();
		if (dbuser != null && password.equals(dbuser.getPassword())) {
			// login success
			response.setStatus(Status.FAIL);
			response.setMessage(ErrorMessageConstants.AUTHENTICATION_ERROR);
			mv = new ModelAndView("main", "response", response);
			session.setAttribute(Constants.LOGIN_SESSION_KEY, dbuser.getLogName());
		}else {
//			session.setAttribute(Constants.LOGIN_SESSION_KEY, "abc");
//			mv = new ModelAndView("redirect:rbac/main", "response", response);
			mv = new ModelAndView("redirect:/");
		}
		return mv;
	}
	
	@RequestMapping(value = "/logout")
	@ResponseBody
	public ModelAndView logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		ModelAndView mv =  new ModelAndView("redirect:/");
		return mv;
	}
	
	@RequestMapping(value = "/menuJson", method = RequestMethod.GET)
	public @ResponseBody String getMenuJson(){
		
		String temp = "[{\"id\":1, \"pid\":0, \"name\":\"权限管理\", \"open\":\"false\"},"
				+ "{\"id\":101, \"pid\":1, \"name\":\"用户组管理\", \"file\":\"/rbac/groups\"},"
				+ "{\"id\":102, \"pid\":1, \"name\":\"用户管理\", \"file\":\"core/simpleData\"},"
				+ "{\"id\":103, \"pid\":1, \"name\":\"角色管理\", \"file\":\"core/noline\"},"
				+ "{\"id\":104, \"pid\":1, \"name\":\"用户授权\", \"file\":\"core/noicon\"},"
				+ "{\"id\":2, \"pid\":0, \"name\":\"待添加\", \"open\":\"false\"},"
				+ "{\"id\":201, \"pid\":2, \"name\":\"待添加\", \"file\":\"excheck/checkbox\"}]";
		
		return temp;
	}
}
