package com.jtc.dao.impl;

import com.jtc.dao.HelloSpringDao;

public class HelloSpringDaoImpl implements HelloSpringDao {
    @Override
    public void helloSpring() {
        System.out.println("helloSpring... i'm in daoImpl");
    }
}
