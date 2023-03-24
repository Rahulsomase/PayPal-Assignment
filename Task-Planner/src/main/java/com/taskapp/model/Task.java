package com.taskapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

//@Author - Rahul Somase

@Entity
@Table(name = "tasks")
public class Task {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Enumerated(EnumType.STRING)
  @Column(name = "type")
  private TaskType type;

  @Column(name = "description")
  private String description;

  @Enumerated(EnumType.STRING)
  @Column(name = "status")
  private TaskStatus status;

  @Column(name = "assignee")
  private String assignee;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "sprint_id")
  private Sprint sprint;
  
  
  // getters and setters
  
public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public TaskType getType() {
	return type;
}

public void setType(TaskType type) {
	this.type = type;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public TaskStatus getStatus() {
	return status;
}

public void setStatus(TaskStatus status) {
	this.status = status;
}

public String getAssignee() {
	return assignee;
}

public void setAssignee(String assignee) {
	this.assignee = assignee;
}

public Sprint getSprint() {
	return sprint;
}

public void setSprint(Sprint sprint) {
	this.sprint = sprint;
}

// Constructors using field

public Task(Long id, TaskType type, String description, TaskStatus status, String assignee, Sprint sprint) {
	super();
	this.id = id;
	this.type = type;
	this.description = description;
	this.status = status;
	this.assignee = assignee;
	this.sprint = sprint;
}

 // empty constructor
public Task() {
	// TODO Auto-generated constructor stub
}

 

  
}

