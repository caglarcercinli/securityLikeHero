package com.caglar.demo.services;

import com.caglar.demo.models.Role;
import com.caglar.demo.models.User;

import java.util.List;

public interface UserService {

    User save(User user);
    Role save(Role role);
    void addRoleTo(String username, String role);
    User get(String username);
    List<User> list();
}
