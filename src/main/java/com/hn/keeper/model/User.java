package com.hn.keeper.model;

import com.hn.keeper.starter.model.Keeper;

public class User implements Keeper {

	private String firstName;

	private String lastName;

	public User(String firstName, String lastName) {
		super();
		this.firstName = lastName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}