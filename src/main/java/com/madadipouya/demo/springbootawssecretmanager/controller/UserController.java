package com.madadipouya.demo.springbootawssecretmanager.controller;

import com.madadipouya.demo.springbootawssecretmanager.entity.User;
import com.madadipouya.demo.springbootawssecretmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "v1/users")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    private UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
