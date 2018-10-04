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
	public List<User> getUser(Long user) {
		List<User> cars = new ArrayList<>();
		cars.add(new User("Amine", "HANANE"));
		cars.add(new User("Ayoub", "HANANE"));
		return cars;
	}
}
