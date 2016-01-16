package com.ms.common.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextListener implements ServletContextListener{
	@Override
	public void contextInitialized(ServletContextEvent event) {/*
		System.out.println("[ServletContextListener]��Ŀ������,helloWorld");
		ServletContext application = event.getServletContext();
		System.out.println("ʵ����Spring����");
		ApplicationContext ac = new ClassPathXmlApplicationContext("springMVC-servlet.xml");
		System.out.println("����application������:"+ac);
		application.setAttribute("ac", ac);
	*/}
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("[ServletContextListener]��Ŀ�ر���,goodbyeWorld");
	}

}
