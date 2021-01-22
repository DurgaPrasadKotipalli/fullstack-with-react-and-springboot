package com.dp.webservices.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dp.webservices.model.Todo;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<>();
	private static int idCounter = 0;
	
	static {
		todos.add(new Todo(++idCounter, "in28minutes", "Learn to Dance", "false", new Date()));
		todos.add(new Todo(++idCounter, "in28minutes", "Learn microservices", "false", new Date()));
		todos.add(new Todo(++idCounter, "in28minutes", "Learn ReactJs", "false", new Date()));
	}
	
	public List<Todo> findAll(){
		return todos;
	}
	
	public Todo save(Todo todo) {
		if(todo.getId() == -1  || todo.getId() == 0) {
			todo.setId(++idCounter);
			todos.add(todo);
		}else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
	
	public Todo deleteById(long id) {
		Todo todo = findById(id);
		if(todo != null) {
			todos.remove(todo);
			return todo;
		}
		else {
			return null;
		}
	}

	public Todo findById(long id) {
		for(Todo todo : todos) {
			if(todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}

}
