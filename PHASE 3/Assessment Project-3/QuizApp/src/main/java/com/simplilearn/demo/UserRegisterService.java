package com.simplilearn.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterService {
	
	@Autowired
	private UserRegisterRepo repo;
	
	//add method or CREATE RECORD
		public UserRegister addUser(UserRegister u) {
			return repo.save(u);
		}
		
		
		//List user Method
		public List<UserRegister> getAllUser(){
			return repo.findAll();
		}
}