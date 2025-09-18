package com.learning;
//problem 4: find the sum of digit 
public class Lab10 {
	static int digitSum(int n) {
		// 1 base condition
		if(n==1||n==0)
		return 1;
		else
		return n%10+ digitSum(n/10);
		
	}
	public static void main(String[] args) {
System.out.println(digitSum(123));
	}

}