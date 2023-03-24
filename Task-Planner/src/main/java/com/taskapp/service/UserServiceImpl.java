package com.taskapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskapp.model.User;
import com.taskapp.repository.UserRepository;

import jakarta.persistence.EntityNotFoundException;

//@Author - Rahul Somase

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;


  @Override
  public User getUserById(Long userId) {
    return userRepository.findById(userId).orElseThrow(() -> new EntityNotFoundException("User not found with id: " + userId));
  }

  @Override
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  @Override
  public void deleteUser(Long userId) {
    userRepository.deleteById(userId);
  }

@Override
public User createUser(User user) {
	// TODO Auto-generated method stub
	  return userRepository.save(user);
}

@Override
public void updateUser(Long userId, User user) {
	// TODO Auto-generated method stub
	 User existingUser = userRepository.findById(userId).orElseThrow(() -> new EntityNotFoundException("User not found with id: " + userId));
	    existingUser.setName(user.getName());
	    existingUser.setEmail(user.getEmail());
	    userRepository.save(existingUser);
}
}

