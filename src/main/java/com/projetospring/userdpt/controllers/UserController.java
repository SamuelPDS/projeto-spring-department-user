package com.projetospring.userdpt.controllers;

import com.projetospring.userdpt.entities.User;
import com.projetospring.userdpt.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserRepository repository;
    @GetMapping
    public List<User> findAll(){
        List<User> result = repository.findAll();
        return  result;
    }
}