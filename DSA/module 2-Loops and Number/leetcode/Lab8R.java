//326 power of three
class Lab8R{
public static boolean isPawerOfThree(int n){
if (n==0)
return false;
if(n==1)
return true;
if(n%3!=0)
return false;
return isPawerOfThree(n/3);
}
public static void main(String args[]){
int n=213;
System.out.println(isPawerOfThree(n));
}
}