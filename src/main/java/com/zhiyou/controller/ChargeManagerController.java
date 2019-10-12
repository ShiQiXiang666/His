package com.zhiyou.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyou.model.ChargeManager;
import com.zhiyou.service.ChargeManagerService;

@Controller
@RequestMapping("/chargeManager")
public class ChargeManagerController {

	@Autowired
	private ChargeManagerService service;
	
	@RequestMapping("/getAllChargeManager")
	public String getAllChargeManager(@RequestParam(defaultValue="1")int pageNo,@RequestParam(defaultValue="")Map<String, String> map,HttpServletRequest request,Model model) {
		PageHelper.startPage(pageNo, 3);
		List<ChargeManager> manage= service.getAllChargeManager(map);
		PageInfo<ChargeManager> pageInfo = new PageInfo<>(manage);
		//System.out.println("ChargeManager==="+manage);
		//model.addAttribute("lists", pageInfo.getList());
		model.addAttribute("map", map);
		model.addAttribute("page", pageInfo);
		request.setAttribute("manage", manage);
		model.addAttribute("pageNo", pageNo);
		return "hospital/charge";
	}
	
}
