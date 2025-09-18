package com.learning;

class Hello{
	public void m1() {
		System.out.println("m1()-begin");
		int a=10;
		System.out.println(a);
		m2();
		System.out.println("m1()-end");
	}
	
	public void m2() {
		System.out.println("m2()-begin");
		int a=10;
		System.out.println(a);
		System.out.println("m2()-end");
	}
	
}
public class Lab1 {

	public static void main(String[] args) {
	System.out.println("main method -begin");
	Hello h= new Hello();
	h.m1();
	System.out.println("main method is end ");

	}

}
