package vip.juner.springboot.web.system.service;

import java.util.List;

import vip.juner.springboot.web.system.model.Users;

public interface IUsersService {

	List<Users> findByUser(String name);
	
//	int insert(String name, Integer age);
	
}
