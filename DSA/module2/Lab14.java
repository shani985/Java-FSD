//check whether number is prime or not
class Lab14{
public static void main(String agr[]){
int n=19;
int count=0;
for(int i=1;i<=n;i++){
if(n%i==0){
count++;
}
}
if(count==2){
System.out.println("number is prime");
}else{
System.out.println("number is not prime");
}
}
}
//Tc O(n)
//SC O(1); 