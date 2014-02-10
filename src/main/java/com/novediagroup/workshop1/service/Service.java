package com.novediagroup.workshop1.service;

import java.util.List;

import com.novediagroup.workshop1.model.User;

public interface Service {
	
	List<User> getAllUsers();
	
	void saveUser(User user);

}
