package com.amit;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	Integer id;
	String username;
	String password;
	public User(Integer Id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public User() {
		super();
	}
	
	
	
}
