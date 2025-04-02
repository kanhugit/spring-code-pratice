package in.ashokit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.ashokit.beans.Motor2;

public class MainApp2 {
	public static void main(String[] args) {

		// start IOC Container

		ApplicationContext context=new ClassPathXmlApplicationContext("Beans2.xml");

		Motor2 motor2 = context.getBean(Motor2.class);
		motor2.doWork();
		
		ConfigurableApplicationContext cfgCtxt=(ConfigurableApplicationContext)context;
		
				cfgCtxt.registerShutdownHook();
	}
}
