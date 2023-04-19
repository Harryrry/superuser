/*
package com.alibaba.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class DemoController {

    @Autowired
    private UserService userService;

    */
/**
     * 注册
     * @param user 参数封装
     * @return Result
     *//*

    @PostMapping(value = "/regist")
    public Object regist(User user){
        return null;
    }

    */
/**
     * 登录
     * @param user 参数封装
     * @return Result
     *//*


    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Object login(@RequestBody User user){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username",user.getUsername()).eq("password",user.getPassword());
        User one = userService.getOne(wrapper);
        if (one != null){
            return "ok";
        }
        return "error";
    }
}

*/
