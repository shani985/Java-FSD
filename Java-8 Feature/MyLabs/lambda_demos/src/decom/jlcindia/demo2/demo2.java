package decom.jlcindia.demo2;

public class demo2 {

	public static void main(String[] args) {
		Hello hello1=(name)->{
			System.out.println("Hello "+name+" welcome to lambda world !!");
		};
		hello1.display("shani");
		
		Hello hello2 =(name)->{System.out.println("hello "+name+ " welcome to the lambda ");
		};

hello2.display("Mourya");
Hello hello3 =(name)->{System.out.println("hello "+name+ " welcome to the lambda ");
};

hello3.display("Rajat");
	
 
} 
}
