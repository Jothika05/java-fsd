package com.simplilearn.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class UserQuizStoreResponse {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String response;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public UserQuizStoreResponse(int id, String response) {
		super();
		this.id = id;
		this.response = response;
	}
	public UserQuizStoreResponse() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	
}

