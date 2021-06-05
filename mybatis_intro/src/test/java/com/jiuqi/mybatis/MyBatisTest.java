package com.jiuqi.mybatis;

import com.jiuqi.mybatis.dao.UserDao;
import com.jiuqi.mybatis.dao.impl.UserDaoMyBatisImpl;
import com.jiuqi.mybatis.entity.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * @author kxh
 * @date 2021/5/17 20:30
 */
public class MyBatisTest {
    private UserDao userDao = new UserDaoMyBatisImpl();

    @Test
    public void testSave() {
        User user = new User();
        user.setPwd("20210605");
        user.setName("YanZuoYe");
        user.setAge(18);
        int ret = userDao.save(user);
        System.out.println(ret);
        Assert.assertEquals(1, ret);
    }

    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(14);
        user.setPwd("20210605002");
        user.setName("YanZuoYe002");
        user.setAge(18);
        user.setBirthday(new Date("1999/12/02"));
        int ret = userDao.update(user);
        System.out.println(ret);
        Assert.assertEquals(1, ret);
    }
    @Test
    public void testDelete() {
        int ret = userDao.delete(14);
        System.out.println(ret);
        Assert.assertEquals(1,ret);
    }

    @Test
    public void testFindAll() {
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
