package com.mylearning.bitwise;
//problem191 : count the set bit
//Brain Kerninghan's Algorithem
//visit only set bit instead of visiting all the bits
public class Lab1A {
public static int hammingWieght(int num) {
	int count=0;
	while(num!=0) {
		count++;
		num=num&num-1;
	}
	return count;
}
	public static void main(String[] args) {
int n= 65;
int x=hammingWieght(n);
System.out.println(x);

}
}
//time complexityO(1)