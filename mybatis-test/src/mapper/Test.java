package mapper;

import org.apache.ibatis.session.SqlSession;
import pojo.User;
import util.MyBatisUtil;

import java.util.List;

public class Test {
    @org.junit.Test
    public void testSelAll(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        InterfaceBind mapper= sqlSession.getMapper(InterfaceBind.class);
        List<User> users = mapper.selAll();
        System.out.println(users);
        sqlSession.close();
    }
    @org.junit.Test
    public void testSelByNamePassword(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        InterfaceBind mapper= sqlSession.getMapper(InterfaceBind.class);
        User user = mapper.selByNamePassword("zhangsan","123456");
        System.out.println(user);
        sqlSession.close();
    }
    @org.junit.Test
    public void testSelByNamePwd(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        InterfaceBind mapper= sqlSession.getMapper(InterfaceBind.class);
        User user = mapper.selByNamePwd("zhangsan","123456");
        System.out.println(user);
        sqlSession.close();
    }
    @org.junit.Test
//    public void testDynamicSQL(){
//        SqlSession sqlSession = MyBatisUtil.getSqlSession();
//        DynamicSQL mapper= sqlSession.getMapper(DynamicSQL.class);
//        User user = mapper.selByCondition("zhangsan","123456");
//        System.out.println(user);
//        sqlSession.close();
//    }
    public void testDynamicSQL(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        DynamicSQL mapper= sqlSession.getMapper(DynamicSQL.class);
        User user=new User();
        user.setUsername("zhangsan");
        User user1 = mapper.selByChoose(user);
        System.out.println(user1);
        sqlSession.close();
    }
    @org.junit.Test
    public void testDynamicSQLChoose(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        DynamicSQL mapper= sqlSession.getMapper(DynamicSQL.class);
        User user = mapper.selByBind("张");
        System.out.println(user);
        sqlSession.close();
    }
    @org.junit.Test
    public void testUpdateById(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        DynamicSQL mapper= sqlSession.getMapper(DynamicSQL.class);
        int user = mapper.updateById(null,20,1);
        System.out.println(user);
        sqlSession.close();
    }

}
