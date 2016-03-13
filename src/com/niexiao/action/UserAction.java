package com.niexiao.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niexiao.service.UserService;

@Controller
public class UserAction {
//
//	@Autowired
//	private UserService userService;

	@RequestMapping(value = "/user/list", method = RequestMethod.GET)
	public String list() {
		System.out.println("list");

		return "user/list";
	}
	
	@RequestMapping(value = "/user/list1", method = RequestMethod.GET)
	public String list1() {
		System.out.println("list1");

		return "user/list1";
	}

}
