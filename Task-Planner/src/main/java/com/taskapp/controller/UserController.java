package com.taskapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskapp.model.User;
import com.taskapp.service.UserService;

//@Author - Rahul Somase

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("/getallusers")
  public List<User> getAllUsers() {
    return userService.getAllUsers();
  }

  @GetMapping("/{userId}")
  public User getUserById(@PathVariable Long userId) {
    return userService.getUserById(userId);
  }

  @PostMapping("/register")
  public User createUser(@RequestBody User user) {
    return userService.createUser(user);
  }

  @PutMapping("/{userId}")
  public void updateUser(@PathVariable Long userId, @RequestBody User user) {
    userService.updateUser(userId, user);
  }

  @DeleteMapping("/{userId}")
  public void deleteUser(@PathVariable Long userId) {
    userService.deleteUser(userId);
  }
}

