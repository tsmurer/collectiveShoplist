package com.tsmurer.shopjoin.factories;

import com.tsmurer.shopjoin.builders.Builder;
import com.tsmurer.shopjoin.builders.UserBuilder;
import com.tsmurer.shopjoin.builders.UserTOBuilder;
import com.tsmurer.shopjoin.domain.User;
import com.tsmurer.shopjoin.dtos.UserTO;

public class UserFactory{

    public static User getUser(UserTO userTO) {
        UserBuilder userBuilder = UserBuilder.getInstance();

        return userBuilder
                .userId(userTO.getUserId())
                .email(userTO.getEmail())
                .username(userTO.getUsername())
                .name(userTO.getName())
                .build();
    }

    public static UserTO getUserTO(User user) {
        return UserTOBuilder
                .getInstance()
                .userId(user.getUserId())
                .username(user.getUsername())
                .email(user.getEmail())
                .password(user.getPassword())
                .name(user.getName())
                .build();
    }
}
