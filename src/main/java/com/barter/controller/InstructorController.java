package com.barter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.barter.domain.Instructor;
import com.barter.service.InstructorService;

@RestController
public class InstructorController {
	
	@Autowired
	private InstructorService instructorService;

	@RequestMapping(path="/getInstructors", method = RequestMethod.GET)
	public List<Instructor> getInstructors(@RequestParam Long instrumentId){
		System.out.println("Instructor retrieval!");
		return instructorService.getInstructors(instrumentId);
	}
}
