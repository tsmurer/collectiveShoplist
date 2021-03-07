package com.tsmurer.shopjoin.controllers;

import com.tsmurer.shopjoin.domain.User;
import com.tsmurer.shopjoin.dtos.UserTO;
import com.tsmurer.shopjoin.errors.ValidationException;
import com.tsmurer.shopjoin.factories.UserFactory;
import com.tsmurer.shopjoin.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path="/register")
    public ResponseEntity<Object> register(@RequestBody UserTO userto) {
        try {
            User RegisteredUser = userService.register(userto);
            UserTO to = UserFactory.getUserTO(RegisteredUser);
            return ResponseEntity.ok(to);
        } catch(ValidationException e) {
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }
}
