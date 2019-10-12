package com.zhiyou.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.mapper.UserMapper;
import com.zhiyou.model.User;
import com.zhiyou.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserMapper mapper;
	
	@Override
	public User loginUser(Map<String, String> map) {
		// TODO Auto-generated method stub
		return mapper.login(map);
	}

}
