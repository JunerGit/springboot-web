package vip.juner.springboot.web.system.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import vip.juner.springboot.web.system.controller.base.Out;
import vip.juner.springboot.web.system.model.Users;
import vip.juner.springboot.web.system.service.IUsersService;

@EnableAutoConfiguration
@Controller
public class TestController {

	//@Autowired
	//IJDBCService ;
	
	@Resource
	IUsersService userService;
	
	@ResponseBody
	@RequestMapping("/")
	public String i() {
		return userService.findByUser("juner").toString();
	}
	
	@ResponseBody
	@RequestMapping("/index")
	public String index() {
		return"Please Enter String for User'Name!";
	}
	
	@ResponseBody
	@RequestMapping("/index/{name}")
	public String index(@PathVariable String name) {
		Out.out(name);
		List<Users> result = userService.findByUser(name);
		Out.out(result.toString());
		return "success";
	}

}
