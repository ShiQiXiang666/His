package com.zhiyou.service;

import java.util.List;
import java.util.Map;

import com.zhiyou.model.RegistrationInfor;

public interface RegistrationInforService {

	List<RegistrationInfor> getAllRegistrationInfor(Map<Object, String> map);

	int count(Map<Object, String> map);

	void addregistrationInfor(RegistrationInfor reg);

	RegistrationInfor getReg(Map<String, String> map);

	void updateReg(RegistrationInfor reg);

	RegistrationInfor getRegById(Map<String, String> map);

	void deleteReg(List<String> list);
}
