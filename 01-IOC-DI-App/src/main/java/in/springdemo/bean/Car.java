package in.springdemo.bean;

public class Car {
	private IEngine eng;
	
	//setter injection
	public void setEng(IEngine eng) {
		System.out.println("SetEng() method called..");
		this.eng=eng;
	}
	
	public void drive() {
		int status=eng.start();
		if(status >=1) {
			System.out.println("Journey Started..");
		}else {
			System.out.println("Engine In Troubled..");
		}
	}
	
}
