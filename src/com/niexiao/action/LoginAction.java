package com.niexiao.action;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niexiao.dao.UserDao;
import com.niexiao.model.User;
import com.niexiao.service.UserService;

@Controller
public class LoginAction {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String test() {
		System.out.println("sdf");
		User user = new User();
		user.setName("action");
		user.setPassword(new Date().toLocaleString());
		userService.addUser(user);
		return "welcome";
	}

	public String test1() {
		// branshi
		// asdfds

		// asdfsdfa
		return "welcome";
	}

	public String test2() {
		return "welcome";
	}

	public String test3() {
		//DFASDF
		//niexiao
		return "welcome";
	}

}
