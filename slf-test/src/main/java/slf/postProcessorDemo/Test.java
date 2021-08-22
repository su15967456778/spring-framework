package slf.postProcessorDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext
				= new ClassPathXmlApplicationContext("applicationContext2.xml");
		BeforeInstance beforeInstance = (BeforeInstance) classPathXmlApplicationContext.getBean("beforeInstance");
		beforeInstance.doSomeThing();

	}

}
