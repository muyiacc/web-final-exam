package com.caochangyong.webfinalexam.controller;


import com.caochangyong.webfinalexam.bean.User;
import com.caochangyong.webfinalexam.dao.UserDao;
import com.caochangyong.webfinalexam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author muyiacc
 * @Date 2023/6/20 020 13:14
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/user/")
    public User getUser(){
        int i = 1;
        User user = userService.selectById(i);
        return user;
    }

    @GetMapping("/user/select/{id}")
    public User getUser1(@PathVariable Integer id){
        User user = userService.selectById(id);
        return user;
    }

    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable Integer id){
        User user1 = userService.selectById(id);
        User user = userService.deleteUser(user1);
        return "删除成功" +  user;
    }



}
