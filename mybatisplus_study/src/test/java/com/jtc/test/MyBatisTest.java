package com.jtc.test;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jtc.mapper.ActorMapper;
import com.jtc.mapper.UserMapper;
import com.jtc.pojo.Actor;
import com.jtc.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
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


    @Test
    public void testLambdaQuery() {
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.ge(User::getId, 0).le(User::getId, 3);
        List<User> users = userMapper.selectList(lambdaQueryWrapper);
        System.out.println("users = " + users);
    }

    @Test
    public void testLambdaQuery2() {
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper
                .ge(User::getId, 0)
                .le(User::getId, 3)
                .in(User::getDeleted, 0, 1);


        List<User> users = userMapper.selectList(lambdaQueryWrapper);
        System.out.println("users = " + users);
    }

    @Test
    public void testLambdaQuery3() {
//        User user = new User();
//        user.setUsername("张三");
//        user.setPassword("123456");
//        userMapper.insert(user);


        userMapper.deleteById(1);

    }
}
