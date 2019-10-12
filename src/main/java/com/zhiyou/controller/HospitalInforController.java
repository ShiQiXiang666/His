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

import com.zhiyou.model.HospitalInfor;
import com.zhiyou.model.RegistrationInfor;
import com.zhiyou.service.HospitalInforService;
import com.zhiyou.service.RegistrationInforService;

@Controller
@RequestMapping("/hospital")
public class HospitalInforController {

	@Autowired
	private HospitalInforService service;
	
	@Autowired
	private RegistrationInforService regservice;
	
	@RequestMapping("/index")
	public String getList(Model model,@RequestParam(defaultValue="1")int pageNo,@RequestParam(defaultValue="")Map<String, String> map,HttpServletRequest request) {
		PageHelper.startPage(pageNo, 3);
		List<HospitalInfor> list = service.getAllHospitalInfor(map);
		request.setAttribute("list", list);
		PageInfo<HospitalInfor> pageInfo = new PageInfo<>(list);
		model.addAttribute("lists", pageInfo.getList());
		model.addAttribute("map", map);
		model.addAttribute("page", pageInfo);
		request.setAttribute("pageNo", pageNo);
		//System.out.println(list);
		return "hospital/index";
	}
	
	@RequestMapping("/getRegMessage")
	public String getReg(@RequestParam(defaultValue="")Map<String, String> map,HttpServletRequest request) {
		//System.out.println(map);
		RegistrationInfor reg = regservice.getReg(map);
		//System.out.println(reg);
		request.setAttribute("reg", reg);
		return "hospital/add";
	}
	
	//添加
	@RequestMapping("/addHospitalInfor")
	public String addHospital(HospitalInfor hos) {
		//System.out.println(hos);
		service.insertSelective(hos);
		
		return "redirect:/hospital/index";
	}
	
	@RequestMapping("/gethospitalinfor")
	public String getHos(@RequestParam(defaultValue="")Map<String, String> map,HttpServletRequest request) {
		HospitalInfor hos= service.getHospital(map);
		System.out.println(hos);
		RegistrationInfor reg = regservice.getReg(map);
		System.out.println(reg);
		request.setAttribute("hos", hos);
		request.setAttribute("reg", reg);
		 return "hospital/edit";
	}
	
	@RequestMapping("/updateHospital")
	public String updateHospital(HospitalInfor hos) {
		service.updateHospitalInfor(hos);
		return "redirect:/hospital/index";
	}
	
	
}
