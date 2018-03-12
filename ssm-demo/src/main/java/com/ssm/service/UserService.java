package com.ssm.service;

import com.ssm.dao.UserMapper;
import com.ssm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lijun on 2018/3/6.
 */
@Service
public class UserService implements IUserService {

    @Autowired
    UserMapper userMapper;

    public UserService(){
        System.out.println("**********************");
    }

    public User getUserById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
}

