package com.meituan.demo.bean;

/***
 * lianchaolc
 * lianchaolc
 * lianchaolc
 * lianchaolc
 * 15642926631@163.com
 */



public class User {
    public User(String username, String usertel) {
        this.username = username;
        this.usertel = usertel;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsertel() {
        return usertel;
    }

    public void setUsertel(String usertel) {
        this.usertel = usertel;
    }

    private String username;
    private String usertel;
}
