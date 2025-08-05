package decom.jlcindia.demo4;

public interface A {
  static void m1() {
	  System.out.println("A- static  method m1");
  }
  default void m2() {
	  System.out.println("A- static  method m1");
  }
  public static void main(String args[]) {
	  System.out.println("main method");
	  m1();
	  //m2();
  }
}
