//find the   whether given number is strong or not
//strong number ;sum of factorial digit is eqaul to the given number
// 123=1!+2!+3!
class Lab30{
public static int fact(int n){
int fact=1;

for(int i=1;i<=n;i++){
fact =fact *i;
}
return fact;
}
public static void main(String args[]){
int n=145;
int sum=0;
int copy=n;
while(n>0){
int digit=n%10;
sum=sum+fact(digit);
n=n/10;
}
if(sum==copy)
{
System.out.println("Stromg number");
}
else{
System.out.println(" not Stromg number");
}
}
}
// Tc- o(n)
 //sc -o(1); 