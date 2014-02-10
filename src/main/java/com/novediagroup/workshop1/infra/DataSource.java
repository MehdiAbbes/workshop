package com.novediagroup.workshop1.infra;

public class DataSource {
	
	private String url;
	
	private int port;
	
	private String username;
	
	private String password;
	
	public DataSource() {
		super();
	}

	public DataSource(String url) {
		this.url = url;
	}

	public DataSource(String url, int port, String username, String password) {
		super();
		this.url = url;
		this.port = port;
		this.username = username;
		this.password = password;
	}

	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
