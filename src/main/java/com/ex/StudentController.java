package com.ex;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService ss;
	
	@RequestMapping(value="/student", method=RequestMethod.GET)
	public List<Student> getAllStudents(){
		return ss.select();
	}
	
	@RequestMapping(value="/addStudent",method=RequestMethod.POST)
	public void addStudent(@RequestBody Student s) {
		ss.insert(s);
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public void deleteStudent(@PathVariable int id) {
		ss.delete(id);
	
	}
	
	@RequestMapping(value="/update/{marks}/{id}",method=RequestMethod.PUT)
	public void updateStudent(@PathVariable int marks,@PathVariable int id) {
		ss.update(marks,id);
	
	}
	
}
