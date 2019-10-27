package com.aku.controller;

import com.aku.domain.User;
import com.aku.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/User")
@ResponseBody
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/findByUser")
    public User findByUser(Integer id) {
        return userService.findByUser(id);
    }
}
