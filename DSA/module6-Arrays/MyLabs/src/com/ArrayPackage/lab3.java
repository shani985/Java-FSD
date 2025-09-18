package com.ArrayPackage;
import java.util.ArrayList;
import java.util.List;

public class lab3 {

	public static void main(String[] args) {
		//create array list
		List<Integer> mylist=new ArrayList<Integer>();
		mylist.add(10);
		mylist.add(11);
		mylist.add(12);
		mylist.add(13);
		mylist.add(14);
	
		for(int x:mylist) {
			System.out.print("\t"+x);
		}
	}	

}
