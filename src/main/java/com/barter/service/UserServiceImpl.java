package com.barter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.barter.domain.User;
import com.barter.domain.repository.UserRepository;

@Component
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public User getUser() {
		return userRepo.findByUsername(SecurityContextHolder.getContext().getAuthentication().getName());
	}

	@Override
	public User saveOrUpdate(User user) {
		return userRepo.save(user);
	}

}
