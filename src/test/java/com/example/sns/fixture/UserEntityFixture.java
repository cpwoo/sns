package com.example.sns.fixture;

import com.example.sns.model.entity.UserEntity;

public class UserEntityFixture {

    public static UserEntity get(String userName, String password, Integer userId) {
        UserEntity result = new UserEntity();
        result.setUserName(userName);
        result.setPassword(password);
        result.setId(userId);

        return result;
    }

}
