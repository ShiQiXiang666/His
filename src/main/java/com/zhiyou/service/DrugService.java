package com.zhiyou.service;

import java.util.List;
import java.util.Map;

import com.zhiyou.model.Drug;

public interface DrugService {

	List<Drug> getAllDrug(Map<String, String> map);
	
	//添加
	int insertSelective(Drug record);
	
	//查询
	 Drug selectByPrimaryKey(String drugNum);
	 
	 int updateByPrimaryKeySelective(Drug record);
}
