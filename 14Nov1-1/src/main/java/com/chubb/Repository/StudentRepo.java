package com.chubb.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chubb.Entity.Student;

import jakarta.transaction.Transactional;

public interface StudentRepo extends JpaRepository<Student,Integer>{
//	List<Student> findById(int id);
//	List<Student> findByName(int name);
//	@Transactional
//	void deleteByStudentId(int id);
}
