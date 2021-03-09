package com.tsmurer.shopjoin.builders;

import com.tsmurer.shopjoin.domain.User;

public class UserBuilder {

    private long userId;
    private String username;
    private String name;
    private String password;
    private String email;

    public static UserBuilder getInstance() {
        return new UserBuilder();
    }

    public UserBuilder userId(long userId) {
        this.userId = userId;
        return this;
    }

    public UserBuilder username(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder email(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder password(String password) {
        this.password = password;
        return this;
    }

    public User build() {
        User user = new User();
        user.setUserId(userId);
        user.setUsername(username);
        user.setEmail(email);
        user.setName(name);
        user.setPassword(password);

        return user;
    }
}
