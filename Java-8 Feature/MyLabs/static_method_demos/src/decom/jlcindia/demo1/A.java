package decom.jlcindia.demo1;

public interface A {
int p=182;
  public final static int q=122;
  void m1();
  public abstract void m2();
  default void m3() {
	  System.out.println(" default method m3");
  }
  default void m4() {
	  System.out.println(" default method m4");
  }
  static  void m5 () {
	  System.out.println(" static  method m5");
  }
  static void m6() {
	  System.out.println(" static  method m6");
  }
}
