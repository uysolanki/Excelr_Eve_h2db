package com.excelr.h2dbdemo.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.h2dbdemo.entity.Student;
import com.excelr.h2dbdemo.service.StudentService;

@RequestMapping("/excelrlms")
@RestController
public class MyController {
	
	@Autowired
	StudentService studService;
	
	private static final Logger logger=Logger.getLogger(MyController.class);
	
	@PostMapping("/addStudent")
	public Student addStudent()
	{
		logger.debug("Add Student API Invoked");
		String strdob="2020-04-25";
		DateTimeFormatter myDateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dob= LocalDate.parse(strdob,myDateTimeFormatter);
		//Student s1=new Student(0, "Alice",78.5,19,dob,"A123456");
		Student s1=Student.builder()
				.sname("Alice")
				.per(78.5)
				.age(19)
				.dob(dob)
				.build();
		logger.info("Add Student API Completed");
		return studService.addStudent(s1);
		
	}
	
	@GetMapping("/test")
	public String test(@RequestParam("a") int a)
	{
		return "hi";
		
	}
	

}
