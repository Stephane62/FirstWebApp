package com.tchonlafi.myfirstwebwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.fasterxml.jackson.core.filter.TokenFilter;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<Todo>();
	
	private static int todosCount = 0;
	
	static {
		todos.add(new Todo(++todosCount, "Stephane","Learn AWS", LocalDate.now().plusYears(1), false ));
        todos.add(new Todo(++todosCount, "in28minutes","Learn DevOps", LocalDate.now().plusYears(2), false ));
        todos.add(new Todo(++todosCount, "Test 2","Learn Full Stack Development", LocalDate.now().plusYears(3), false ));
	}
	
	public List<Todo> findByUsername(String username){
		return todos;
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		todos.add(new Todo(++todosCount, username, description, targetDate, done));
	}
	public void deleteById(int id) {

		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}
	public Todo findById(int id) {

		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
	Todo todo= todos.stream().filter(predicate).findFirst().get();
		return todo;
	}

	public void updateTodo(@Valid Todo todo) {
		/// TODO: 12.07.2023

		deleteById(todo.getId() );
		todos.add(todo);
	}
}
