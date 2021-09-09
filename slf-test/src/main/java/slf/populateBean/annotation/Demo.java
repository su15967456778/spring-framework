package slf.populateBean.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author sulingfeng
 * @title: Demo
 * @projectName spring
 * @description: TODO
 * @date 2021/9/9 15:05
 */
public class Demo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		PersonService bean = ac.getBean(PersonService.class);
		System.out.println(bean);
	}
}
