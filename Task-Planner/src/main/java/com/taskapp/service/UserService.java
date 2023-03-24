package com.taskapp.service;

import java.util.List;

import com.taskapp.model.User;

//@Author - Rahul Somase

public interface UserService {
	
	
	public User createUser(User user);
	public User getUserById(Long userId);
	public List<User> getAllUsers();
	public void updateUser(Long userId, User user);
	public void deleteUser(Long userId);
}
