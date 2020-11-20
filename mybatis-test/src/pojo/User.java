package pojo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private static final long serialVersionUID = -3285671668731446152L;
    private Integer id;
    private String username;
    private String password;
    private String realname;
    private Integer age;
    private Date birthday;
    private Date regTime;

    public User() {
    }

    public User(String username, String password, String realname, Integer age,Date regTime) {
        this.username = username;
        this.password = password;
        this.realname = realname;
        this.age = age;
        this.regTime = regTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", realname='" + realname + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", reg_time=" + regTime +
                '}';
    }

    public User(Date regTime) {
        this.regTime = regTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getReg_time() {
        return regTime;
    }

    public void setReg_time(Date reg_time) {
        this.regTime = reg_time;
    }
}
