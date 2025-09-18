package com.learning;


public class Lab3 {
	static void show(int n) {
	//1 base case
		if(n==0)
			return ;
	// 2 task
		System.out.println("hello guys");
	//3 recursive call
		show(n-1);
		
		
	}
	public static void main(String[] args) {
	show(5);
	}

}
