package com.chubb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chubb.model.Tutorial;
import com.chubb.repository.TutorialRepository;
import com.chubb.service.TutorialService;

@RestController
public class TutorialController {
	@Autowired
	TutorialRepository tutorialRepository;
	@Autowired
	TutorialService tutorialService;
	@GetMapping("/tutorials")
	public ResponseEntity<List<Tutorial>> getAllTutorials(@RequestParam(required=false) String title){
		List<Tutorial> tutorials = new ArrayList<Tutorial>();
		if(title==null) {
			tutorialRepository.findAll().forEach(tutorials::add);
		}
		else {
			tutorialRepository.findByTitleContaining(title).forEach(tutorials::add);
			
		}
		if(tutorials.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		else {
			return new ResponseEntity<>(tutorials,HttpStatus.OK);
		}
	}
	

	  @PostMapping("/tutorials")
	  public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial tutorial) {
	    Tutorial tutorial1 = tutorialRepository.save(new Tutorial(tutorial.getTitle(), tutorial.getDescription(), true));
		  return new ResponseEntity<>(tutorial1,HttpStatus.OK);
	  }
	  @DeleteMapping("/tutorials/{id}")
	  public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
	    tutorialRepository.deleteById(id);
	    
	    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	  }
	  
	  @PutMapping("/tutorials/{id}")
	  public ResponseEntity<Tutorial> updateTutorial(@PathVariable("id") long id, @RequestBody Tutorial tutorial) throws Exception {
	    Tutorial _tutorial = tutorialRepository.findById(id).orElseThrow(()->new Exception());

	    _tutorial.setTitle(tutorial.getTitle());
	    _tutorial.setDescription(tutorial.getDescription());
	    _tutorial.setPublished(tutorial.isPublished());
	    
	    return new ResponseEntity<>(tutorialRepository.save(_tutorial), HttpStatus.OK);
	  }

}
