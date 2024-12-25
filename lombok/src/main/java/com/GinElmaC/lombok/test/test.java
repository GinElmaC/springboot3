package com.GinElmaC.lombok.test;

import com.GinElmaC.lombok.Bean.User;

public class test {
    public static void main(String[] args) {
        User user = new User("张三",14,"123");
        System.out.println(user);
    }
}
