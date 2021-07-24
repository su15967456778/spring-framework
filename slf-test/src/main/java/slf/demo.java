package slf;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {

	public static void main(String[] args) {
 		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		A a = (A) classPathXmlApplicationContext.getBean(A.class);
		System.out.println(a.getB());
		B b = classPathXmlApplicationContext.getBean(B.class);

		System.out.println(a.getB() == b);
		System.out.println(666);
	}

}
