package com.jtc.service.impl;

import com.jtc.dao.HelloSpringDao;
import com.jtc.service.HelloSpringService;

public class HelloSpringServiceImpl implements HelloSpringService {


    @Override
    public void helloSpring() {
        System.out.println("helloSpring... i'm in serviceImpl");
    }


}
