package slf.method;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import slf.A;
import slf.postProcessorDemo.BeforeInstance;

public class Demo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext
				= new ClassPathXmlApplicationContext("applicationContext3.xml");
		A a = (A)classPathXmlApplicationContext.getBean("a");
		A a2 = (A)classPathXmlApplicationContext.getBean("a");
		System.out.println(a);
		System.out.println(a2);
	}
}
