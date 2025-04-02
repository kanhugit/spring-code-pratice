package in.ashokit.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//Bean Life Cycle Using Programmatic  approach
public class Motor2 implements InitializingBean, DisposableBean {
	public Motor2() {
		System.out.println("Motor :: Constructor");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Motor Started..");
	}

	public void doWork() {
		System.out.println("Motor pulling water..");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Motor stopped...");

	}
}
