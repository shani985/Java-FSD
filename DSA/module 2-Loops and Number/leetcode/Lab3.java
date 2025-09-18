//35 check gigin number is Palindrom or not

class Lab3{
public static boolean palindrom(int num){
if(num<0)
return false;
int revNum=0;
int nCopy=num;
while(num!=0){
revNum=revNum*10+num%10;
num=num/10;
}
if(nCopy==revNum)
return true;
return false;
}
public static void main(String args[]){
int n=-121;
System.out.println(palindrom(n));
}
}

