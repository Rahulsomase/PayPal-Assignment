package com.taskapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.taskapp.model.Sprint;

//@Author - Rahul Somase

@Service
public interface SprintService {

	  public Sprint createSprint(Sprint sprint);
	  public Sprint getSprintById(Long sprintId);
	  public  List<Sprint> getAllSprints();
	  public void deleteSprint(Long sprintId);
}
