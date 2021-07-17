package com.baizhi.util;

import com.baizhi.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {
    private static InputStream is=null;
    private static SqlSessionFactory build=null;
    static SqlSession sqlSession=null;
    private UserMapper userMapper;
    static{
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        build =new SqlSessionFactoryBuilder().build(is);
        sqlSession = build.openSession();
    }
    public static SqlSession getSqlSession(){
        return sqlSession;
    }
    public static void release(){
        sqlSession.close();
    }
    public static void commit(){
        sqlSession.commit();
    }
}
