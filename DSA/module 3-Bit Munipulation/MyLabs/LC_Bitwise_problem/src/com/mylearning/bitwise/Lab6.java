package com.mylearning.bitwise;
//problem201: bitwise and of number range
public class Lab6 {
public static int rangeBitwiseAnd(int m ,int n)
{
	int result=m;
	for(int i=m;i<=n;i++) {
	result=result &i;
	}
	return result;
}
	public static void main(String[] args) {
    int result=rangeBitwiseAnd(5,7);
     System.out.println(result);
}
}
//time complexity O(1)