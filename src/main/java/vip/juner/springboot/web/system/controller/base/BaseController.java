package vip.juner.springboot.web.system.controller.base;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p></p>
 * <br><p><b>第一种启动方式：</b></p>
 * <p><b>@ComponentScan(basePackages = "com")</b>：<em>控制器扫包范围</em></p>
 * <p><b>@EnableAutoConfiguration</b>：<em>让 Spring Boot 根据应用所声明的依赖来对 Spring 框架进行自动配置</em></p>
 * 
 * <br><p><b>在：</b></p>
 * <p><b>@Controller</b>：<em></em></p>
 * <p><b>@RestController</b>：<em>修饰该 Controller 所有的方法返回 JSON 格式,直接可以编写 Restful 接口</em></p>
 * <p><b></b>：<em></em></p>
 * <p><b></b>：<em></em></p>
 * <p><b></b>：<em></em></p>
 * <br><p><b>全局捕获异常：</b></p>
 * <p><b>@ExceptionHandler</b>：<em>表示拦截异常</em></p>
 * <p><b>@ControllerAdvice</b>：<em>是 controller 的一个辅助类，最常用的就是作为全局异常处理的切面类</em></p>
 * <p><b>@ControllerAdvice</b>：<em>可以指定扫描范围</em></p>
 * <p><b>@ControllerAdvice</b>：<em>约定了几种可行的返回值，如果是直接返回 model 类的话，需要使用 @ResponseBody 进行 json 转换</em></p>
 * <br><p><b>返回类型：</b></p>
 * <p><b>String</b>：<em></em></p>
 * <p><b>ModelAndView</b>：<em></em></p>
 * <p><b>Model + @ResponseBody</b>：<em></em></p>
 * @since
 * @author Juner
 * @version 2020-4-30 09:15:40
 */
@EnableAutoConfiguration
@Controller
public class BaseController {
/**
 * @ComponentScan(basePackages = "com.itmayiedu")
@MapperScan(basePackages = "com.itmayiedu.mapper")
@SpringBootApplication

 * @return
 */
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	/**
	 * <p><b>404 找不到</b></p>
	 * <p>由于404请求，在templates目录中不存在，因此，会转入 public/error 目录中的404</p>
	 * @return
	 */
	@RequestMapping("/404")
	public String notFound404() {
		return "404";
	}
	
	/**
	 * <p><b>500 程序故障</b></p>
	 * <p></p>
	 * @return
	 */
	@RequestMapping("/500")
	public String serverError500() {
		return "500";
	}
}
