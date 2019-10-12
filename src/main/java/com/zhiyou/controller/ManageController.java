package com.zhiyou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManageController {

	@RequestMapping("/addRegistration")
	public String forwardIndex() {
		
		return "registration/add";
	}
	
	@RequestMapping("/returnindex")
	public String returnin() {
		
		return "redirect:/registration/index";
	}
	
	@RequestMapping("/addDoctorjsp")
	public String edithtml() {
		return "doctor/add";
	}
	
	//drug
	@RequestMapping("/addjsp")
	public String forwardAddjsp() {
		return "medicine/add";
	}
	
	@RequestMapping("/returnDrugIndex")
	public String returnDrugIndex() {
		return "redirect:/drug/list";
	}
	@RequestMapping("/houpitalInforjsp")
	public String forwardhou() {
		return "hospital/add";
	}
	
	
}
