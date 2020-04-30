package vip.juner.springboot.web.system.controller;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import vip.juner.springboot.web.system.controller.base.Out;
import vip.juner.springboot.web.system.model.JDBC;
import vip.juner.springboot.web.system.service.IJDBCService;

@EnableAutoConfiguration
@Controller
public class TestController {

	//@Autowired
	//IJDBCService ;
	
	@Resource(name="jdbcService")
	IJDBCService jdbcService;
	
	@ResponseBody
	@RequestMapping("/index/{name}")
	public String index(@PathVariable String name) {
		JDBC jdbc = jdbcService.findByName(name);
		Out.out(jdbc.toString());
		return"success";
	}

}
