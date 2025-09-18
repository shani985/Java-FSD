
//print the strong number from 1 to n
class Lab31{
public static int fact(int n){
int fact =1;
for(int i=1;i<=n;i++){
fact=fact*i;
}
return fact;
}
public static boolean isStrong(int n){
long sum=0;
int copy=n;
while(n!=0){
int digit=n%10;
long fact=fact(digit);
sum+=fact;
n=n/10;
}
return sum==copy;
}
public static void main(String args[]){
int n=1000;
for(int i=1;i<=n;i++){
if(isStrong(i)){
System.out.println(i);
}
}
}
}
// tc -o(nlogn)
//space -o(1);