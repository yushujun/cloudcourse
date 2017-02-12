package com.cc.ysj.service;

import com.cc.ysj.DAO.UserDAO;
import com.cc.ysj.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ysj on 2017/2/12.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDao;

    public void saveUsers(List<User> us) {
        for(User u : us)
            userDao.save(u);
    }

    public List<User> getAllUsernames() {
        return userDao.findAll();
    }
}
