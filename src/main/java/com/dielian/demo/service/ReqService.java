package com.dielian.demo.service;

import lombok.var;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;

@Service
public class ReqService {
    public void req(String username,String password){
        BCryptPasswordEncoder encoder =new BCryptPasswordEncoder(10);
        String encodePassword = encoder.encode(password);
        HashMap<String,Object> map = new HashMap<>();
        map.put(username,encodePassword);
    }
}
