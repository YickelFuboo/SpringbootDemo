package com.example.postgresqlexample.dao;

import com.example.postgresqlexample.entity.DemoUser;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.lang.String;

@Mapper
public interface UserMapper {
    //@Select({"select * from UserTable where name=#{name}"})
    DemoUser findByName(String name);

    @Select({"select * from UserTable where name=#{name} and password=#{password}"})
    DemoUser getByNameAndPsword(String name, String password);//根据用户名和邮箱进行查询
}
