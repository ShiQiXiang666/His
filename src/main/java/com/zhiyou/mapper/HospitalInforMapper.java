package com.zhiyou.mapper;

import java.util.List;
import java.util.Map;

import com.zhiyou.model.HospitalInfor;

public interface HospitalInforMapper {
    int insert(HospitalInfor record);

    int insertSelective(HospitalInfor record);
    
    List<HospitalInfor> getAllHospitalInfor(Map<String, String> map);

	HospitalInfor getHospital(Map<String, String> map);

	void updateHospitalInfor(HospitalInfor hos);
}