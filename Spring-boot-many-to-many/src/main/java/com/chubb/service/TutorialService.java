package com.chubb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chubb.model.Tutorial;
import com.chubb.repository.TutorialRepository;

@Service
public class TutorialService {
	@Autowired
	private TutorialRepository tutorialRepository;
	
	public Tutorial saveDetails(Tutorial tutorial) {
		return tutorialRepository.save(tutorial);
		
	}
}
