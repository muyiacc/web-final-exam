package com.caochangyong.webfinalexam.service;

import com.caochangyong.webfinalexam.bean.User;
import com.caochangyong.webfinalexam.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author muyiacc
 * @Date 2023/6/20 020 13:11
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User selectById(int id){
        User user = userDao.selectById(id);
        return user;
    }

    public User deleteUser(User user){
        userDao.deleteById(user);
        return user;
    }

    public void updateUser(User user){
        userDao.updateById(user);
    }

    public void insertUser(User user){
        userDao.insert(user);
    }

}
