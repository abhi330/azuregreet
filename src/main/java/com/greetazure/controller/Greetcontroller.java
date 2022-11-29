package com.greetazure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.greetazure.model.Greet;
import com.greetazure.service.Greetservice;

@RestController

public class Greetcontroller {
	
	@Autowired
	Greetservice service;
	
	@GetMapping
	public String hello() {
		return "hrllo";
	}
	@GetMapping("/geetuser/{id}/{name}")
	public String geetuser(@PathVariable String name,@PathVariable int id ) {
		return ""+service.getbyid(id)+" "+name ;
	}
	
	
	@PostMapping("/addgreet")
	public String addgreet(@RequestBody Greet greet) {
		return service.save(greet);
	}
	@DeleteMapping("/deletegreet/{id}")
	public String delete(@PathVariable int id) {
		return service.delete(id);
		
	}
	

}
