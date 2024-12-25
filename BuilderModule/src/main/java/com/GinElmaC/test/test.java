package com.GinElmaC.test;

import com.GinElmaC.testBuilder.User;

public class test {
    public static void main(String[] args) {
        User.UserBuilder userBuilder = new User.UserBuilder();
        userBuilder.name("张三");
        userBuilder.age(12);
        userBuilder.email("@zhangsan.com");
        User user = userBuilder.build();
        System.out.println(user);
    }
}
