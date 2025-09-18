// FIND THE SUM OF DIVISIBLE OF GIVEN NUMBER (EXCLUDE N)
class Lab19{
public static void main(String args[]){
int n=10;
int sum=0;
for(int i=1;i<=n/2;i++){
if(n%i==0)
sum+=i;
}
System.out.println(sum);
}
}
