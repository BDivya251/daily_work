package com.chubb.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Department {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
//	@OneToMany(mappedBy="department_id", cascade = CascadeType.ALL)
//	@JsonIgnoreProperties({"department"})
//	private List<Student> student;
}
