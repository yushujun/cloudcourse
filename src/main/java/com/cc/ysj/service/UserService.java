package com.cc.ysj.service;

import com.cc.ysj.entity.User;

import java.util.List;

/**
 * Created by ysj on 2017/2/12.
 */
public interface UserService {
    public void saveUsers(List<User> us);
    public List<User> getAllUsernames();
}
