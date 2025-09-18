package com.learning;
//problem 4: print the fibonocii series
public class Lab12 {
	static int fibo(int n) {
		// 1 base condition
		if(n==0)
			return 0;
		if (n==1)
			return 1;
		else
			return fibo(n-1)+ fibo(n-2);
		
	}
	public static void main(String[] args) {   
		for(int i=0;i<=9;i++)
		System.out.println(fibo(i));
	}

}