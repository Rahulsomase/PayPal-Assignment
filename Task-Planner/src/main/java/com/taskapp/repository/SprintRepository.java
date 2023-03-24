package com.taskapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskapp.model.Sprint;

//@Author - Rahul Somase

public interface SprintRepository extends JpaRepository<Sprint, Long> {

}
