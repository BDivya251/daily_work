package com.chubb.Entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity //corresponding it to the table in SQL
//@Data //shortcut from project lombok to generate boilerplate code for classes
@Table(name="Student_DB") //through which we refer to mysql table
//@NoArgsConstructor // a default constructor
//@AllArgsConstructor //avoid writing long constructor
public class Student {
	@Id
	@Column(name="ID") //specify the column name
	@GeneratedValue
	private int id;
	
	@Column(name="ST_MARK")
	private int mark;
	
	@Column(name="Name")
	private String name;
	public Student(int mark,String name) {
		this.mark=mark;
		this.name=name;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address address;
	
	@ManyToOne(fetch = FetchType.LAZY,optional=false)
	@JoinColumn(name="department_id",nullable=false)
	@OnDelete(action=OnDeleteAction.CASCADE)
	@JsonIgnore
	private Department department;
	
}
