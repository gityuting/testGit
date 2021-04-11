package com.example.demo.demo.impl;

import com.example.demo.demo.UserService;
import org.apache.ibatis.io.ResolverUtil;
import org.springframework.stereotype.Service;

@Service("userService2")
public class UserService2Impl extends UserServiceImpl  {


    @Override
    public Integer test(Integer i) {

        return 1;
    }

    public Integer test(Number i) {

        return 1;
    }

}
