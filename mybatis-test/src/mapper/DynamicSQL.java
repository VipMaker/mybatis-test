package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.User;

public interface DynamicSQL {
    public User selByCondition(@Param("name") String username,@Param("pwd") String password);
    public User selByChoose(User user);
    public User selByBind(@Param("realname")String realname);
    public int updateById(@Param("username") String username,@Param("age") Integer age,@Param("id") int id);
}
