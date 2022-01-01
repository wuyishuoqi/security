package com.dielian.demo.service;

import com.dielian.demo.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegService {
    @Autowired
    UserMapper userMapper;

    public int reg(String username,String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
        String encodePassword=encoder.encode(password);
        return userMapper.saveToDb(username,encodePassword);
    }
}
