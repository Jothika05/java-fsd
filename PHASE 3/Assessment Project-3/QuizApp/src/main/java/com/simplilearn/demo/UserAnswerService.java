package com.simplilearn.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAnswerService {
	
	@Autowired
	private UserAnswerRepo repo;
	
	//add method or CREATE RECORD
	public UserAnswer addUser(UserAnswer u) {
		return repo.save(u);
	}
	
	
	//List user Method
	public List<UserAnswer> getAllUser(){
		return repo.findAll();
	}
}