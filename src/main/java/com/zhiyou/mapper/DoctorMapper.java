package com.zhiyou.mapper;

import java.util.List;
import java.util.Map;

import com.zhiyou.model.Doctor;

public interface DoctorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    Doctor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);

	List<Doctor> getAllDoctor(Map<Object, String> map);

	int getCount(Map<Object, String> map);

	Doctor getDoctorById(Map<String, String> map);
}