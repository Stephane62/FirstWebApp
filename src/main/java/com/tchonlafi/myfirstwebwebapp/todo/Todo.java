package com.tchonlafi.myfirstwebwebapp.todo;

import java.time.LocalDate;

//Database

public class Todo {

	private int id;
	private String username;
	private String description;
	private LocalDate tragetDate;
	private boolean done;

	public Todo(int id, String username, String description, LocalDate tragetDate, boolean done) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.tragetDate = tragetDate;
		this.done = done;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTragetDate() {
		return tragetDate;
	}

	public void setTragetDate(LocalDate tragetDate) {
		this.tragetDate = tragetDate;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", description=" + description + ", tragetDate="
				+ tragetDate + ", done=" + done + "]";
	}

}
