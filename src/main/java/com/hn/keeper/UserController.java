package com.hn.keeper;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String getUser(Long user) {
		return "Hello word";
	}
}
