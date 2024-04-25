package com.excelr.h2dbdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excelr.h2dbdemo.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
