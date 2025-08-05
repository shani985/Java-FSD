package decom.jlcindia.demo1;
@FunctionalInterface
public interface Hello {
	void display();
	default void m1() {
		System.out.println("Hello defaul()");
		display();
	}
	static void m2() {
		System.out.println(" Hello static () ");
	}

}
