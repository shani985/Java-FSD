package decom.jlcindia.demo4;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
class Hello{
	public static void show(int x) {
		System.out.println(x);
		
	}
}
public class demo4{
	public static void main(String[] args) {
		List<Integer>mylist=new ArrayList<>();
		mylist.add(25);
		mylist.add(35);
		mylist.add(45);
		mylist.add(55);
		mylist.add(65);
		mylist.add(75);
		Stream<Integer>mystream=mylist.stream();
		mystream.forEach(Hello::show);//S M ref
		System.out.println("--------------------");
	mylist.stream().forEach(Hello::show);
	System.out.println("--------------------");
	mylist.stream().forEach(System.out::println);//I M ref
	System.out.println("--------------------");
	mylist.stream().forEach((x)->System.out.println (x)); //Lambda Exp ref
	
	
	} 
	} 






