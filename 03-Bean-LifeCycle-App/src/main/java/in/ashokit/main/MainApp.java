package in.ashokit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.ashokit.beans.Motor;

public class MainApp {
	public static void main(String[] args) {

		// start IOC Container

		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");

		Motor motor = context.getBean(Motor.class);
		motor.doWork();
		
		ConfigurableApplicationContext cfgCtxt=(ConfigurableApplicationContext)context;
		
				cfgCtxt.registerShutdownHook();
	}
}
