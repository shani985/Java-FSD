package com.learning;


public class Lab4 {
	static void show(int n) {
	//1 base case
		if(n==0)
			return ;
	
	//2 recursive call
		show(n-1);
		// 3 task
				System.out.println("hello guys");
		
		
	}
	public static void main(String[] args) {
	show(5);
	}

}
