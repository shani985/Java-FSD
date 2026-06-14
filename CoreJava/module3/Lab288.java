class Hello{
int a;
int b;
int c;
void show(){
System.out.println(a+"\t"+b+"\t"+c);
}
}
class Lab288{
public static void main(String args[]){
Hello h1=new Hello();
h1.a=10;
h1.b=20;
h1.c=30;
h1.show();
Hello h2=new Hello();
h2.a=100;
h2.b=200;
h2.c=300;
h2.show();
Hello h3=new Hello();
h3.a=99;
h3.b=88;
h3.c=77;
h3.show();
}
}