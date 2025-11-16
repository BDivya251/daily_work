package com.chubb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chubb.Entity.Department;
import com.chubb.Service.DepartmentService;

@RestController
@RequestMapping("/api")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/addDep")
	public Department postDetails(@RequestBody Department department) {
		return departmentService.saveDetails(department);
	}
	@GetMapping("/department")
	public ResponseEntity<List<Department>> getAllDepts(){
		List<Department> dept = departmentService.getAllDept();
		if(dept.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(dept,HttpStatus.OK);
	}
}
