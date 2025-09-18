package com.mylearning.bitwise;
//problem231 : power of 2 or no
public class Lab2 {
public static int powerOfTwo(int num) {
int count=0;
while(num!=0)
{
	count ++;
	num=num&num-1;
}
return count; 
}



	public static void main(String[] args) {
		int n=512;
		if(powerOfTwo(n)==1) {
			System.out.println("power of two");
		}
		else {
			System.out.println(" not a power of two");
		}
	
}
}
//time complexity O(1)