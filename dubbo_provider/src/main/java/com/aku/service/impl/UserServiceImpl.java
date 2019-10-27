package com.aku.service.impl;

import com.aku.dao.UserDao;
import com.aku.domain.User;
import com.aku.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User findByUser(Integer id) {
        return userDao.findUserById(id);
    }
}
