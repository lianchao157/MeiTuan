package com.meituan.demo.server.impl;

import com.meituan.demo.bean.User;
import com.meituan.demo.mapper.UserLoginMapper;
import com.meituan.demo.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserLoginMapper userLoginMapper;

    @Override
    public User findByUsername(User user) {
        if (null == user || user.equals("")) {
            return null;
        }
        System.out.println("!!!!!!!"+user.getUsername());
        User u = userLoginMapper.findByUsernametest(user.getUsername());
        return u;
    }
}
