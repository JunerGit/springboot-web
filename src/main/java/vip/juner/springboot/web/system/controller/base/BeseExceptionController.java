package vip.juner.springboot.web.system.controller.base;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>全局异常拦截器</p>
 * @author Administrator
 *
 */
@ControllerAdvice
public class BeseExceptionController {

	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public Map<String, Object>exceptionHandler() {
		Map<String, Object>map = new HashMap<String, Object>();
		map.put("errorCode", "101");
		map.put("errorMsg", "系統错误!");
		return map;
	}

}
