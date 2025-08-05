package decom.jlcindia.demo2;

public class Hello implements A,B {
public void show() {
System.out.println("hello show()");
} 
public void test() {
	System.out.println("test method()");
	show();
	A.super.show();
	B.super.show();
}
}
