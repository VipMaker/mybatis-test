package TestCUD;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;
import util.MyBatisUtil;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TestCUD {
    @Test
    public void testAdd(){
        User user=new User("wangwu","123","王五",18,new Date());
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        try {
            sqlSession.insert("insertUser",user);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        }
        sqlSession.close();
    }
    @Test
    public void testUpdate(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        Map<String,Object> map=new HashMap<>();
        map.put("password","123456");
        map.put("id",3);
        try {
            sqlSession.update("updateUser",map);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        }
        sqlSession.close();
    }
    @Test
    public void testDelete(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        try {
            sqlSession.update("deleteUser",3);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        }
        sqlSession.close();
    }
}
