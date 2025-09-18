//342 power of four
class Lab9A{
public static boolean isPawerOfFour(int n){
if(n==0)
return false;
while(n%4==0){
n=n/4;
}
return n==1;
}
public static void main(String args[]){
int n=256;
System.out.println(isPawerOfFour(n));
}
}