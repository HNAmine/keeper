package com.hn.keeper.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hn.keeper.model.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public User getUser(Long user) {
		List<User> cars = new ArrayList<>();
		cars.add(new User("login 1", "password 1", new Date()));
		cars.add(new User("login 2", "password 2"));
		return new User("login 2", "password 2");
//		return cars;
	}
}
