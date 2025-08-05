package decom.jlcindia.demo3;

public class demo3 {

	public static void main(String[] args) {
		Hello hello1=(a,b)->{
			int sum =a+b;
			System.out.println("sum "+sum);
		};
		hello1.test(34,76);
		
		Hello hello2=(a,b)->System.out.println("sum "+(a+b));
		hello2.test(36, 987);
		Hello hello3=(a,b)->System.out.println("sub "+(a-b));
		hello3.test(396, 87);
		Hello hello4=(a,b)->System.out.println("mul "+(a*b));
		hello4.test(36, 97);
		Hello hello5=(a,b)->System.out.println("divide "+(a/b));
		hello5.test(9897, 987);
		Hello hello6=(a,b)->System.out.println("remainder "+(a%b));
		hello6.test(987, 987);

		}}
		
	
 


