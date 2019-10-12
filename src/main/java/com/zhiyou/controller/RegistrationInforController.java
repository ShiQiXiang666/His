package com.zhiyou.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyou.model.RegistrationInfor;

import com.zhiyou.service.RegistrationInforService;

@Controller
public class RegistrationInforController {

	@Autowired
	private RegistrationInforService service;

	@RequestMapping("/registration/index")
	public String getAll(HttpServletRequest request, @RequestParam(defaultValue = "1") int pageNo, String idNum,
			String name, String seccoName, String time, String endtime, Model model) {
		Map<Object, String> map = new HashMap<>();
		map.put("idNum", idNum);
		map.put("name", name);
		map.put("seccoName", seccoName);
		map.put("time", time);
		map.put("endtime", endtime);
		int total = service.count(map);
		PageHelper.startPage(pageNo, 3);
		List<RegistrationInfor> list = service.getAllRegistrationInfor(map);
		request.setAttribute("list", list);
		PageInfo<RegistrationInfor> pageInfo = new PageInfo<>(list);
		// System.out.println("登录成功查询的全部用户 : " + list);
		model.addAttribute("lists", pageInfo.getList());
		model.addAttribute("map", map);
		model.addAttribute("page", pageInfo);
		return "registration/index";
	}

	@RequestMapping("/addregistrationInfor")
	public String addregistrationInfor(RegistrationInfor reg) {
		service.addregistrationInfor(reg);
		return "redirect:/registration/index";
	}

	// 根据身份查看信息
	@RequestMapping("/edithtml")
	public String edithtml(String medicalRecord, HttpServletRequest request) {
		Map<String, String> map = new HashMap<>();
		map.put("medicalRecord", medicalRecord);
		RegistrationInfor reg = service.getReg(map);
		request.setAttribute("reg", reg);
		System.out.println(reg);
		return "registration/edit";
	}

	@RequestMapping("/editReg")
	public String editReg(RegistrationInfor reg) {
		service.updateReg(reg);

		return "redirect:/registration/index";
	}

	// 查看详情
	@RequestMapping("/lookhtml")
	public String getRegById(String idNum, HttpServletRequest request) {
		Map<String, String> map = new HashMap<>();
		map.put("idNum", idNum);
		RegistrationInfor reg = service.getRegById(map);
		request.setAttribute("reg", reg);
		System.out.println("查询到的信息:" + reg);
		return "registration/look";
	}

	@RequestMapping("/deleteReg")
	public String deleteReg(@RequestParam(defaultValue="")String[] check) {
		System.out.println("1234567812345623456");
		if(check.length != 0 && check != null) {
			List<String> list = new ArrayList<String>();
			for (String cc : check) {
				list.add(cc);
			}
			
			System.out.println("选中的编号:"+list);
			service.deleteReg(list);
			
		}
		
		return "redirect:/registration/index";
	}
	
	
}
