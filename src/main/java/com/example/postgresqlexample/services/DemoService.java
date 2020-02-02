package com.example.postgresqlexample.services;

import com.example.postgresqlexample.dao.UserMapper;
import com.example.postgresqlexample.entity.DemoUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class DemoService {
    @Resource
    private UserMapper userMapper;

    public DemoUser findByName(String name) {
        DemoUser u = userMapper.findByName(name);
        return u;
    }

    public DemoUser findByNameAndPsword(String name, String password){
        DemoUser u = userMapper.getByNameAndPsword(name, password);
        return u;
    }
}
