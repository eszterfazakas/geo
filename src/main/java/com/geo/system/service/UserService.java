package com.geo.system.service;

import com.geo.system.dao.UserDAO;
import com.geo.system.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDAO userDAO;

    public User insert(User user) {
        return userDAO.save(user);
    }

    public Iterable<User> getAll() {
        return userDAO.findAll();
    }

    public void deleteById(Integer id) {
        userDAO.deleteById(id);
    }

    public User update(Integer id, User user) {
        return userDAO.updateUser(id, user);
    }
}
