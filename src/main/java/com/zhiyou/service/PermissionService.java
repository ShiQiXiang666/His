package com.zhiyou.service;

import java.util.List;
import java.util.Map;

import com.zhiyou.model.Permission;

public interface PermissionService {

	List<Permission> getAllPermission(Map<String, String> map);

}
