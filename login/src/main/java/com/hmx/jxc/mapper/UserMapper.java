package com.hmx.jxc.mapper;

import com.hmx.jxc.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author 14051
 * @date 2023/5/27
 * 用来执行数据库操作，将数据库数据封装到User对象中
 **/
@Component
public class UserMapper {


    public User querybyId(String userId) {

        /**
         * 执行数据库操作
         * 执行jdbc操作
         */


        /**
         * 向对象中添加属性
         */
        User user = new User();
        user.setUserName("zhangsan");
        return user;
    }
}
