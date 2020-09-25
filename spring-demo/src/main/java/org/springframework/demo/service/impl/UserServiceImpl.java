package org.springframework.demo.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
	Log log = LogFactory.getLog(UserServiceImpl.class);

	@Override
	public String userTest() {
		log.info("【请求 URL】");
		return "test";
	}
}
