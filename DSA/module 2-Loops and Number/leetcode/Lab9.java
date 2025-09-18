//342 power of four
class Lab9{
public static boolean isPawerOfFour(int n){
if (n==0)
return false;
if(n==1)
return true;
if(n%4!=0)
return false;
return isPawerOfFour(n/4);
}
public static void main(String args[]){
int n=165;
System.out.println(isPawerOfFour(n));
}
}