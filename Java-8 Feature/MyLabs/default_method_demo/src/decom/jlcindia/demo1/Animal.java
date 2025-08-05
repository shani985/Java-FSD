package decom.jlcindia.demo1;

public interface Animal {
void eating();
public abstract  void sleepng();
default void running() {
	System.out.println("Animal is running ");	
}
default void thinking() {
	System.out.println("Animal is thinking  ");
	
}
}
