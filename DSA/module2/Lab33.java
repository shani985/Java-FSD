//check whether number is palindrom or not
class Lab33{
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
if(n==rev){
System.out.println("number is palindrom");
}else{
System.out.println("number is not palindrom");
}
}
}
// tc -o(d) where d is number of digit
// sc -o(1)