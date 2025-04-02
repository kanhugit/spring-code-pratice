package in.springdemo.bean;

public class DieselEngine implements IEngine {
	public DieselEngine() {
		System.out.println("DieselEngine :: Constructor");
	}

	@Override
	public int start() {
		System.out.println("DieselEngine Started..");
		return 1;
	}
	
}
