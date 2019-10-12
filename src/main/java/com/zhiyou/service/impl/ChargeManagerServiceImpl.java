package com.zhiyou.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.mapper.ChargeManagerMapper;
import com.zhiyou.model.ChargeManager;
import com.zhiyou.service.ChargeManagerService;
@Service
public class ChargeManagerServiceImpl implements ChargeManagerService {

	@Autowired
	private ChargeManagerMapper mapper;
	
	@Override
	public List<ChargeManager> getAllChargeManager(Map<String, String> map) {
		// TODO Auto-generated method stub
		return mapper.getAllChargeManager(map);
	}

}
