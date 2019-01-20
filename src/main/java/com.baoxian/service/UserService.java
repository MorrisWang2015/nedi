package com.baoxian.service;

import com.baoxian.pojo.User;

import javax.annotation.Resource;

/**
 * Date:2019/1/20
 * Author:Morris
 */
public interface UserService {

    User selectUser(Integer userId);
}
