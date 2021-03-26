package com.example.demo.demo.impl;

import com.example.demo.demo.UserService;
import org.springframework.stereotype.Service;

@Service("userService2")
public class UserService2Impl implements UserService {

    @Override
    public void getUser() {
        System.out.println("UserService2Impl");
    }
}
