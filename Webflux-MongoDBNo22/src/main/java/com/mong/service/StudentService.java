package com.mong.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mong.model.Student;
import com.mong.repositories.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentrepository;
	public Student addStudents(Student s) {
		return studentrepository.save(s);
	}
	public List<Student> getStudents(){
		return studentrepository.findAll();
	}
	public Student getById(Integer id) {
		return studentrepository.findById(id)
				.orElse(null);
	}
	public void deleAll() {
		studentrepository.deleteAll();
	}
	public void deleById(Integer id) {
		 studentrepository.deleteById(id);
	}
	
	public void updateStudentById(Student student,Integer id) {
		
		Student data = studentrepository.findById(id).orElse(null);
		if(data!=null) {
//		studentrepository.save(student);
			data.setAddress(student.getAddress());
			data.setName(student.getName());
			studentrepository.save(data);
		}
	}
}
