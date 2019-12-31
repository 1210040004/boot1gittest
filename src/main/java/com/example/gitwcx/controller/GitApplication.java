package com.example.gitwcx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitApplication {
    @RequestMapping("info")
    public String info(){
        return "hello git  项目经理提交  后  来发人员提交" ;
    }
    // 开发人员写了一句话
    @RequestMapping("info2")
    public String info2(){
        return "hello git2";
    }

    //代码修改
    @RequestMapping("PUSH")
    public String info3(){
        return "hello git3";
    }

}
