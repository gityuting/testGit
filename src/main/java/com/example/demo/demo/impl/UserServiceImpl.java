package com.example.demo.demo.impl;

import com.example.demo.demo.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public  Integer getUser() {
        System.out.println("UserServiceImpl");
        return 1;
    }

    @Override
    public Number test(Integer i) {

        return 1;
    }
}
