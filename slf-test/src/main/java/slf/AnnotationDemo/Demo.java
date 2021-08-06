package slf.AnnotationDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import slf.A;

/**
 * @author sulingfeng
 * @title: Demo
 * @projectName spring
 * @description: TODO
 * @date 2021/8/6 13:33
 */
public class Demo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
		A a = (A) annotationConfigApplicationContext.getBean("a");
		System.out.println(a);
	}

}
