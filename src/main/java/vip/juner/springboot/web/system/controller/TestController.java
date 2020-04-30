package vip.juner.springboot.web.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import vip.juner.springboot.web.system.controller.base.Out;
import vip.juner.springboot.web.system.mapper.JDBCMapper;
import vip.juner.springboot.web.system.model.JDBC;
import vip.juner.springboot.web.system.service.IJDBCService;

@EnableAutoConfiguration
@Controller
public class TestController {

	@Autowired
	IJDBCService jdbcService;
	
	@Autowired
	JDBCMapper jdbcMapper;
	
	@ResponseBody
	@RequestMapping("/index")
	public String index(String name) {
		JDBC jdbc = jdbcMapper.findByName(name);
		Out.out(jdbc.toString());
		return"success";
	}

}
