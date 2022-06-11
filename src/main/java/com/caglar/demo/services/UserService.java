package com.caglar.demo.services;

import com.caglar.demo.models.Role;
import com.caglar.demo.models.UserU;

import java.util.List;

public interface UserService {

    UserU save(UserU userU);
    Role save(Role role);
    void addRoleTo(String username, String role);
    UserU get(String username);
    List<UserU> list();
}
