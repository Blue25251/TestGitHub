package com.jiuqi.mybatis.dao.impl;

import com.jiuqi.mybatis.dao.UserDao;
import com.jiuqi.mybatis.entity.User;
import com.jiuqi.mybatis.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author JiuQi 玖柒
 * @date 2021/5/17 19:57
 */
public class UserDaoMyBatisImpl implements UserDao {
    @Override
    public int save(User user) {
        SqlSession sqlSession = null;
        int ret = 0;
        try {
            sqlSession = MyBatisUtil.getSqlSession();
            ret = sqlSession.insert("com.jiuqi.mybatis.dao.UserMapper.save", user);
            sqlSession.commit();
        } catch (Exception e) {
            if (sqlSession != null) {
                sqlSession.rollback();
            }
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return ret;
    }

    @Override
    public int update(User user) {
        SqlSession sqlSession = null;
        int ret = 0;
        try {
            sqlSession = MyBatisUtil.getSqlSession();
            ret = sqlSession.update("com.jiuqi.mybatis.dao.UserMapper.update", user);
            sqlSession.commit();
        } catch (Exception e) {
            if (sqlSession != null) {
                sqlSession.rollback();
            }
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return ret;
    }

    @Override
    public int delete(int id) {
        SqlSession sqlSession = null;
        int ret = 0;
        try {
            sqlSession = MyBatisUtil.getSqlSession();
            ret = sqlSession.delete("com.jiuqi.mybatis.dao.UserMapper.delete", id);
            sqlSession.commit();
        } catch (Exception e) {
            if (sqlSession != null) {
                sqlSession.rollback();
            }
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return ret;
    }


    @Override
    public List<User> findAll() {
        SqlSession sqlSession = null;
        List<User> users = null;
        try {
            sqlSession = MyBatisUtil.getSqlSession();
            users = sqlSession.selectList("com.jiuqi.mybatis.dao.UserMapper.findAll");
            sqlSession.commit();
        } catch (Exception e) {
            if (sqlSession != null) {
                sqlSession.rollback();
            }
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return users;
    }
}
