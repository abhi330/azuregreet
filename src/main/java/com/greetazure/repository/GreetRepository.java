package com.greetazure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greetazure.model.Greet;

public interface GreetRepository extends JpaRepository<Greet, Integer> {

}
