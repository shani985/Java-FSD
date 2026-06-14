class Hello{
void sum(int a,int b){
int sum=a+b;
System.out.println(sum);
}
}
class Lab341{
public static void main(String args[]){
Hello h= new Hello();
byte b1=10;
byte b2=20;
h.sum(b1,b2);
}
} 