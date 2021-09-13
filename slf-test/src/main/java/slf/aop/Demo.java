package slf.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContextAop.xml");

		MyCaculate mycaculate =  (MyCaculate) classPathXmlApplicationContext.getBean("myCaculate");
		System.out.println(mycaculate.add(1,2));

	}

}
