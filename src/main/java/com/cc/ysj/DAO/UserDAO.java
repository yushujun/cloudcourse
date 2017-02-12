package com.cc.ysj.DAO;

import com.cc.ysj.entity.User;

import java.util.List;

/**
 * Created by ysj on 2017/2/12.
 */
public interface UserDAO {
    public int save(User u);
    public List<User> findAll();
}
