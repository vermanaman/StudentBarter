package com.barter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.barter.domain.Instructor;
import com.barter.domain.Student;
import com.barter.domain.Subscription;
import com.barter.domain.User;
import com.barter.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(path="/saveStudent", method = RequestMethod.POST)
	public User saveOrUpdate(@RequestBody Student student) {
		return userService.saveOrUpdate(student);
	}
	
	@RequestMapping (path="/saveInstructor", method = RequestMethod.POST)
	public User saveOrUpdate(@RequestBody Instructor instructor){
		return userService.saveOrUpdate(instructor);
	}

	@RequestMapping(path="/getUser", method = RequestMethod.GET)
	public User getUser(){
		User user = userService.getUser();
		System.out.println("User retrieval!" +user);
		return user;
	}
	
	@RequestMapping(path="/getSubscriptions", method = RequestMethod.GET)
	public List<Subscription> getSubscriptions(){
		Student user = (Student) userService.getUser();
		System.out.println("Subscription retrieval!" +user);
		return user.getSubscriptions();
	}
}
