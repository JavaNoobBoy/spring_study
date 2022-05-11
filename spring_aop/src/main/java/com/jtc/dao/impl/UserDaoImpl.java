package com.jtc.dao.impl;

import com.jtc.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("save...");
    }

    @Override
    public void update() {
        System.out.println("update...");
    }
}
