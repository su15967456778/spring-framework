package slf.supplier;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import slf.A;
import slf.postProcessorDemo.BeforeInstance;

/**
 * @author sulingfeng
 * @title: Demo
 * @projectName spring
 * @description: TODO
 * @date 2021/9/7 9:44
 */
public class Demo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext
				= new ClassPathXmlApplicationContext("applicationContext4.xml");
		A a = (A) classPathXmlApplicationContext.getBean("a");
		System.out.println(a);
	}

}
