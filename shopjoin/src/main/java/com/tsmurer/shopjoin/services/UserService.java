package com.tsmurer.shopjoin.services;

import com.tsmurer.shopjoin.domain.User;
import com.tsmurer.shopjoin.dtos.UserTO;
import com.tsmurer.shopjoin.factories.UserFactory;
import com.tsmurer.shopjoin.repositories.UserRepository;
import com.tsmurer.shopjoin.utils.Hasher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // register
    public User register(UserTO userTO){
        userTO.setPassword(Hasher.hashPassword(userTO.getPassword()));
        User existingUser = userRepository.findByEmail(userTO.getEmail());
        User user = UserFactory.getUser(userTO);
        if(existingUser == null) {
            userRepository.save(user);
            existingUser = user;
        }else {
            existingUser.setPassword(user.getPassword());
            existingUser.setEmail(user.getEmail());
            existingUser.setUsername(user.getUsername());
            existingUser.setName(user.getName());
        }

        return existingUser;
    }

    public void validateRegister(UserTO user){ }

    // signin

    public void signin(UserTO user){ }

    public void validateSignin(User existingUser, UserTO providedData){ }
}
