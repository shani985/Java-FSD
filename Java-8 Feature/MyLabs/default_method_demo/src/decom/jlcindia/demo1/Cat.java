package decom.jlcindia.demo1;

public class Cat  implements Animal{

	@Override
	public void eating() {
		System.out.println("Cat is Eating");
		
		
	}

	@Override
	public void sleepng() {
		System.out.println("Cat is Sleeping");
		
	}
	public void thinking() {
		System.out.println("Cat is Thinking");
	}

}
