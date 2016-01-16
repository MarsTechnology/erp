package com.ms.rbac.controller;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView login(ServletRequest request, ServletResponse response) {
		ModelAndView modelAndView = new ModelAndView();
		HttpServletRequest httpReq = (HttpServletRequest) request;
		modelAndView.setViewName("index");
		return modelAndView;
	}
}
