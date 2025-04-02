package in.ashokit.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
//Bean Life cycle using annotation approach
//Annotation are not working in spring by default .We have to enable the annotation manually 
public class Motor3 {
	public Motor3() {
		System.out.println("Motor :: Constructor");
	}
	@PostConstruct
	public void m1() throws Exception{
		System.out.println("Motor Started...");
	}
	public void doWork() {
		System.out.println("Motor Pulling Water..");
	}
	@PreDestroy
	public void m2() throws Exception{
		System.out.println("Motor Stopped");
	}
}
//op--Motor :: Constructor             
//	Motor Pulling Water..  
