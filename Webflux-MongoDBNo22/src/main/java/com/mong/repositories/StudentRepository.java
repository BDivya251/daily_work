package com.mong.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mong.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student,Integer>{



}
