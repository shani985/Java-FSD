package com.mylearning.bitwise;
//problem136 : SINGLE NUMBER

public class Lab3 {

public static int singleNumber(int []num) {
	int  result=0;
	for(int i=0;i<num.length;i++)
	{
		result=result^num[i];
	}
	return result;
}

	public static void main(String[] args) {
     int n[]= {2,4,5,3,6,2,4,5,6,3};
		System.out.println(singleNumber(n));
}
}
//time complexity O(1)