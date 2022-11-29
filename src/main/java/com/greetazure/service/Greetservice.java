package com.greetazure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greetazure.model.Greet;
import com.greetazure.repository.GreetRepository;

@Service
public class Greetservice {
	
	@Autowired
	GreetRepository greetrepo;

	public String save(Greet greet) {
		greetrepo.save(greet);
		return "grret msg saved";
	}

	public String delete(int id) {
		greetrepo.deleteById(id);
		return "greet msg deleted";
	}

	public String getbyid(int id) {
		return greetrepo.findById(id).get().getGreetmsg();
	}
	
	

}
