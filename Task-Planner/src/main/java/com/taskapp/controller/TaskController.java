package com.taskapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskapp.model.Task;
import com.taskapp.repository.TaskRepository;

// @Author - Rahul Somase

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

  @Autowired
  private TaskRepository taskRepository;

  @GetMapping("/{taskId}")
  public Task getTaskById(@PathVariable Long taskId) {
    return taskRepository.findById(taskId).orElseThrow();
  }

  @PostMapping("/addtask")
  public Task addTask(@RequestBody Task task) {
    return taskRepository.save(task);
  }
}
