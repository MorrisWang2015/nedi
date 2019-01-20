package com.baoxian.controller;

import com.baoxian.pojo.User;
import com.baoxian.service.UserService;
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

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    @ResponseBody
    public User getUser(Integer id) {
        User user = userService.selectUser(id);
        System.out.println(user);
        return user;
    }

}
