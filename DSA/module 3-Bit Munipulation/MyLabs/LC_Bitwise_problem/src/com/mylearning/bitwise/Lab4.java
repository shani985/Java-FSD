package com.mylearning.bitwise;
//problem190: REVERSE BIT
public class Lab4 {
public static int reverseBit(int num) {
	int rev=0;
	for(int i=1;i<=32;i++)
	{
		rev=rev<<1;
	if((num&1)>0){
		rev=rev+1;
	}
	num=num>>1;
	}
	
	return rev;
}
	public static void main(String[] args) {
		int n=0B1111;
		int x=reverseBit(n);
		System.out.println("reverse  "+x);
}
}
//time complexity O(1)