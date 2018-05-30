package com.qhq.demo.controller;

import com.qhq.demo.configBean.ConfigTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Value("${com.qhq.name}")
    private String name;
    @Value("${com.qhq.school}")
    private String school;
    @Autowired
    private ConfigTest configTest;


    @RequestMapping("/test1")  //返回的是一个JSON对象
    public String test1(){
        return name + " : " + school;
    }


    @RequestMapping("/test2")
    public String test2() {
        return configTest.getName() + " : " + configTest.getSchool();
    }
}
