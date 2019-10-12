package com.zhiyou.service;

import java.util.List;
import java.util.Map;

import com.zhiyou.model.HospitalInfor;

public interface HospitalInforService {

	 List<HospitalInfor> getAllHospitalInfor(Map<String, String> map);
	 
	 int insertSelective(HospitalInfor record);

	HospitalInfor getHospital(Map<String, String> map);

	void updateHospitalInfor(HospitalInfor hos);
}
