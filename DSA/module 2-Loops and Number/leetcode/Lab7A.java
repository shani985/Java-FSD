//866 Prime Palindrom 
class Lab7A{
public static boolean prime(int n){
int count=0;
if(n==1)
return false;
for(int i=2;i<=n/2;i++){
if(n%i==0){
count++;
}
}
return count==0;
}
public static boolean palindrom(int n){
int rev=0;
int nCopy=n;
while(n!=0){
rev=rev*10+n%10;
n=n/10;
}
return rev==nCopy;
}

public static int primePalindrom(int n){
if(prime(n)&&palindrom(n)){
return n;
}
while(true){
if(prime(n)&&palindrom(n))
return n;
n++;
if(n>=1000_00_000&&n<=1000_00_0000)
n=100_00_000;
}
}
public static void main(String args[]){
int n=8;
int x=primePalindrom(n);
System.out.println(x);

}
}
