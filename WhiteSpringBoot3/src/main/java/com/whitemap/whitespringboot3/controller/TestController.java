package com.whitemap.whitespringboot3.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin //忽略跨域
@RequestMapping("/test") //公共路径
@RestController
public class TestController{
    @GetMapping("/get")
    public String handleReviewRequest(){
        return "测试用例";
    }
}
