package com.chubb.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="Student_add")
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	@Id
	@Column(name="ID")
	@GeneratedValue
	private Integer id;
	private String streetName;
	private String houseNumber;
	private String zipCode;
	
	@OneToOne(mappedBy="address")
	@JsonIgnore
	private Student student;
}
