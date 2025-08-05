package decom.jlcindia.demo3;

public class demo3 {

	public static void main(String[] args) {
		Hello hello1 = (a, b, c, d) -> { 
			Course course = new Course(a, b, c, d); 
			return course; 
			};
			Course course1 = hello1.test(101, "DevOps",150000,"Srinivas Dande"); 
			System.out.println(course1); 
			 
			//2.Method Refernce Style 
			Hello hello2= Course::new; 
			 
			Course course2 = hello2.test(102, "Boot - MicroServices",10000,"Srinivas Dande"); 
			System.out.println(course2); 
			 
			System.out.println("Done!!!"); 
			} 
			

	}


