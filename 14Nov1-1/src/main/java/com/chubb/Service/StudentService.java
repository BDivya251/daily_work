package com.chubb.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chubb.Entity.Student;
import com.chubb.Repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo studentRep;
	
	public Student saveDetails(Student student) {
		
		return studentRep.save(student);
	}
	public List<Student> getStudent(){
		return studentRep.findAll();
	}
}
