package com.dielian.demo.controller;

import com.dielian.demo.service.MethodService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MethodController {
    @Resource
    private MethodService methodService;

    @GetMapping("/test/admin")
    public String admin(){
        return "methodService.admin()";
    }

    @GetMapping("/test/user")
    public String user(){
        return "methodService.user()";
    }
}
