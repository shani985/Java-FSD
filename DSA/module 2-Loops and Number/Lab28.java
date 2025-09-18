//print the  armstrong  from 1 to n
class Lab28{
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
int n=1000;
for(int i=1;i<=n;i++){
if(isArmStrong(i)){
System.out.println(i);
}
}
}
}
// Tc - o(nlogn)
//Sc - o(1)