//1134 armstrong number
class Lab6{
public static int countDigit(int num){
int count=0;
while(num!=0){
count++;
num=num/10;
}
return count;
}
public static int power(int num,int pow){
int result=1;
for(int i=1;i<=pow;i++){
result=result * num;
} 
return result;
}
public static boolean armstrongNumber(int num){
int nCopy=num;
int digit1=  countDigit(num);
int arm=0;
while (num!=0){
 int digit=num%10;
 arm=arm+power(digit,digit1);
num=num/10;
}
return arm==nCopy;
}
public static void main(String args[]){
int n=153;
System.out.println(armstrongNumber(n));
}
}