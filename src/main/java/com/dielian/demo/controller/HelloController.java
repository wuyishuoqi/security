package com.dielian.demo.controller;

import com.dielian.demo.service.RegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    RegService regService;
    @GetMapping("/admin/hello")
    public String admin(){
        return "hello admin!";
    }
    @GetMapping("/user/hello")
    public String user(){
        return "hello user!";
    }
    @GetMapping("/db/hello")
    public String dba(){
        return "hello dba!";
    }
    @GetMapping("/hello")
    public String hello(){
        return "hello!";
    }
    @GetMapping("/add/user")
    public String addUser(String username,String password){
        regService.reg(username,password);
        return "add user success";
    }
}
