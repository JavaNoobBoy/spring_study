package com.jtc.test;

import com.jtc.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {


    @Test
    public void testMybatisHelloWorld() throws IOException {
        // 加载mybatis配置文件
        InputStream resource = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // 获取SqlSession工厂对象
        SqlSessionFactory sqlSessionFactory = builder.build(resource);
        // 获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 执行sql
        List<User> userList = sqlSession.selectList("userMapper.findAll");
        // 打印数据
        System.out.println("userList = " + userList);
        // 释放资源
        sqlSession.close();


    }
}
