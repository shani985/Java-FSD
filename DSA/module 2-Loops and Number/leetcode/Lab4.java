//258 add the digit  

class Lab4{
public static int addElement(int n){
if(n==0){
return 0;
}

while(n>=10){
int sum=0;
while(n!=0){
int digit=n%10;
sum=sum+digit;
n=n/10;
}
n=sum;
}
return n;
}
public static void main(String args[])
{
int n=464;
System.out.println(addElement(n));
}
}


