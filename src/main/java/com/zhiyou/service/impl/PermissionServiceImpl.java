package com.zhiyou.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.mapper.PermissionMapper;
import com.zhiyou.model.Permission;
import com.zhiyou.service.PermissionService;
@Service
public class PermissionServiceImpl implements PermissionService {

	@Autowired
	private PermissionMapper mapper;
	
	@Override
	public List<Permission> getAllPermission(Map<String, String> map) {
		// TODO Auto-generated method stub
		return mapper.getAllPermission(map);
	}

}
