package com.ms.common.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.servlet.ModelAndView;

public abstract class BaseController {

	public BaseController() {
	}

	protected Map<String, Object> map = new HashMap<String, Object>();

	protected ModelAndView mv() {
		final ModelAndView mv = new ModelAndView();
		return mv;
	}

	protected ModelAndView mv(final String url) {
		final ModelAndView mv = new ModelAndView(url);
		return mv;
	}

	protected ModelAndView mv(final String url, final String collectionType,
			final Map<String, Object> map) {
		final ModelAndView mv = new ModelAndView(url, collectionType, map);
		return mv;
	}

	protected Map<String, Object> map() {
		return new HashMap<String, Object>();
	}
}
