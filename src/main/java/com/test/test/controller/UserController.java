package com.test.test.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.test.test.entity.User;
import com.test.test.service.UserService;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getUser() {
        return this.userService.getUsers();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Integer id) {
        return this.userService.getUserById(id);
    }

    @PostMapping("/newUser")
    ResponseEntity<?> newUser(@RequestBody User user) {
        if (this.userService.saveNewUser(user) != null)
            return new ResponseEntity(user, HttpStatus.CREATED);
        else
            return new ResponseEntity("Validar campos del usuario", HttpStatus.BAD_REQUEST);
    }

    @PutMapping("/newUser/{id}")
    public User updateUser(@PathVariable Integer id,
            @RequestBody User user) {
        return this.userService.updateUser(user, id);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable Integer id) {
        this.userService.deleteUser(id);
    }
}
