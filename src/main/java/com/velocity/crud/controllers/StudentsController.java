package com.velocity.crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.crud.entity.Students;

import com.velocity.crud.services.StudentsServiceImpl;

@RestController
public class StudentsController {
	
	
	@Autowired
	StudentsServiceImpl studentsService;
	
	
	@GetMapping("/students")
	public List<Students> getAllStudents(){
		return studentsService.getAllStudents();
	}
	
	@PostMapping("/students")
	public Students saveStudent(@RequestBody Students students) {
		return studentsService.saveStudent(students);
		}
	
	@GetMapping("/students/{id}")
	public Students getStudentById(@PathVariable Integer id) {
		return studentsService.getStudentById(id);
	}
	
	@DeleteMapping("/students/{id}")
	public void deleteStudentById(@PathVariable Integer id) {
		studentsService.deleteStudentById(id);
	}

}
