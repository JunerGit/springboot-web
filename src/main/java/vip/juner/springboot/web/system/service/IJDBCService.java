package vip.juner.springboot.web.system.service;

import vip.juner.springboot.web.system.model.JDBC;

public interface IJDBCService {

	JDBC findByName(String name);
	
	int insert(String name, Integer age);
	
}
