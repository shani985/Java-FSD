package decom.jlcindia.demo1;

import java.util.function.Predicate;
import java.util.*;// <-- This is required

public class demo3 {
    public static void main(String[] args) {
        Predicate<Integer> predicate1 = (num) -> {
        	System.out.println(num);
        	 return num % 2 == 0;
        };
        

//        System.out.println("Is 10 even? " + predicate1.test(10)); 
//        System.out.println("Is 19 even? " + predicate1.test(19)); 
//    
        boolean mybool=predicate1.test(19);
        System.out.println(mybool);
        mybool=predicate1.test(10);
        System.out.println(mybool);
        Predicate<Integer> predicate2 = (num) -> num % 2 != 0;
        
     mybool=predicate2.test(10);
    System.out.println(mybool);
    mybool=predicate2.test(21);
    System.out.println(mybool);
    List<Integer>mylist=new ArrayList<>();
    mylist.add(16);
    mylist.add(21);
    mylist.add(43);
    mylist.add(66);
    mylist.add(41);
    mylist.add(36);
    mylist.add(49);
    for(int x:mylist) {
    	if(x%2!=0) {
    		mylist.remove(x); 
    	}else {
    		System.out.println(x);
    	}
    	
    }
    
}
}





