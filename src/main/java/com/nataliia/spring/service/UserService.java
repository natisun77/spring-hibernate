package com.nataliia.spring.service;

import java.util.List;

import com.nataliia.spring.entity.User;

public interface UserService {
    void add(User user);
    List<User> listUsers();
}
