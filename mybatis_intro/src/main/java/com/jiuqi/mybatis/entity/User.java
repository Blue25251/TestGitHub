package com.jiuqi.mybatis.entity;

import java.util.Date;

/**
 * @author JiuQi 玖柒
 * @date 2021/5/17 19:56
 */
public class User {
    private Integer id;
    private String name;
    private String pwd;
    private Date birthday;
    private int age;

    public User() {
    }

    public User(Integer id, String name, String pwd, Date birthday, int age) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.birthday = birthday;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", birthday=" + birthday +
                ", age=" + age +
                '}';
    }
}
