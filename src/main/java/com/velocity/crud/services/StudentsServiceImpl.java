package com.velocity.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.crud.entity.Students;
import com.velocity.crud.repository.StudentsRepository;


@Service
public class StudentsServiceImpl implements StudentsService{
	
	@Autowired
	StudentsRepository studentRepository;

	@Override
	public List<Students> getAllStudents() {
		return studentRepository.findAll();
	}

	

	@Override
	public Students getStudentById(Integer id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public void deleteStudentById(Integer id) {
		studentRepository.deleteById(id);
	}

	@Override
	public Students saveStudent(Students students) {
		return studentRepository.save(students);
	}

	
	
}
