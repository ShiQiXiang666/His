package com.zhiyou.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.mapper.DrugMapper;
import com.zhiyou.model.Drug;
import com.zhiyou.service.DrugService;
@Service
public class DrugServiceImpl implements DrugService {

	@Autowired
	private DrugMapper mapper;
	
	@Override
	public List<Drug> getAllDrug(Map<String, String> map) {
		// TODO Auto-generated method stub
		return mapper.getAllDrug(map);
	}

	@Override
	public int insertSelective(Drug record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	@Override
	public Drug selectByPrimaryKey(String drugNum) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(drugNum);
	}

	@Override
	public int updateByPrimaryKeySelective(Drug record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(record);
	}

}
