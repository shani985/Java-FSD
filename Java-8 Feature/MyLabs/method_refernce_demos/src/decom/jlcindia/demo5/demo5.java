package decom.jlcindia.demo5;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream; 
class MyNumber{
	public static boolean isEven(int number) {
		if(number%2==0) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean isOdd(int number) {
		if(number%2!=0) {
			return true;
		}else {
			return false;
		}
	}
	}

public class demo5 {
	
	
	public static void main(String[] args) {
		List<Integer>mylist=new ArrayList<>();
		mylist.add(50);
		mylist.add(3);
		mylist.add(5);
		mylist.add(5);
		mylist.add(8);
		mylist.add(12);
		mylist.add(4);
		mylist.add(75);

System.out.println("------------------------------");
//mylist.stream()
//.filter(a->a%2==0).forEach(a->System.out.println("Square of even number "+(a*a)));
//System.out.println("--------------------");
//mylist.stream()
//.filter(a->a%2!=0).forEach(a->System.out.println("quep of Odd  number "+(a*a*a)));
	
mylist.stream()
.filter(a->a%2==0)
.map(a->a*a).forEach(a->System.out.println(a));
System.out.println("--------------------");
mylist.stream()
.filter(a->a%2!=0).forEach(a->System.out.println(a));
	} 
			

	} 
