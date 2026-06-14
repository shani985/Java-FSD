class Hello{
int a;
int b;
int c;
Hello(int a,int b,int c){
a=a;
b=b;
c=c;
}
void show(){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
}
class Lab302{
public static void main(String args[]){
Hello h=new Hello(10,20,30);
h.show();
}
}