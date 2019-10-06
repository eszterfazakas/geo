package com.geo.system.dao;

import com.geo.system.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserDAO extends CrudRepository<User, Integer> {
    UserDAO userDAO = null;

    default User updateUser(Integer id, User user) {
        Optional<User> userToUpdate = findById(id);
        if (userToUpdate.isPresent()) {
            User userWithIdFound = userToUpdate.get();
            userWithIdFound.setEmail(user.getEmail());
            userWithIdFound.setPhoneNumber(user.getPhoneNumber());
            userWithIdFound.setName(user.getName());
            userWithIdFound.setPassword(user.getPassword());
            userWithIdFound.setRole(user.getRole());

            return save(userWithIdFound);
        }

        return null;
    }
}