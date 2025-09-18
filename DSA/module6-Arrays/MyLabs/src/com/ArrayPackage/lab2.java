package com.ArrayPackage;
import java.util.ArrayList;
import java.util.List;

public class lab2 {

	public static void main(String[] args) {
		//create array list
		List<Integer> mylist=new ArrayList<Integer>();
		mylist.add(10);
		mylist.add(11);
		mylist.add(12);
		mylist.add(13);
		mylist.add(14);
		mylist.add(15);
		mylist.add(16);
		mylist.add(17);
		mylist.add(20);
		mylist.add(30);
		
		for(int x:mylist) {
			System.out.print("\t"+x);
		}
	}	

}
