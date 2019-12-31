package com.example.gitwcx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitApplication {
    @RequestMapping("info")
    public String info(){
        return "hello git" ;
    }
    // 开发人员写了一句话
}
