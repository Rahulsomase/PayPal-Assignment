package com.taskapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskapp.model.Sprint;
import com.taskapp.repository.SprintRepository;

import jakarta.persistence.EntityNotFoundException;

//@Author - Rahul Somase

@Service
public class SprintServiceImpl implements SprintService{

	 @Autowired
	  private SprintRepository sprintRepository;

	  @Override
	  public Sprint createSprint(Sprint sprint) {
	    return sprintRepository.save(sprint);
	  }

	  @Override
	  public Sprint getSprintById(Long sprintId) {
	    return sprintRepository.findById(sprintId).orElseThrow(() -> new EntityNotFoundException("Sprint not found with id: " + sprintId));
	  }

	  @Override
	  public List<Sprint> getAllSprints() {
	    return sprintRepository.findAll();
	  }

	  @Override
	  public void deleteSprint(Long sprintId) {
	    sprintRepository.deleteById(sprintId);
	  }

}
