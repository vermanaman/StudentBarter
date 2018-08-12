package com.barter.service;

import com.barter.domain.User;

public interface UserService {

	User saveOrUpdate(User user);

	User getUser();

}
