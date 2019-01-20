package com.baoxian.service.impl;

import com.baoxian.dao.UserMapper;
import com.baoxian.pojo.User;
import com.baoxian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Date:2019/1/20
 * Author:Morris
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUser(Integer userId) {
        return userMapper.selectUser(userId);
    }

}
