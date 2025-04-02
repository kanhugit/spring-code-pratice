package in.ashokit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.springdemo.bean.Car;

public class Main {
	public static void main(String[] args) {
		//start IOC
		
		System.out.println("============ApllicationContext Started==============");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		
				Car	bean=context.getBean(Car.class);
				bean.drive();
	}
}

