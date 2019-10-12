package com.zhiyou.mapper;

import java.util.List;
import java.util.Map;

import com.zhiyou.model.Permission;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

	List<Permission> getAllPermission(Map<String, String> map);
}