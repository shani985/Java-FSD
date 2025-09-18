package com.learning;
//problem 3: print the number 1 to n
public class Lab9 {
	static int sum(int n) {
		// 1 base condition
		if(n==1)
		return 1;
		else
		return n+ sum(n-1);
		
	}
	public static void main(String[] args) {
System.out.println(sum(5));
	}

}