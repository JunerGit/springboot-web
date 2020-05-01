package vip.juner.springboot.web.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import vip.juner.springboot.web.system.mapper.UsersMapper;
import vip.juner.springboot.web.system.model.Users;
import vip.juner.springboot.web.system.service.IUsersService;

@Service
public class UsersImpl implements IUsersService  {

//		@Autowired
//		private JdbcTemplate jdbcTemplate;
		
		@Autowired
		private UsersMapper jdbcMapper;
		
		@Override
		public Users findByName(String name) {
			//List<JDBC> list = jdbcTemplate.query("select uid, name, age from users where name = (?);", name);
			return jdbcMapper.findByUser(name);
		}

//		@Override
//		public int insert(String name, Integer age) {
//			System.out.println("name="+name+", age="+age);
//			return jdbcTemplate.update("insert into users values(null,?,?);", name, age);
//		}

}
