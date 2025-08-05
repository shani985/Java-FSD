package decom.jlcindia.demo4;

public class demo4 {

	public static void main(String[] args) {
		Hello hello1=(a,b)->{
			int sum =a+b;
			return sum;
		};
	int sum1=	hello1.test(34,76);
	System.out.println(sum1);
	Hello hello2=(a,b)->{
	return a+b;
	};
		int sum2=hello2.test(65,87);
		System.out.println(sum2);
		Hello hello3=(a,b)->a+b;
		System.out.println(hello3.test(12,64));
	
		}}
		
	
 


