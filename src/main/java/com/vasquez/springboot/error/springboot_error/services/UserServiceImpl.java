package com.vasquez.springboot.error.springboot_error.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.vasquez.springboot.error.springboot_error.models.domain.User;

@Service
public class UserServiceImpl implements UserService {

    private List<User> users;

    public UserServiceImpl() {
        this.users = new ArrayList<>();
        users.add(new User(1L, "Pepito", "Rojas"));
        users.add(new User(2L, "Andres", "Lincoln"));
        users.add(new User(3L, "Maria", "Mendieta"));
        users.add(new User(4L, "Josefa", "Guitierrez"));
        users.add(new User(5L, "Ezra", "Ramirez"));
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public Optional<User> findById(Long id) {
        return users.stream().filter(u -> u.getId().equals(id)).findFirst();
    }

}
