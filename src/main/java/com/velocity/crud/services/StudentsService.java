package com.velocity.crud.services;

import java.util.List;

import com.velocity.crud.entity.Students;

public interface StudentsService {
	
	
	List<Students> getAllStudents();
	Students saveStudent(Students students);
	Students getStudentById(Integer id);
	void deleteStudentById(Integer id);

	
	
}
