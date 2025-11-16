package com.chubb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chubb.Entity.Student;
import com.chubb.Repository.StudentRepo;
import com.chubb.Service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentSerive;
	
	@Autowired
	private StudentRepo studentRepo;
	@PostMapping("/addStudent")
	public ResponseEntity<Student> postDetails(@RequestBody Student student) {
		Student stud=studentRepo.save(new Student(student.getMark(),student.getName()));
		return new ResponseEntity<>(stud,HttpStatus.CREATED);
	}
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getStudents(){
		List<Student> st = studentSerive.getStudent();
		if(st.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(st,HttpStatus.OK);
	}
	
	
	
}
