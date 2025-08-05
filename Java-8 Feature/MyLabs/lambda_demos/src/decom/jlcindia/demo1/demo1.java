package decom.jlcindia.demo1;

public class demo1 {

	public static void main(String[] args) {
		Hello hello1=()->{
			System.out.println("welcome to lambda world !!");
		};
		hello1.m1();
		Hello.m2();
		hello1.display();
		Hello hello2 =()->{System.out.println("welcome to the lambda ");
		};
hello2.display();
hello2.m1();
Hello.m2();
	}
 
} 
