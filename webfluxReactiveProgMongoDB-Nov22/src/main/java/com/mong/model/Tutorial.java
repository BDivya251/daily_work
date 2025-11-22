package com.mong.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Document
@Data
public class Tutorial {
	@Id
	  private String id;

	  private String title;

	  private String description;

	  private boolean published;

}
