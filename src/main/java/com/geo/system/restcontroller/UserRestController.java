package com.geo.system.restcontroller;

import com.geo.system.controller.UserController;
import com.geo.system.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UserRestController {
    @Autowired
    UserController userController;

    @PostMapping(path = "/insertUser")
    public User insert(@RequestBody @Valid User user) {
        return userController.insert(user);
    }

    @GetMapping(path = "/getAllUser")
    public @ResponseBody
    Iterable<User> getAll() {
        return userController.getAll();
    }

    @DeleteMapping(path = "/deleteUser/{id}")
    public void deleteById(@PathVariable Integer id) {
        userController.deleteById(id);
    }

    @GetMapping(path = "updateUser/{id}")
    public User update(@PathVariable Integer id, @RequestBody @Valid User user) {
        return userController.update(id, user);
    }
}
