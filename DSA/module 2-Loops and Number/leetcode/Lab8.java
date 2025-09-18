//326 power of three
class Lab8{
public static boolean isPawerOfThree(int n){
if(n==0)
return false;
while(n%3==0){
n=n/3;
}
return n==1;
}
public static void main(String args[]){
int n=243;
System.out.println(isPawerOfThree(n));
}
}