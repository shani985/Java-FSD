package com.learning;
//problem 4: print the fibonocii series term
public class Lab11 {
	static int fibo(int n) {
		// 1 base condition
		if (n<=1)
			return n;
		else
			return fibo(n-1)+ fibo(n-2);
		
	}
	public static void main(String[] args) {
		System.out.println(fibo(9));
	}

}