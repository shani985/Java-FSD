// print the reverse number
class Lab32{
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
System.out.println(reverse(n));
}
}
// tc -o(d)
// sc -o(1)