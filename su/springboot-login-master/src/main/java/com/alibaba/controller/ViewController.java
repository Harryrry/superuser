package com.alibaba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ViewController {


    /*公共页面*/
    /*欢迎界面*/
    /*@RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }*/

    //首页
    @RequestMapping("/welcome")
    public String index(){
        return "welcome";
    }

    @RequestMapping("/a1")
    public String a1(){
        return "userApply";
    }

}
