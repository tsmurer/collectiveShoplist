package com.tsmurer.shopjoin.services;

import com.tsmurer.shopjoin.domain.User;
import com.tsmurer.shopjoin.dtos.UserTO;

public class UserService {

    // register
    public void register(UserTO user){ }

    public void validateRegister(UserTO user){ }

    // signin

    public void signin(UserTO user){ }

    public void validateSignin(User existingUser, UserTO providedData){ }
}
