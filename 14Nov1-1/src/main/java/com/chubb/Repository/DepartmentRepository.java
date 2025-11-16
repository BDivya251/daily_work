package com.chubb.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chubb.Entity.Department;

public interface DepartmentRepository extends JpaRepository<Department,Integer>{
	
//	List<Department> findByID(int id);
//	List<Department> findByName(String name);
}
