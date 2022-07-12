package com.example.practice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerLayer {
	
	@Autowired
	private ServiceLayer sl;
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student s) {
		return sl.addStudent(s);		
	}
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {
		return sl.getStudent(id);
	}
	
	@GetMapping("/students")
	public List<Student> getStudentbyList(){
		return sl.getStudentsbyList();
	}
	
	@GetMapping("/studentsbydec")
	public List<Student> getStudentbyasc(){
		return sl.getStudentsBList();
	}
	
	@PutMapping("/students")
	public Student editStudent(@RequestBody Student s) {
		return sl.editStudent(s);
	}
	
	@DeleteMapping("/students")
	public String deleteStudent(@PathVariable int id) {
		return sl.deleteStudent(id);
	}
	
}
