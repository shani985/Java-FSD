//print the perfact number from 1 to n
class Lab21{
  public static boolean isPerfact(int n){
int sum=0;
for(int i=1;i<=n/2;i++)
{
if(n%i==0)
sum+=i;
}
if(sum==n)
return true;
else
return false;
}
public static void main(String args[]){
int n=1000;
for(int i=1;i<=n;i++){
if(isPerfact(i)){
System.out.println(i);
}
}
}
}

//tc -0(n*n/2)=o(n^2); 
//space - o(1)