package vip.juner.springboot.web.system.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p></p>
 * <p></p>
 * <p> SpringBootApplication 类属性 </p>
 * <pre>  { exclude, excludeName, scanBasePackages, scanBasePackageClasses, proxyBeanMethods} </pre>
 * <p> <b>scanBasePackages：</b>指定 Spring Boot 扫描路径，默认为 Spring Boot当前路径及子路径</p>
 * <p> <b>SpringBoot模版引擎：</b> </p>
 * <pre> { Thymeleaf, FreeMarker, Velocity, Groovy, Mustache } </pre>
 * @author Juner
 *
 */
@SpringBootApplication(scanBasePackages="vip.juner.springboot")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class,args);
	}
	
}
