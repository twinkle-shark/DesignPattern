package com.baizhi.mapper;

import com.baizhi.entity.Role;

import java.util.List;

public interface RoleMapper {
    //查询所有的角色对应的用户信息
    List<Role> findAllRoleAndUser();

}
