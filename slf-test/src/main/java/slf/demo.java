package slf;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import slfEditor.Customer;

public class demo {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		A a12 = (A)classPathXmlApplicationContext.getBean("myFactoryBean");
		A a13 = (A)classPathXmlApplicationContext.getBean("myFactoryBean");
		FactoryBean factoryBean = (FactoryBean)classPathXmlApplicationContext.getBean("&myFactoryBean");
		System.out.println(a12==a13);
		System.out.println(factoryBean);
		//A a = (A) classPathXmlApplicationContext.getBean(A.class);
		//B b = classPathXmlApplicationContext.getBean(B.class);
		/*		MyFactoryBean myFactoryBean = (MyFactoryBean) classPathXmlApplicationContext.getBean(MyFactoryBean.class);
		A a = (A) classPathXmlApplicationContext.getBean("myFactoryBean");
		System.out.println(a);
		A a2 = (A) classPathXmlApplicationContext.getBean("myFactoryBean");
		System.out.println(a2);*/

		//System.out.println(myFactoryBean.getObject());

		/*Customer c = classPathXmlApplicationContext.getBean(Customer.class);
		System.out.println(c);*/

		//System.out.println(a.getB() == b);
		System.out.println(666);


	}

}
