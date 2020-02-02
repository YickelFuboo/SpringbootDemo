package com.example.postgresqlexample.entity;

import java.lang.String;

public class DemoUser {
    private String name;
    private String password;
    private String address;
    private Integer sexxy;

    public void User(String name, String password, String address, Integer sexxy) {
        this.name = name;
        this.password = password;
        this.address = address;
        this.sexxy = sexxy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSexxy() {
        return sexxy;
    }

    public void setSexxy(Integer sexxy) {
        this.sexxy = sexxy;
    }

    @Override
    public String toString(){
        String strSexxy;

        if(this.sexxy == 1) {
            strSexxy = "male";
        }
        else{
            strSexxy = "female";
        }

        return "User(name:" + this.name + " password:" + this.password + " address:" + this.address + " sexxy:" + strSexxy;
    }
}
