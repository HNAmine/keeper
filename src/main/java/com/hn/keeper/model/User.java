package com.hn.keeper.model;

import java.util.Date;

import com.hn.keeper.starter.model.Keeper;

public class User implements Keeper {

	private String login;

	private String password;

	private Date createdAt;

	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public User(String login, String password, Date createdAt) {
		super();
		this.login = login;
		this.password = password;
		this.createdAt = createdAt;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}