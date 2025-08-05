package decom.jlcindia.demo1;

public class Hello implements A {
public void test() {
	System.out.println(p);//inherited
	System.out.println(q);//inherited
	m1();//overridden
	m2();//overridden
	m3();//overridden
	m4();//inherited
	A.m5();
	A.m6();
}
public void m1() {
	System.out.println("hello-m1");
}
public void m2() {
	System.out.println("hello-m2");
}
public void m3() {
	System.out.println("hello-m3");
}

}
