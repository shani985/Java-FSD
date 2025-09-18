import java.util.Scanner;
//check whether given number is prime or not
//more optimize
class Lab17{
public static boolean isPrime(int n){
for(int i=2;i<=n/2;i++){
if(n%i==0){
return false;
}
}
return true;
 
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
boolean flage=isPrime(n);
System.out.println(flage);
}
}
// Tc -o(1)
//Sc c-o(1);