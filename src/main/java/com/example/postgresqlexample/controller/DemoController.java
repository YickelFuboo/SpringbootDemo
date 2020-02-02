package com.example.postgresqlexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.postgresqlexample.services.DemoService;

@RestController
@RequestMapping("/user")
public class DemoController {
    @Autowired
    DemoService  demoService;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello User!";
    }

    @RequestMapping("/getUser/{name}/{password}")
    public String getUserByNameAndPW(@PathVariable String name, @PathVariable String password) {
        return demoService.findByNameAndPsword(name, password).toString();
    }

    @RequestMapping("/findUser/{name}")
    public String findUserByName(@PathVariable String name) {
        return demoService.findByName(name).toString();
    }
}
