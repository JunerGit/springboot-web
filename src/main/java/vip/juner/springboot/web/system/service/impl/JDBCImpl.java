package vip.juner.springboot.web.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import vip.juner.springboot.web.system.service.IJDBCService;

@Service
public class JDBCImpl implements IJDBCService  {

		@Autowired
		private JdbcTemplate jdbcTemplate;
		
		public void createUser(String name, Integer age) {
			System.out.println("name="+name+", age="+age);
			jdbcTemplate.update("insert into users values(null,?,?);", name, age);
		}

}
