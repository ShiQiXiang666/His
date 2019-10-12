package com.zhiyou.mapper;

import java.util.List;
import java.util.Map;

import com.zhiyou.model.RegistrationInfor;

public interface RegistrationInforMapper {
    int insert(RegistrationInfor record);

    int insertSelective(RegistrationInfor record);
    
    List<RegistrationInfor> getAllRegistrationInfor(Map<Object, String> map);

	int getcount(Map<Object, String> map);

	void addregistrationInfor(RegistrationInfor reg);

	RegistrationInfor getReg(Map<String, String> map);

	void updateReg(RegistrationInfor reg);

	RegistrationInfor getRegById(Map<String, String> map);

	void deleteReg(List<String> list);
	
	
}