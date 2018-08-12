package com.barter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.barter.domain.Student;
import com.barter.domain.repository.UserRepository;

@Component
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public Student saveStudent(Student student) {
		return userRepository.save(student);
	}

}
