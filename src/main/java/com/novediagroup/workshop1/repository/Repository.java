package com.novediagroup.workshop1.repository;

import java.util.List;

import com.novediagroup.workshop1.model.User;

public interface Repository {
	
	List<User> findAll();
	
	void save(User user);

}
