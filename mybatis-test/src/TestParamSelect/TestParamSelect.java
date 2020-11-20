package TestParamSelect;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;
import util.MyBatisUtil;

import java.util.HashMap;
import java.util.Map;

public class TestParamSelect {
    @Test
    public void testBaseType(){
        SqlSession sqlSession= MyBatisUtil.getSqlSession();
        User user=sqlSession.selectOne("selBaseType",1);
        sqlSession.close();
        System.out.println(user);
    }
    @Test
    public void testMap(){
        SqlSession sqlSession= MyBatisUtil.getSqlSession();
        Map<String,String> map=new HashMap<>();
        map.put("username","zhangsan");
        map.put("password","123456");
        User user=sqlSession.selectOne("selByMap",map);
        sqlSession.close();
        System.out.println(user);
    }
    @Test
    public void testObject(){
        SqlSession sqlSession= MyBatisUtil.getSqlSession();
        User user1=new User();
        user1.setUsername("lisi");
        user1.setPassword("123456");
        User user=sqlSession.selectOne("selByObject",user1);
        sqlSession.close();
        System.out.println(user);
    }

}
