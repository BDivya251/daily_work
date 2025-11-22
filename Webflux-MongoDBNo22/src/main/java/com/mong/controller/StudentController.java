package com.mong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mong.model.Student;
import com.mong.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentservice;
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student s) {
		return studentservice.addStudents(s); 
	}
	
	@GetMapping("/")
	public List<Student> getStudent(){
		return studentservice.getStudents();
	}
	
	@GetMapping("/{id}")
	public Student getByStudId(@PathVariable Integer id) {
		return studentservice.getById(id);
	}
	@DeleteMapping("/")
	public void delAll() {
		studentservice.deleAll();
	}
	@DeleteMapping("/{id}")
	public void delById(@PathVariable Integer id) {
		studentservice.deleById(id);
	}
	@PutMapping("/updateStudent/{id}")
	public void updateStudent(@RequestBody Student s,@PathVariable Integer id) {
		studentservice.updateStudentById(s,id);
	}
}
