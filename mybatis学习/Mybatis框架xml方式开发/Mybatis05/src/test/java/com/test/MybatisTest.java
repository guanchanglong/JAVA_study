package com.test;

import com.dao.UserDao;
import com.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    private static UserDao userDao;
    private static SqlSession sqlSession;
    private static InputStream inputStream;
    @Before
    public void test()throws Exception{
        inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);
        sqlSession = factory.openSession();
        userDao = sqlSession.getMapper(UserDao.class);
    }
    @Test
    public void testFind(){
        List<User>users = userDao.findAll();
        for (User user:users){
            System.out.println(user);
        }
    }
    @After
    public void destroy()throws Exception{
        sqlSession.close();
        inputStream.close();
    }
}
