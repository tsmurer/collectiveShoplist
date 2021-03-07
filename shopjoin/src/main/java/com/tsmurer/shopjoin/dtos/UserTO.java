package com.tsmurer.shopjoin.dtos;

import lombok.Data;

@Data
public class UserTO {

    private long userId;
    private String email;
    private String password;
    private String username;
    private String name;

}
