package com.mong.repository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.mong.model.Tutorial;

import reactor.core.publisher.Flux;

@Repository
public interface TutorialRespository extends ReactiveMongoRepository<Tutorial, String>{
	Flux<Tutorial> findByPublished(boolean published);
	  Flux<Tutorial> findByTitleContaining(String title);
}
