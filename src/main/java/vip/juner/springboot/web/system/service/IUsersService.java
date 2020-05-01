package vip.juner.springboot.web.system.service;

import vip.juner.springboot.web.system.model.Users;

public interface IUsersService {

	Users findByName(String name);
	
//	int insert(String name, Integer age);
	
}
