package com.softusing.xuzhining.service;

import com.softusing.xuzhining.domain.User;
import com.softusing.xuzhining.domain.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceio{
    @Autowired
    private UserMapper userMapper;

    public int save(User user){
        return userMapper.insert(user);
    }
}
