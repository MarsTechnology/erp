package com.ms.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ms.common.constants.Constants;

public class AuthenticationFilter implements Filter{

    private static final String ROOT_PATH = "/";
    
    private static final String VALIDATE_PATH = "/validate";
    
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		 HttpServletRequest httpReq = (HttpServletRequest) request;
	        HttpServletResponse httpResp = (HttpServletResponse) response;
	        String servletPath = httpReq.getServletPath();

	        boolean flag = false;

	        if (servletPath.equals(ROOT_PATH) || servletPath.equals(VALIDATE_PATH)) {
	            chain.doFilter(request, response);
	            flag = true;
	            return;
	        } else if (servletPath.indexOf("/webresource") >= 0) {
	            chain.doFilter(request, response);
	        } else {
	        	
	        	Object loginId = httpReq.getSession().getAttribute(Constants.SESSION_USER_KEY);
	        	if (loginId != null) {
	        		chain.doFilter(request, response);
	        	} else {
	        		if (flag == false) {
	        			httpResp.sendRedirect(httpReq.getContextPath());
	        		}
	        	}
	        }
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
