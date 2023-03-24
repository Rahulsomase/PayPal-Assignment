package com.taskapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskapp.model.Task;
import com.taskapp.repository.TaskRepository;

import jakarta.persistence.EntityNotFoundException;

//@Author - Rahul Somase


@Service
public class TaskServiceImpl implements TaskService {

  @Autowired
  private TaskRepository taskRepository;

  @Override
  public Task getTaskById(Long taskId) {
    return taskRepository.findById(taskId).orElseThrow(() -> new EntityNotFoundException("Task not found with id: " + taskId));
  }

  @Override
  public List<Task> getAllTasks() {
    return taskRepository.findAll();
  }

  @Override
  public List<Task> getTasksBySprintId(Long sprintId) {
    return taskRepository.findBySprintId(sprintId);
  }

  @Override
  public List<Task> getTasksByAssignee(String assignee) {
    return taskRepository.findByAssignee(assignee);
  }

  @Override
  public void deleteTask(Long taskId) {
    taskRepository.deleteById(taskId);
  }

@Override
public Task addTask(Task task) {
	// TODO Auto-generated method stub
	return taskRepository.save(task);
}

@Override
public void updateTask(Long taskId, Task task) {
	// TODO Auto-generated method stub
	Task existingTask = taskRepository.findById(taskId).orElseThrow(() -> new EntityNotFoundException("Task not found with id: " + taskId));
    existingTask.setDescription(task.getDescription());
    existingTask.setType(task.getType());
    existingTask.setStatus(task.getStatus());
    existingTask.setAssignee(task.getAssignee());
    existingTask.setSprint(task.getSprint());
    taskRepository.save(existingTask);
}
}

