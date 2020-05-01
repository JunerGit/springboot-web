package vip.juner.springboot.web.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import vip.juner.springboot.web.system.mapper.JDBCMapper;
import vip.juner.springboot.web.system.model.JDBC;
import vip.juner.springboot.web.system.service.IJDBCService;

@Service("jdbcService")
public class JDBCImpl implements IJDBCService  {

		@Autowired
		private JdbcTemplate jdbcTemplate;
		
		@Autowired
		private JDBCMapper jdbcMapper;
		
		@Override
		public JDBC findByName(String name) {
			//List<JDBC> list = jdbcTemplate.query("select uid, name, age from users where name = (?);", name);
			return jdbcMapper.findByName(name);
		}

		@Override
		public int insert(String name, Integer age) {
			System.out.println("name="+name+", age="+age);
			return jdbcTemplate.update("insert into users values(null,?,?);", name, age);
		}

}
