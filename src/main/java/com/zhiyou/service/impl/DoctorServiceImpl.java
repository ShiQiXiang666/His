package com.zhiyou.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.mapper.DoctorMapper;
import com.zhiyou.model.Doctor;
import com.zhiyou.service.DoctorService;
@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorMapper mapper;
	
	@Override
	public List<Doctor> getAllDoctor(Map<Object, String> map) {
		// TODO Auto-generated method stub
		return mapper.getAllDoctor(map);
	}

	@Override
	public int getCount(Map<Object, String> map) {
		// TODO Auto-generated method stub
		return mapper.getCount(map);
	}

	@Override
	public Doctor getDoctorById(Map<String, String> map) {
		// TODO Auto-generated method stub
		return mapper.getDoctorById(map);
	}

	@Override
	public int insertSelective(Doctor record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int updateByPrimaryKeySelective(Doctor record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(record);
	}

}
