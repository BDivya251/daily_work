package com.chubb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import com.chubb.model.Tag;
import com.chubb.repository.TagRepository;

@RestController
public class TagController {
	@Autowired
	private TagRepository tagRepository;
	
	public ResponseEntity<List<Tag>> getAllTags(){
		List<Tag> tags = new ArrayList<>();
		tagRepository.findAll().forEach(tags::add);
		if(tags.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(tags,HttpStatus.NO_CONTENT);
	}
}
