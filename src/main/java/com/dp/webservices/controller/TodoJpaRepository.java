package com.dp.webservices.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.dp.webservices.model.Todo;

@Component
public interface TodoJpaRepository extends JpaRepository<Todo, Long>{
	
	List<Todo> findByUsername(String username);

}