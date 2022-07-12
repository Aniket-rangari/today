package com.example.practice;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceLayer {

	@Autowired
	private repo repository;
	
	public Student addStudent(Student s) {
		repository.save(s);
		return s;
	}
	
	
	public Student getStudent(int id) {
		return repository.findById(id).orElse(null);	
	}
	
	public List<Student> getStudentsbyList(){
		return repository.findAll();
	}
	
	public List<Student> getStudentsBList(){
		
		List<Student> list = repository.findAll();
		
		list.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		return list;
	}
	
	public String deleteStudent(int id) {
		repository.deleteById(null);
		return "Strudent deleted, id:" +id ;
	}
	
	
	public Student editStudent(Student s) {
		
		Student a = repository.findById(s.getId()).orElse(null);
		a.setName(s.getName());
		return a;
	}
	
}
