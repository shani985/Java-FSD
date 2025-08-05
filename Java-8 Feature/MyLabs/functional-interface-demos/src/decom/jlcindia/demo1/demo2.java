package decom.jlcindia.demo1;

public class demo2 {

	public static void main(String[] args) {
		System.out.println("main is start");
		Hello hello1=(a,b)->{
			System.out.println("lambda function start !!");
			
			int result =a/b;
			System.out.println(result);
			System.out.println("lambda function end !!");
			
		};
//		hello1.test(45, 0);
		try {
		hello1.test(78,0);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("main Ends");
	}

 
} 
