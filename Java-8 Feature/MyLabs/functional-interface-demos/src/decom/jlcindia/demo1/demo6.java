package decom.jlcindia.demo1;

import java.util.function.Predicate;
import java.util.*;// <-- This is required

public class demo6 {
    public static void main(String[] args) {
        Predicate <String>predicate1=Predicate.isEqual("Hello Guys");
        boolean mybool=predicate1.test("hello Guys");
        System.out.println(mybool);
        mybool=predicate1.test("Hai guys");
        System.out.println(mybool);
        
        
        Predicate <Integer>predicate2=Predicate.isEqual(99);
         mybool=predicate2.test(99);
        System.out.println(mybool);
        mybool=predicate2.test(76);
        System.out.println(mybool);
        System.out.println("--------------"); 
        
        Predicate<Integer> predicate3 = (num) -> num % 2 == 0; 
        Predicate<Integer> predicate4 = (num) -> num % 2 != 0; 
         
        mybool = predicate3.test(28); 
        System.out.println(mybool); //T 
        mybool = predicate3.negate().test(28); 
        System.out.println(mybool); //F 
         
        mybool = predicate4.test(19); 
        System.out.println(mybool); //T 
        mybool = predicate4.negate().test(19); 
        System.out.println(mybool); //F 
        
    }
    
}






