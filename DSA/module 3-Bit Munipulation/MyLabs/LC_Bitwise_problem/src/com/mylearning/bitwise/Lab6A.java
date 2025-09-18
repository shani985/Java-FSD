package com.mylearning.bitwise;
//problem201: bitwise and of number range
public class Lab6A {
public static int rangeBitwiseAnd(int m ,int n)
{
	int count=0;
	while(m!=n) {
		m=m>>1;
		n=n>>1;
		count++;
	}
	return m<<count;
}
	public static void main(String[] args) {
    int result=rangeBitwiseAnd(11,15);
     System.out.println(result);
}
}
//time complexity O(1)