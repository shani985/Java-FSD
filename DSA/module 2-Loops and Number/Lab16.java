import java.util.Scanner;
//check whether given number is prime or not
class Lab16{
public static boolean isPrime(int n){
int count=0;
for(int i=2;i<=n/2;i++){
if(n%i==0){
count++;
break;
}
}
if(count==0)
return true;
else
return false;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
boolean flage=isPrime(n);
System.out.println(flage);
}
}
// Tc -o(logn) 
//Sc c-o(1);