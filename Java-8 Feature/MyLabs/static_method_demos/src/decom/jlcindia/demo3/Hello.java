package decom.jlcindia.demo3;

public class Hello implements A ,B{
public void test() {
	m1();
	A.m1();
	B.m1();
}
static void m1() {
	System.out.println("Hello-m1()");
}
static void show() {
	System.out.println("hello show()");
}

}
