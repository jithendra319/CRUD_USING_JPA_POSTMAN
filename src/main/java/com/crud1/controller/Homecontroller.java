package com.crud1.controller;

import java.util.List;
import java.util.Optional;

import com.crud1.student;
import com.crud1.Repo.Studentrepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Homecontroller {
	@Autowired
	Studentrepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@DeleteMapping("/student/{rno}")
	public String deletestudent(@PathVariable int rno) {
		student s=repo.getOne(rno);
		repo.delete(s);
		return "deleted";
	}
	
	@PutMapping("/student")
	public student update(student s1) {
		repo.save(s1);
		return s1;   // we are returning the same student object instead of jsp page
	}
	@PostMapping("/student")
	public student insert(student s1) {
		repo.save(s1);
		return s1;   // we are returning the same student object instead of jsp page
	}
	
	@GetMapping(path="/students")
	public List<student> getstudents() {
		
		return repo.findAll();
	}

	@GetMapping("/student/{rno}")
	public Optional<student> getstudent(@PathVariable("rno") int rno ) {
		
		return repo.findById(rno);
	}
	
	
}
