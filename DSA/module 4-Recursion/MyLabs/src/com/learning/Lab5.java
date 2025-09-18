package com.learning;


public class Lab5 {
	static void show(int n) {
		// 1 task
			System.out.println(" welcome to shani");	
	//2 base case
		if(n==1)
			return ;
	
	//3 recursive call
		show(n-1);
		
		
		
	}
	public static void main(String[] args) {
	show(5);
	}

}
