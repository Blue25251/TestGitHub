package com.jiuqi.mybatis.dao;

import com.jiuqi.mybatis.entity.User;

import java.util.List;

/**
 * @author JiuQi 玖柒
 * @date 2021/5/17 19:57
 */
public interface UserDao {
    int save(User user);
    int update(User user);
    int delete(int id);
    List<User> findAll();
}
