package com.jtc.mapper;

import com.jtc.pojo.User;

import java.util.List;

public interface UserDao {

    List<User> findAllUser();
}
