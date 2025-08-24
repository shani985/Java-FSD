// count the digit of given number
class Lab23{
public static void main(String args[]){
int n=8345;
int count=0;
while(n>0){
int d=n%10;
count++;
n=n/10;
}
System.out.println(count);
}
}
// TC - o(logn)
//SC - o(1)
