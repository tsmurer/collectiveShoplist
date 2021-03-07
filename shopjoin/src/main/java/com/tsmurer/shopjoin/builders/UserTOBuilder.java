package com.tsmurer.shopjoin.builders;

import com.tsmurer.shopjoin.dtos.UserTO;

public class UserTOBuilder{
    private long userId;
    private String password;
    private String username;
    private String email;
    private String name;

    public static UserTOBuilder getInstance() {
        return new UserTOBuilder();
    }

    public UserTOBuilder userId(long userId) {
        this.userId = userId;
        return this;
    }

    public UserTOBuilder username(String username) {
        this.username = username;
        return this;
    }

    public UserTOBuilder name(String name) {
        this.name = name;
        return this;
    }

    public UserTOBuilder email(String email) {
        this.email = email;
        return this;
    }

    public UserTOBuilder password(String password) {
        this.password = password;
        return this;
    }

    public UserTO build() {
        UserTO user = new UserTO();
        user.setUserId(userId);
        user.setEmail(email);
        user.setUsername(username);
        user.setName(name);
        user.setPassword(password);
        return user;
    }

}
