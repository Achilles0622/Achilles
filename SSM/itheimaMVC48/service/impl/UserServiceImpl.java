package com.itheimaMVC48.service.impl;

import com.itheimaMVC48.domain.User;
import com.itheimaMVC48.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    public void save(User user){
        System.out.println("user service");
    }
}
