package com.geo.system.controller;

import com.geo.system.entity.User;
import com.geo.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    public User insert(User user) {
        return userService.insert(user);
    }

    public Iterable<User> getAll() {
        return userService.getAll();
    }

    public void deleteById(Integer id) {
        userService.deleteById(id);
    }

    public User update(Integer id, User user) {
        return userService.update(id, user);
    }
}
