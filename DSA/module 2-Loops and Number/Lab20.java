//checkwhether number is perfact number or not 
class Lab20{
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
int n=6;
System.out.println(isPerfact(n));
}
}
//tc -0(n/2)
//space - o(1)