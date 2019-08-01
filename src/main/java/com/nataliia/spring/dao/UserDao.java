package com.nataliia.spring.dao;

import java.util.List;

import com.nataliia.spring.entity.User;

public interface UserDao {
   void add(User user);
   List<User> listUsers();
}
