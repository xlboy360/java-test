package com.test.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.test.entity.User;
import com.test.test.interfa.UserInterface;

@Service
public class UserService {

    private UserInterface userInterface;

    public UserService(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    public List<User> getUsers() {
        return this.userInterface.findAll();
    }

    public User getUserById(Integer id) {
        return this.userInterface.findById(id).orElse(null);
    }

    public User saveNewUser(User user) {
        if (this.isUserValid(user)) {
            return this.userInterface.save(user);
        } else
            return null;
    }

    public User updateUser(User user, Integer id) {
        User user1 = this.userInterface.findById(id).orElse(null);
        if (user1 != null && this.isUserValid(user)) {
            user1.setName(user.getName());
            user1.setEmail(user.getEmail());
            user1.setAge(user.getAge());

            this.userInterface.save(user1);
            return user1;
        } else
            return null;
    }

    public void deleteUser(Integer id) {
        this.userInterface.deleteById(id);
    }

    private Boolean isUserValid(User user) {
        if (user.getName() == null ||
                user.getEmail() == null ||
                user.getAge() == null) {
            return false;
        }
        return true;
    }

}
