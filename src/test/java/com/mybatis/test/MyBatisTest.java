package com.mybatis.test;

import com.mybatis.mapper.userMapper;
import com.mybatis.pojo.Usen;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisTest {
    @Test
    public void testMybatis() throws IOException {
        //加载核心配置文件
        InputStream is = Resources.getResourceAsStream("myvatis-config.xml");
        //获取sqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取SqlSessionFactory
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(is);
        //获取Sqlssion
        SqlSession sqlSession = build.openSession();
        //获取maper接口
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        //测试功能
        int i = mapper.serUsesrr(new Usen(null,"找死","121",12,"难","3131524@"));
        //提交事务
        sqlSession.commit();
        System.out.println(i);


    }
}
