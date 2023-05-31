package com.hmx.jxc.service.impl;


import com.hmx.jxc.entity.User;
import com.hmx.jxc.mapper.UserMapper;
import com.hmx.jxc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 14051
 * @date 2023/5/27
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    /**
     * 他的返回值可以根据自己需要，定义成任何类型
     * @param userId
     * @return
     */
    @Override
    public Object queryUserById(String userId) {
        /**
         *
         * UserDao 执行查询数据库的操作
         * 然后将数据封装到user对象中
         */
        User user = userMapper.querybyId(userId);
        /**
         * zhangsan
         * 18
         * 男
         * 1
         */

        if(user.getId().equals("2")){
            System.out.println("张三的id：" + userId);
        }

        if(user.getSex().equals("男")){
            System.out.println("张三是男人");
        }else{
            System.out.println("张三是女人");
        }

        return user.getUserName();
    }
}
