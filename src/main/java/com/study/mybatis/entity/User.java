package com.study.mybatis.entity;

public class User {

    private  Integer  userId;
    private  String  userName;
    private  String  userSex;
    private  String   userEmail;
    public  Department  depart;

    public User() {
    }

    public User(Integer userId, String userName, String userSex, String userEmail) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.userEmail = userEmail;

    }

    public User(Integer userId, String userName, String userSex, String userEmail, Department depart) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.userEmail = userEmail;
        this.depart = depart;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", depart=" + depart +
                '}';
    }
}
