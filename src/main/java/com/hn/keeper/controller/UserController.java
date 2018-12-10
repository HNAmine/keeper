package com.hn.keeper.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hn.keeper.model.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<User> getUsers(Long user) {
		List<User> users = new ArrayList<>();
		users.add(new User("Amine", "HANANE"));
		users.add(new User("Ayoub", "HANANE"));
		return users;
	}

	@RequestMapping(value = "/id", method = RequestMethod.GET)
	public User getUser(Long user) {
		return new User("Amine", "HANANE");
	}
}
