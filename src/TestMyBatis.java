import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pojo.User;

import java.io.InputStream;
import java.util.List;

public class TestMyBatis {
    @Test
    public void testMyBatis() throws Exception{
        //Resoures以流形式读取mybatis配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //通过SqlSessionFactoryBuilder获得sqlFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        //核心sqlSession用于数据操作
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //操作
        List<User> list = sqlSession.selectList("selAll");

        for (User user:
             list) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
