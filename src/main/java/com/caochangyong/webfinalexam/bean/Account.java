package com.caochangyong.webfinalexam.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author muyiacc
 * @Date 2023/5/16 016 15:01
 * @Description: TODO
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    private Integer id;
    private String userName;
    private Integer balance;

}
