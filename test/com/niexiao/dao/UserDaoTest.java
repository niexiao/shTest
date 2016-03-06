package com.niexiao.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.hibernate.SessionFactory;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.niexiao.entity.User;
import com.niexiao.service.UserService;

public class UserDaoTest {

	private static UserService userService;

	@BeforeClass
	public static void init() {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"classpath:test-application-context.xml");
		// ApplicationContext context = new ClassPathXmlApplicationContext(
		// "application-context.xml");
		SessionFactory sessionFactory = (SessionFactory) context
				.getBean("sessionFactory");
		userService = context.getBean(UserService.class);

	}

	@Test
	public void testSaveUser() throws SQLException {
		User user = new User();
		user.setName("niexiaod");
		user.setPassword("password");
		String id = userService.addUser(user);
		System.out.println("userId :" + id);
	}

	@Test
	public void testDeleteUser() {
		String id = "90";
		userService.deleteUser(id);
	}

	@Ignore
	@Test
	public void test() {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"/WebContent/WEB-INF/config/application-context.xml");

	}

}
