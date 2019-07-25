package com.study.mybatis.service.impl;


import com.study.mybatis.dao.UserDao;
import com.study.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

}
