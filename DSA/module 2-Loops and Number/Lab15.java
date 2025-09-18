//check whether number is prime or not
class Lab15{
public static void main(String agr[]){
int n=19;
int count=0;
for(int i=2;i<=n/2;i++){
if(n%i==0){
count++;
break;
}
}
if(count==0){
System.out.println("number is prime");
}else{
System.out.println("number is not prime");
}
}
}
//Tc O(n)
//SC O(1); 