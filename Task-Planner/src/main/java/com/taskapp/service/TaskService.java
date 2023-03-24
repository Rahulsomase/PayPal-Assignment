package com.taskapp.service;

import java.util.List;

import com.taskapp.model.Task;


//@Author - Rahul Somase

public interface TaskService {
	  public Task addTask(Task task);
	  public Task getTaskById(Long taskId);
	  public List<Task> getAllTasks();
	  public List<Task> getTasksBySprintId(Long sprintId);
	  public List<Task> getTasksByAssignee(String assignee);
	  public void updateTask(Long taskId, Task task);
	  public void deleteTask(Long taskId);
	}
