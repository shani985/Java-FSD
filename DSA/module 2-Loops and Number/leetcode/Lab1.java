 //7 Reverse integer
class Lab1{
public static int reverse(int num){
int revNum=0;
while(num!=0){
revNum=revNum*10+num%10;
num=num/10;
}
if(revNum<Integer.MIN_VALUE||revNum>Integer.MAX_VALUE) 
return 0;
return revNum;
}
public static void main(String args[]){
int num=2436;
System.out.println(reverse(num));
}
}