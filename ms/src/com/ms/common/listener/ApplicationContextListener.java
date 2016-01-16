package com.ms.common.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextListener implements ServletContextListener{
	@Override
	public void contextInitialized(ServletContextEvent event) {/*
		System.out.println("[ServletContextListener]项目启动了,helloWorld");
		ServletContext application = event.getServletContext();
		System.out.println("实例化Spring容器");
		ApplicationContext ac = new ClassPathXmlApplicationContext("springMVC-servlet.xml");
		System.out.println("存入application作用域:"+ac);
		application.setAttribute("ac", ac);
	*/}
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("[ServletContextListener]项目关闭了,goodbyeWorld");
	}

}
