import java.util.Scanner;
class Detail{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter your name");
String name = sc.nextLine();
System.out.println("please enter your email");
String email=sc.nextLine();
System.out.println("please enter your Number");
long num= sc.nextLong();
System.out.println("name =" +name);
System.out.println("email ="+email);
System.out.println("number ="+num);
}
}
