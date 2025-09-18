package com.learning;

//problem 1: print the number n to 1
// tail recursion
public class Lab6 {
	static void print(int n) {
		// 1 base condition
		if(n==0)
			return ;
		// your logic
		System.out.println(n);
		// recursive call
		print(n-1);
		
		
		
	}
	public static void main(String[] args) {
	print(10);
	}

}
