package com.zhiyou.service;

import java.util.List;
import java.util.Map;

import com.zhiyou.model.Doctor;

public interface DoctorService {

	List<Doctor> getAllDoctor(Map<Object, String> map);

	int getCount(Map<Object, String> map);

	Doctor getDoctorById(Map<String, String> map);

	int insertSelective(Doctor record);
	
	int updateByPrimaryKeySelective(Doctor record);
}
