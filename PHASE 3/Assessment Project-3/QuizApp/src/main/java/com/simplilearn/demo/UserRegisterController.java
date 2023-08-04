package com.simplilearn.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/userregister")
public class UserRegisterController {
	
	@Autowired
	private UserRegisterService service;
	
	//create new record
	@PostMapping("/")
	public ResponseEntity<UserRegister> addUser(@RequestBody UserRegister u){
		UserRegister user= service.addUser(u);
		if(user!=null)  
			return new ResponseEntity<UserRegister>(user,HttpStatus.CREATED);
		else
			return new ResponseEntity<UserRegister>(user, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	//List of Users Or RETRIVE DATA
	@GetMapping("/")
	public  List<UserRegister> getAllUser(){
		return service.getAllUser();
	}
	
	 
}