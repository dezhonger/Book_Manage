package com.dezhonger.services;

import com.dezhonger.mapper.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by dezhonger on 2016/8/2.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;
    public String chaxun(String username) {
        return userDao.chaxun(username);
    }
}
