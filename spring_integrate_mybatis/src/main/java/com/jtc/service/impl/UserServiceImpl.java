package com.jtc.service.impl;

import com.jtc.mapper.UserDao;
import com.jtc.pojo.User;
import com.jtc.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(final UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }
}
