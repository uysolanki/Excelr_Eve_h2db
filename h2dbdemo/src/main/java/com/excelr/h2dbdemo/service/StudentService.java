package com.excelr.h2dbdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.h2dbdemo.entity.Student;
import com.excelr.h2dbdemo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studRepo;
	public Student addStudent(Student s1) {
		return studRepo.save(s1);
	}

}
