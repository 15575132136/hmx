package com.hmx.jxc.controller;

import com.hmx.jxc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 14051
 * @date 2023/5/27
 **/
@RestController
public class UserController {
    /**
     * @Autowired 功能： 赋值
     */

    @Autowired
    private UserService userService ;

    @RequestMapping("test01")
    public String test(String userId, String userName){

        if(userId == null){
            return "请输入用户id";
        }

        if(userName == null){
            System.out.println("用户名等于null");
        }

        return userService.queryUserById(userId).toString();
    }

}
