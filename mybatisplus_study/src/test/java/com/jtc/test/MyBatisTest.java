package com.jtc.test;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jtc.mapper.ActorMapper;
import com.jtc.mapper.UserMapper;
import com.jtc.pojo.Actor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyBatisTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ActorMapper actorMapper;


    @Test
    public void test() {
        IPage<Actor> page = new Page<>(1, 1);
        actorMapper.selectPage(page, null);
        System.out.println("page.getRecords() = " + page.getRecords());
    }
}
