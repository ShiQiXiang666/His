package com.zhiyou.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyou.model.Doctor;

import com.zhiyou.service.DoctorService;

@Controller()
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired
	private DoctorService service;
	
	@RequestMapping("/index")
	public String getAllDoctor(Model model,HttpServletRequest request,@RequestParam(defaultValue="")Map<Object, String> map,@RequestParam(defaultValue="1")int pageNo) {

		//int total = service.getCount(map);
		PageHelper.startPage(pageNo, 2);
		List<Doctor> list=service.getAllDoctor(map);		
		request.setAttribute("list", list);
		PageInfo<Doctor> pageInfo = new PageInfo<>(list);
		model.addAttribute("lists", pageInfo.getList());
		model.addAttribute("map", map);
		model.addAttribute("page", pageInfo);
		model.addAttribute("pageNo",pageNo);
		/*System.out.println("lists"+ pageInfo.getList());
		System.out.println("map"+ map);
		System.out.println("page"+ pageInfo);
		System.out.println(pageNo);
		System.out.println("total"+total);*/
		return "doctor/index";
	}
	
	//详情
	@RequestMapping("/lookDoctor")
	public String lookDoctor(@RequestParam(defaultValue="")Map<String, String> map,HttpServletRequest request) {
		Doctor doctor =service.getDoctorById(map);
		request.setAttribute("doctor", doctor);
		//System.out.println(doctor);
		return "doctor/look";
	}
	
	//添加
	@RequestMapping("/addDoctor")
	public String addDoctor(Doctor doctor) {
		//System.out.println(doctor);
		service.insertSelective(doctor);
		return "redirect:/doctor/index";
	}
	
	@RequestMapping("/getDoctor")
	public String getDoctor(@RequestParam(defaultValue="")Map<String, String> map,HttpServletRequest request) {
		Doctor doctor = service.getDoctorById(map);
		request.setAttribute("doctor", doctor);
		return "doctor/edit";
	}
	
	//修改
	@RequestMapping("/updateDoctor")
	public String updateDoctor(Doctor doctor) {
		int update = service.updateByPrimaryKeySelective(doctor);
		
		return "redirect:/doctor/index";
	}
}
