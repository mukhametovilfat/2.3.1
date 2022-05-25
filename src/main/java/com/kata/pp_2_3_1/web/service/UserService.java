package com.kata.pp_2_3_1.web.service;

import com.kata.pp_2_3_1.web.entity.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void updateUser(User user);

    void removeUserById(long id);

    User getUserById(long id);

    List<User> getAllUsers();
}