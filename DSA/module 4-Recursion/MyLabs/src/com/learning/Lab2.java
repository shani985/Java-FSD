package com.learning;

class hii{
	public  static void show() {
		System.out.println("show - begin");
		show();
		System.out.println("show -end");
	}
	
}
public class Lab2 {

	public static void main(String[] args) {
	hii.show();
	}

}
