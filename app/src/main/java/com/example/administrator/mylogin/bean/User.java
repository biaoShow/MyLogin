package com.example.administrator.mylogin.bean;

/**
 * {
 *     "code":0,
 *     "error-msg":"",
 *     "result":{
 *         "username":
 *         "sex":
 *         "address":
 *         "age":
 *         "company":
 *     }
 *
 * }
 * Created by Administrator on 2017/3/28 0028.
 */

public class User extends beanUser {

    private String username;
    private String avatarUrl;
    private String sex;
    private String address;
    private String age;
    private String company;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String getAvatarUrl() {
        return avatarUrl;
    }

    @Override
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
