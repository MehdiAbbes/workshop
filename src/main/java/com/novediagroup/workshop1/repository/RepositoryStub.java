package com.novediagroup.workshop1.repository;

import java.util.ArrayList;
import java.util.List;

import com.novediagroup.workshop1.infra.DataSource;
import com.novediagroup.workshop1.model.User;

public class RepositoryStub implements Repository {
	
	private DataSource dataSource = new DataSource();
	
	public RepositoryStub(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<User> findAll() {
		return new ArrayList<User>();
	}

	@Override
	public void save(User user) {
		//doing smth with the user arg

	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
	

}
