package com.taskapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskapp.model.User;

//@Author - Rahul Somase

public interface UserRepository extends JpaRepository<User, Long> {

}
