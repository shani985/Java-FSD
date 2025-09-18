// print the digit of givin number in same order
class Lab34{
public static int reverse(int n){
int rev=0;
while(n!=0){
int digit=n%10;
rev=rev *10+digit;
n=n/10;
}
return rev;
}
 public static void main(String args[]){
int n=1324;
int rev=reverse(n);
while(rev!=0)
{
System.out.println(rev%10);
rev=rev/10;
}
}
}
// tc -o(d)
// sc -o(1)