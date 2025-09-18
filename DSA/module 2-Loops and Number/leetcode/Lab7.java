//866 Prime Palindrom 
class Lab7{
public static boolean prime(int n){
int count=0;
for(int i=2;i<=n/2;i++){
if(n%i==0){
count++;
}
}
return count==0;
}
public static boolean palindrome(int n){
int rev=0;
int nCopy=n;
while(n!=0){
rev=rev*10+n%10;
n=n/10;
}
return rev==nCopy;
}
public static void main(String args[]){
int n=101;
if(prime(n)&&palindrome(n)){
System.out.println("number is prime palindrome");
}else{
System.out.println("number is  not prime palindrome");
}

}
}
