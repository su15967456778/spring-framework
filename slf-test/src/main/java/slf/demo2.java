package slf;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import slf.lookUp.Fruit;
import slf.lookUp.FruitPlate;

public class demo2 {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContextLookUp.xml");
		//如果不用这个方法，获取apple永远都是同一个
		FruitPlate fruitPlate1 = (FruitPlate) classPathXmlApplicationContext.getBean("fruitPlate1");
		Fruit fruit = fruitPlate1.getFruit();
		Fruit fruit2 = fruitPlate1.getFruit();

		System.out.println(fruit == fruit2);

		FruitPlate fruitPlate2 = (FruitPlate) classPathXmlApplicationContext.getBean("fruitPlate1");
		fruitPlate2.getFruit();


	}

}
