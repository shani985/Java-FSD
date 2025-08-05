package decom.jlcindia.demo3;

public class demo3 {
public static void main(String args[]) {
	//not allowed
//A abc=null;
//abc.m1();
//	A h1 = new Hello();
//	h1.m1();
	Hello h1=null;
	h1.show();
	Hello h2= new Hello();
	h2.show();
	A.m1();
	Hello.show();
}

}
