package com.example.sns.fixture;

import com.example.sns.model.entity.PostEntity;
import com.example.sns.model.entity.UserEntity;

public class PostEntityFixture {

    public static PostEntity get(String userName, Integer postId, Integer userId) {
        UserEntity user = new UserEntity();
        user.setUserName(userName);
        user.setId(userId);

        PostEntity result = new PostEntity();
        result.setUser(user);
        result.setId(postId);

        return result;
    }

}
