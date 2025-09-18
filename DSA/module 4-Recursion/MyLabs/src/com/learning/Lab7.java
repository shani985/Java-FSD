package com.learning;

// non tail recursion
//problem 1: print the number 1 to n
public class Lab7 {
	static void print(int n) {
		// 1 base condition
		if(n==0)
		return ;
		// recursive call
				print(n-1);
		// your logic
		System.out.println(n);
		
		
		
		
	}
	public static void main(String[] args) {
	print(10);
	}

}