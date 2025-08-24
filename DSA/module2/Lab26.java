// sum  the cubes of digit of given number
class Lab26{
public static void main(String args[]){
int n=8345;
int sum=0;
while(n>0){
int d=n%10;
sum+=d*d*d;
n=n/10;
}
System.out.println(sum);
}
}
// TC - o(logn)
//SC - o(1)
