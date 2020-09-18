package org.springframework.demo.service.impl;

import org.springframework.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
	@Override
	public String userTest() {
		return "test";
	}
}
