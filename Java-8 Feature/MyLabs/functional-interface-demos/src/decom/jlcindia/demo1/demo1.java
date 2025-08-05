package decom.jlcindia.demo1;

public class demo1 {

	public static void main(String[] args) {
		Hello hello1=(a,b)->{
			System.out.println("lambda function start !!");
			try {
			int result =a/b;
			System.out.println(result);
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			System.out.println("lambda function end !!");
			
		};
		hello1.test(78,0);
	}
 
} 
