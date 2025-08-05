package decom.jlcindia.demo4;

 interface B1 extends A{
//	 default void m1() {
//		 System.out.println("B_m1()");
//	 }
	 default void m2() {
		 System.out.println("B_m2()");
		 m1();
	 }
	 
}