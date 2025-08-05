package decom.jlcindia.demo1;

public class Dog  implements Animal{

	@Override
	public void eating() {
		System.out.println("Dog is Eating");		
	}
	
	@Override
	public void sleepng() {
		System.out.println("Dog is Sleeping");
		
	}
	public void running() {
		System.out.println("Dog is running");
	}

	

}
