package com.zhiyou.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.mapper.HospitalInforMapper;
import com.zhiyou.model.HospitalInfor;
import com.zhiyou.service.HospitalInforService;
@Service
public class HospitalInforServiceImpl implements HospitalInforService {

	@Autowired
	private HospitalInforMapper mapper;
	
	@Override
	public List<HospitalInfor> getAllHospitalInfor(Map<String, String> map) {
		// TODO Auto-generated method stub
		return mapper.getAllHospitalInfor(map);
	}

	@Override
	public int insertSelective(HospitalInfor record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public HospitalInfor getHospital(Map<String, String> map) {
		// TODO Auto-generated method stub
		return mapper.getHospital(map);
	}

	@Override
	public void updateHospitalInfor(HospitalInfor hos) {
		// TODO Auto-generated method stub
		mapper.updateHospitalInfor(hos);
	}

}
