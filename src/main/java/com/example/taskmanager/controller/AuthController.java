package com.example.taskmanager.controller;

import com.example.taskmanager.model.User;
import com.example.taskmanager.repository.UserRepository;
import com.example.taskmanager.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class AuthController {

    @Autowired
    UserService service;

    @Autowired
    UserRepository repo;

    // register user
    @PostMapping("/register")
    public User register(@RequestBody User user){
        return service.register(user);
    }

    // login user
    @PostMapping("/login")
    public User login(@RequestBody User request){

        User user = repo.findByEmail(request.getEmail());

        if(user != null && user.getPassword().equals(request.getPassword())){
            return user;
        }

        throw new RuntimeException("Invalid login");

    }

    @GetMapping("/members")
    public List<User> getMembers(){
        return repo.findByRole("MEMBER");
    }

}