package com.taskapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taskapp.model.Sprint;
import com.taskapp.model.Task;
import com.taskapp.model.User;

//@Author - Rahul Somase

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

	List<Task> findBySprintId(Long sprintId);
	  List<Task> findByAssignee(String assignee);
	}

