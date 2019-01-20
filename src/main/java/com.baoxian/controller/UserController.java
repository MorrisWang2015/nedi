package com.baoxian.controller;

import com.baoxian.pojo.User;
import com.baoxian.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Date:2019/1/20
 * Author:Morris
 */
@Controller
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    @ResponseBody
    public User getUser(Integer id) {
        User user = userService.selectUser(id);
        logger.info("用户信息{}", user);
        return user;
    }

}
