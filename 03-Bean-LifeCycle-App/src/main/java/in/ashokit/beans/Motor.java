package in.ashokit.beans;
//Bean Life Cycle Using XML approach
public class Motor {
	public Motor() {
		System.out.println("Motor :: Constructor");
	}
	public void start() {
		System.out.println("Motor starting...");

	}
	public void doWork() {
		System.out.println("Motor pulling water..");
	}
	public void stop() {
		System.out.println("Motor Stopped..");
	}
}
