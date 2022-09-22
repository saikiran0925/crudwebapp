package com.velocity.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.velocity.crud.entity.Students;
import com.velocity.crud.services.StudentsServiceImpl;

@RestController
public class StudentsController {
	
	
	@Autowired
	StudentsServiceImpl studentsService;
	
	
	@GetMapping("/")
	public ModelAndView studentsList() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("student", studentsService.getAllStudents());
		mv.setViewName("index");
		return mv;
	}
	
	@GetMapping("/addstudent")
	public ModelAndView addStudent(Model model) {
		ModelAndView mv = new ModelAndView();
		Students student = new Students();
		mv.addObject("student", student);
		mv.setViewName("addstudent");
		return mv;
	}
	
	
	

	@PostMapping("/students")
	public ModelAndView saveStudents( Students students) {
		ModelAndView mv = new ModelAndView("redirect:/");
		 studentsService.saveStudent(students);
		 return mv;
		}

	
	@GetMapping("/deletestudents/{id}")
	public ModelAndView deleteStudentById(@PathVariable Integer id) {
		studentsService.deleteStudentById(id);
		ModelAndView mv = new ModelAndView("redirect:/");
		return mv;
	}
	
	
	
	
	
	@GetMapping("/students/{id}")
	public ModelAndView getStudentById(@PathVariable Integer id) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("student", studentsService.getStudentById(id));
		mv.setViewName("addstudent");
		return mv;
	}
	

}
