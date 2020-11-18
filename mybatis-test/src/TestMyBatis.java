import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pojo.User;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestMyBatis {
    public SqlSession getSqlSession() throws Exception{
        //Resoures以流形式读取mybatis配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //通过SqlSessionFactoryBuilder获得sqlFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        //核心sqlSession用于数据操作
        return sqlSessionFactory.openSession();
    }
    @Test
    public void testCount() throws Exception{
        SqlSession sqlSession =getSqlSession();
        int count = sqlSession.selectOne("count");
        System.out.println(count);
        sqlSession.close();
    }
    @Test
    public void testSelectMap() throws Exception{
        SqlSession sqlSession =getSqlSession();
        Map<Integer, User> map = sqlSession.selectMap("selAll", "id");
        System.out.println(map);
        Set<Map.Entry<Integer, User>> entries = map.entrySet();
        for ( Map.Entry<Integer, User> user :entries){
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void testSelectOne() throws Exception{
        SqlSession sqlSession =getSqlSession();
        User user = sqlSession.selectOne("selOne");
        System.out.println(user);
        sqlSession.close();
    }


    @Test
    public void testMyBatis() throws Exception{
        SqlSession sqlSession =getSqlSession();
        //操作
        List<User> list = sqlSession.selectList("selAll");

        for (User user:
             list) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
