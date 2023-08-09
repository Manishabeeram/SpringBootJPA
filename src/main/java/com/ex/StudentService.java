package com.ex;


import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository sr;
	
	public void insert(Student s) {
		sr.save(s);
		
	}
	
	public void delete(int id) {
		sr.deleteById(id);
		
	}
	
	public List<Student> select() {
		List<Student> li=sr.findAll();
		return li;
	}
	public void update(int marks,int id) {
		sr.updateMarks(marks, id);
	}
	
	

}
