\\ print the digit of given number
class Lab22{
public static void main(String args[]){
int n=345;
while(n>0){
int d=n%10;
System.out.println(d);
n=n/10;
}
}
}
// TC - o(logn)
//SC - o(1)
