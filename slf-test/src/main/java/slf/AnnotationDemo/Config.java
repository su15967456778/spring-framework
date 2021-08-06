package slf.AnnotationDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import slf.A;
import slf.B;

/**
 * @author sulingfeng
 * @title: Config
 * @projectName spring
 * @description: TODO
 * @date 2021/8/6 13:32
 */
@Configuration
public class Config {

	@Bean
	public A a() {
		return new A();
	}

	@Bean
	public B b() {
		return new B();
	}


}
