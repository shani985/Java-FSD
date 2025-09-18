//cheack the given number is armstrong or not
class Lab27{
public static boolean isArmStrong(int n){
int temp=n;
int arm=0;
while(temp>0){
int digit=temp%10;
arm=arm+digit*digit*digit;
temp=temp/10;
}
if(arm==n)
return true;
else
return false;
}

public static void main(String args[]){
int n=153;
System.out.println(isArmStrong(n));

}
}