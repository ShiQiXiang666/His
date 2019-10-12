package com.zhiyou.controller;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyou.model.Drug;
import com.zhiyou.service.DrugService;

@Controller
@RequestMapping("/drug")
public class DrugController {

	@Autowired
	private DrugService service;
	
	@RequestMapping("/list")
	public String getAllDrug(@RequestParam(defaultValue="1")int pageNo,HttpServletRequest request,@RequestParam(defaultValue="")Map<String, String> map,Model model) {
		PageHelper.startPage(pageNo, 3);
		List<Drug> list= service.getAllDrug(map);
		PageInfo<Drug> pageInfo = new PageInfo<>(list);
		model.addAttribute("lists", pageInfo.getList());
		model.addAttribute("map", map);
		model.addAttribute("page", pageInfo);
		request.setAttribute("list", list);
		request.setAttribute("pageNo", pageNo);
		return "medicine/index";
	}
	
	@RequestMapping("/addDrug")
	public String addDrug(@RequestParam("file")MultipartFile file,Drug drug,HttpServletRequest request) throws IOException {
		String realPath = request.getServletContext().getRealPath("upload");
		System.out.println("上传目的地:"+realPath);
		File f = new File(realPath);
		System.out.println("file:"+f);
		if(f.exists()) {
			f.mkdir();
		}
		String filename = file.getOriginalFilename();
		System.out.println("文件名:"+filename);
		//分割文件名,存入string数组中,以.分割 \\转义
		String[] split = filename.split("\\.");
		System.out.println("分割存入数组:"+Arrays.toString(split));
		String suffix = split[1];
		System.out.println("通过下标取出后缀:"+split[1]);
		long prefix = new Date().getTime();
		String newFileName = prefix+"."+suffix;
		System.out.println("新的文件名:"+newFileName);
		System.out.println("上传时文件名:"+filename);
		File newFile = new File(f,newFileName);
		FileUtils.writeByteArrayToFile(newFile, file.getBytes());
		request.setAttribute("path", "/upload/"+newFileName);
		
		String url ="/upload/"+newFileName;
		drug.setDrugUrl(url);
		
		service.insertSelective(drug);
		return "redirect:/drug/list";
	}
	
	@RequestMapping("/lookDrug")
	public String lookDrug(String drugNum,HttpServletRequest request) {
		Drug drug = service.selectByPrimaryKey(drugNum);
		request.setAttribute("drug", drug);
		//System.out.println(drug);
		//System.out.println(drug.getDrugUrl());
		return "medicine/look";
	}
	
	@RequestMapping("/getDrugByNum")
	public String getDrug(String drugNum,HttpServletRequest request) {
		Drug drug = service.selectByPrimaryKey(drugNum);
		request.setAttribute("drug", drug);
		return "medicine/edit";
	}
	
	@RequestMapping("/updateDrug")
	public String updateDrug(Drug drug) {
		service.updateByPrimaryKeySelective(drug);
		return "redirect:/drug/list";
	}
	
}
