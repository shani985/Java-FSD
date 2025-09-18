package com.learning;
//problem 2: find the factorial of given number 
public class Lab8 {
	static int fact(int n) {
		// 1 base condition
		if(n==1||n==0)
		return 1;
		else
		return n* fact(n-1);	
		
	}
	public static void main(String[] args) {
System.out.println(fact(5));
	}

}