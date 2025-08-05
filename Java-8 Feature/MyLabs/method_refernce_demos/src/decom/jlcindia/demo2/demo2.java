package decom.jlcindia.demo2;


	public class demo2 { 
		 
		public static void main(String[] args) { 
		 
		Hello hello1 = (a, b) -> { 
		int sum = a+b;  
		return sum; 
		}; 
		int sum1 = hello1.test(100, 50); 
		System.out.println("Sum : " + sum1); 
		MyInteger myIntRef = new MyInteger();
		Hello hello2 = myIntRef ::findSum; 
		int sum2 = hello2.test(100, 50); 
		System.out.println("Sum : " + sum2); 
		
		} 
		}
	