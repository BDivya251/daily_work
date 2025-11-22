package com.mong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@SpringBootApplication
public class MongoDbTutorial2Application {

	public static void main(String[] args) {
		SpringApplication.run(MongoDbTutorial2Application.class, args);
	}

}
