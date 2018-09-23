package com.hn.keeper.model;

import com.hn.keeper.starter.core.JsonField;
import com.hn.keeper.starter.model.Keeper;

public class User implements Keeper {

	@JsonField("custom_login")
	private String login;

	@JsonField
	private String password;

	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

}