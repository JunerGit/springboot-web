package vip.juner.springboot.web.system.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p></p>
 * <p></p>
 * <p> <b>SpringBootApplication 类属性</b> </p>
 * <pre>  @SpringBootApplication(scanBasePackages="vip.juner.springboot") </pre>
 * <pre>  { exclude, excludeName, scanBasePackages, scanBasePackageClasses, proxyBeanMethods } </pre>
 * <p> <b>scanBasePackages：</b>指定 Spring Boot 扫描路径，默认为 Spring Boot当前路径及子路径</p>
 * <p> <b>SpringBoot模版引擎：</b> </p>
 * <pre> { Thymeleaf, FreeMarker, Velocity, Groovy, Mustache } </pre>
 * <p> <b>@ComponentScan 类属性</b> </p>
 * <p> 扫描包范围。指定需要扫描的所有范围，允许多个路径。 </p>
 * <pre>   @ComponentScan(basePackages="vip.juner.springboot.web.system") } </pre>
 * <p> 也可以如下写法：</p>
 * <pre>   @SpringBootApplication(scanBasePackages="vip.juner.springboot") </pre>
 * <p> <b>@MapperScan 类属性</b>  </p>
 * <p>必须指向映射类的具体包名。如果找不到bean，则可以直接指定包名。</p>
 * <pre>   @MapperScan(value = "vip.juner.springboot.web.system.mapper")</pre>
 * @author Juner
 *
 */
@SpringBootApplication(scanBasePackages="vip.juner.springboot")
@MapperScan(value = "vip.juner.springboot.web.system.mapper")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class,args);
	}
	
}
