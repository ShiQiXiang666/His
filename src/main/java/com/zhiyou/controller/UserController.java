package com.zhiyou.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou.model.User;
import com.zhiyou.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	@RequestMapping("/login")
	public String loginUser(String username,String password,Model model) {
		Map<String, String> map = new HashMap<>();
		map.put("username", username);
		map.put("password", password);
		User user = service.loginUser(map);
		if(user != null) {
			model.addAttribute("user", user);
			return "index";
		}
		model.addAttribute("error", "用户名或密码错误");
		return "forward:login.jsp";
	}
}
