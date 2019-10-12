package com.zhiyou.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zhiyou.model.Permission;
import com.zhiyou.service.PermissionService;

@Controller
@RequestMapping("/permission")
public class PermissionController {

	@Autowired
	private PermissionService service;
	
	@RequestMapping("/getAllPermission")
	public String getAllPermission(@RequestParam(defaultValue="")Map<String, String> map) {
		List<Permission> permission = service.getAllPermission(map);
		return "hospital/charge";
	}
	
}
