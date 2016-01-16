package com.ms.test;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.ms.rbac.dao.UserDao;
import com.ms.rbac.dao.impl.UserDaoImpl;
import com.ms.rbac.entity.User;

/**
 * rbac模块单元测试类
 * @author Administrator
 *
 */
@ContextConfiguration(locations = "classpath:config:hibernate.xml")
public class TestRbac {
	
	private UserDao dao  = new UserDaoImpl();
	
	private SessionFactory sf;
	
//	   @BeforeClass
//	    public static void beforeClass() {
//	        try {
//	            sf = new Configuration().configure().buildSessionFactory();
//	        } catch (HibernateException e) {
//	            e.printStackTrace();
//	        }
	    
	
	@Test
	public void testUserSave(){
		User u  = new User();
		u.setCreateTime(new Date());
		u.setLogName("bian");
		u.setPassword("1234");
		dao.save(u);
		
	}

}
