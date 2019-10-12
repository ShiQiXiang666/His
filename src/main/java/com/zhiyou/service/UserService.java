package com.zhiyou.service;

import java.util.Map;

import com.zhiyou.model.User;

public interface UserService {

	User loginUser(Map<String, String> map);

}
