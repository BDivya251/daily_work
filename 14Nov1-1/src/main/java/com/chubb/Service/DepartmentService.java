package com.chubb.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chubb.Entity.Department;
import com.chubb.Repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	public Department saveDetails(Department department) {
		return departmentRepository.save(department);
	}
	public List<Department> getAllDept(){
		return departmentRepository.findAll();
	}
}
