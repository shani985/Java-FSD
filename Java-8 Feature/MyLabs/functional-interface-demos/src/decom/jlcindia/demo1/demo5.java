package decom.jlcindia.demo1;

import java.util.function.Predicate;
import java.util.*;// <-- This is required

public class demo5 {
    public static void main(String[] args) {
        Predicate<Integer> predicate1 = (num) -> {
        	System.out.println(num);
        	 return num % 2 == 0;
        };
    List<Integer>mylist=new ArrayList<>();
    mylist.add(16);
    mylist.add(21);
    mylist.add(43);
    mylist.add(66);
    mylist.add(41);
    mylist.add(36);
    mylist.add(49);
    System.out.println(mylist);
//    mylist.removeIf(predicate1);
    mylist.removeIf((num)->num%2==0);
    System.out.println(mylist);
    }
    
}






