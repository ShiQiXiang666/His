package com.zhiyou.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.mapper.RegistrationInforMapper;
import com.zhiyou.model.RegistrationInfor;
import com.zhiyou.service.RegistrationInforService;
@Service
public class RegistrationInforServiceImpl implements RegistrationInforService {

	@Autowired
	private RegistrationInforMapper mapper;
	
	@Override
	public List<RegistrationInfor> getAllRegistrationInfor(Map<Object, String> map) {
		// TODO Auto-generated method stub
		return mapper.getAllRegistrationInfor(map);
	}

	@Override
	public int count(Map<Object, String> map) {
		// TODO Auto-generated method stub
		return mapper.getcount(map);
	}

	@Override
	public void addregistrationInfor(RegistrationInfor reg) {
		// TODO Auto-generated method stub
		mapper.addregistrationInfor(reg);
	}

	@Override
	public RegistrationInfor getReg(Map<String, String> map) {
		// TODO Auto-generated method stub
		return mapper.getReg(map);
	}

	@Override
	public void updateReg(RegistrationInfor reg) {
		// TODO Auto-generated method stub
		mapper.updateReg(reg);
	}

	@Override
	public RegistrationInfor getRegById(Map<String, String> map) {
		// TODO Auto-generated method stub
		return mapper.getRegById(map);
	}

	@Override
	public void deleteReg(List<String> list) {
		// TODO Auto-generated method stub
		mapper.deleteReg(list);
	}

}
