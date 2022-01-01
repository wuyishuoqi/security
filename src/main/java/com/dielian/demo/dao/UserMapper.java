package com.dielian.demo.dao;

import com.dielian.demo.entity.Role;
import com.dielian.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface UserMapper {
    User loadUserByUsername(String username);
    int saveToDb(@Param(value = "username") String username, @Param(value = "password") String password);
    List<Role> getUserRolesByUid(Integer id);
}
