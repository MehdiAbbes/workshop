package com.novediagroup.workshop1.service;

import java.util.List;

import com.novediagroup.workshop1.model.User;
import com.novediagroup.workshop1.repository.Repository;
import com.novediagroup.workshop1.repository.RepositoryStub;

public class ServiceImpl implements Service {
	
	private Repository repository;
	

	public ServiceImpl(Repository repository) {
		this.repository = new RepositoryStub();
	}

	@Override
	public List<User> getAllUsers() {
		return repository.findAll();
	}

	@Override
	public void saveUser(User user) {
		repository.save(user);
	}

	
	

}
