package com.niexiao.dao;

import java.sql.SQLException;

import org.hibernate.SessionFactory;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.niexiao.entity.Organization;
import com.niexiao.entity.User;
import com.niexiao.entity.base.UserEntity;
import com.niexiao.service.OrganizationService;
import com.niexiao.service.UserService;

public class UserDaoTest {

	private static UserService userService;
	private static OrganizationService organizationService;

	
	@BeforeClass
	public static void init() {
		@SuppressWarnings("resource")
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"classpath:config/application-context.xml");
		// ApplicationContext context = new ClassPathXmlApplicationContext(
		// "application-context.xml");
		@SuppressWarnings("unused")
		SessionFactory sessionFactory = (SessionFactory) context
				.getBean("sessionFactory");
		userService = context.getBean(UserService.class);
		organizationService = context.getBean(OrganizationService.class);

	}

	@Test
	public void testSaveUser() throws SQLException {
		Organization org = organizationService.findById("5fa94114-1e6a-47bb-aa17-27a123ff58d0");

		User user = new User();
		user.setName("niexiaod");
		user.setPassword("password");
		user.setOraganzation(org);
		String id = userService.add(user);
		System.out.println("userId :" + id);
	}

	@Test
	public void testSaveOrg() throws SQLException {
		Organization org = new Organization();
		org.setName("new org");
		String id = organizationService.add(org);
		System.out.println("organizationId :" + id);
	}

	@Test
	public void testGetUser() {
		User user = userService
				.findById("4163d4d5-c8fd-436b-9b76-0306908a0382");
		System.out.println("userName :" + user.getName());
		System.out.println("organizationId :" + user.getOraganzation().getName());
	}

	@Test
	public void testDeleteUser() {
		String id = "90";
		userService.delete(id);
	}
	
	@Test
	public void testUpdateUser(){
		User user = userService
				.findById("4163d4d5-c8fd-436b-9b76-0306908a0382");
		user.setName("ndnd");
		userService.update(user);
		System.out.println("organizationId :" + user.getOraganzation().getName());
	}
}
