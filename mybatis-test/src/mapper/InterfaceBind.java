package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.User;

import java.util.List;

public interface InterfaceBind {
    public List<User> selAll();
    public User selByNamePassword(@Param("name") String username,@Param("pwd") String password);
    public User selByNamePwd(String username,String password);
}
