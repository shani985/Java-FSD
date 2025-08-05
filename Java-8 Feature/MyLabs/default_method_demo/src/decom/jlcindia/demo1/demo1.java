package decom.jlcindia.demo1;

public class demo1 {
public static void main(String args[]) {
	Dog r = new Dog();
	r.eating();//Overridden method
	r.sleepng();//Overridden method
	r.running();//Overridden method
	r.thinking();//Inherit method
	
	Cat r1 = new Cat();
	r1.eating();//Overridden method
	r1.sleepng();//Overridden method
	r1.running();//Inherit method
	r1.thinking();//Overridden method
	
}
}
