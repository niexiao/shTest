package com.niexiao.action;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niexiao.entity.User;
import com.niexiao.service.UserService;

@Controller
public class LoginAction {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String test() {
		System.out.println("index");
		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(String username, String password) {
		System.out.println("login");
		System.out.println("username:" + username);
		System.out.println("password:" + password);

		return "main";
	}
}
