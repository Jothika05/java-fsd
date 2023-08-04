package com.simplilearn.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserQuizStoreResponseService {
	
	@Autowired
	private UserQuizStoreResponseRepo repo;
	
	//add method or CREATE RECORD
	public UserQuizStoreResponse addUser(UserQuizStoreResponse u) {
		return repo.save(u);
	}
	
	
	//List user Method
	public List<UserQuizStoreResponse> getAllUser(){
		return repo.findAll();
	}
	
	 

}