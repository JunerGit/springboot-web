package vip.juner.springboot.web.system.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @since
 * @author Juner
 * @version 2020-4-30 09:15:40
 */
@EnableAutoConfiguration
@RestController
public class BaseController {

	@RequestMapping("/index")
	public String index() {
		return "index";
	}
}
