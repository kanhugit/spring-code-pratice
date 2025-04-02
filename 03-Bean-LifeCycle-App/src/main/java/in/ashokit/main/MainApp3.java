package in.ashokit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.ashokit.beans.Motor3;

public class MainApp3 {
	public static void main(String[] args) {

		// start IOC Container

		ApplicationContext context=new ClassPathXmlApplicationContext("Beans3.xml");

		Motor3 motor3 = context.getBean(Motor3.class);
		motor3.doWork();
		
		ConfigurableApplicationContext cfgCtxt=(ConfigurableApplicationContext)context;
		
				cfgCtxt.registerShutdownHook();
	}
}
