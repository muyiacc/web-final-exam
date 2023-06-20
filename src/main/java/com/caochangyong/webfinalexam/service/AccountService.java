package com.caochangyong.webfinalexam.service;

import com.caochangyong.webfinalexam.bean.Account;
import com.caochangyong.webfinalexam.bean.User;
import com.caochangyong.webfinalexam.dao.AccountDao;
import com.caochangyong.webfinalexam.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author muyiacc
 * @Date 2023/6/20 020 13:11
 */
@Service
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    Account selectById(int id){
        Account account = accountDao.selectById(id);
        return account;
    }

    void deleteUser(Account account){
        accountDao.deleteById(account.getId());
    }

    void updateUser(Account account){
        accountDao.updateById(account);
    }

    void insertUser(Account account){
        accountDao.insert(account);
    }

}
