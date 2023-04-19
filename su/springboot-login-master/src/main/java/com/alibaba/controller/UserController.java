package com.alibaba.controller;


import com.alibaba.bean.User;
import com.alibaba.service.UserService;
import com.alibaba.utiles.LayuiRespone;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xxx
 * @since 2023-04-18
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Object login(@RequestBody User user){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username",user.getUsername()).eq("password",user.getPassword());
        User one = userService.getOne(wrapper);
        if (one != null){
            return new LayuiRespone(1, "登录失败");
        }
        return new LayuiRespone(0, "登录失败");
    }


    @ResponseBody
    @RequestMapping(value = "/queryAll",method = RequestMethod.GET)
    public Object queryAll(@RequestParam("page") int page,
                           @RequestParam("limit") int limit){
        Page<User> pageSize = new Page<>(page,limit);
        IPage<User> userPage = userService.page(pageSize,null);
        System.out.println(userPage.getRecords());
        return new LayuiRespone(0,"请求成功",userPage.getRecords(), userPage.getTotal());
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    @ResponseBody
    public Object delete(@RequestParam("userid") String userid){
        if (userService.removeById(userid)){
            return new LayuiRespone(0,"删除成功");
        }else {
            return new LayuiRespone(999,"删除失败");
        }
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Object add(@RequestBody User user, HttpSession session){
        userService.save(user);
        return  new LayuiRespone(0,"添加成功");
    }



}
