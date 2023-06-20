package com.caochangyong.webfinalexam.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.caochangyong.webfinalexam.bean.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author muyiacc
 * @Date 2023/6/20 020 13:08
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}
