package com.barter.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.barter.domain.User;

public interface UserRepository extends CrudRepository<User, String> {

	User findByUsername(String username);

}
