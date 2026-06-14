class Hello{
int a;
int b;
int c;
Hello(int x,int y,int z){
a=x;
b=y;
c=z;
}
void show(){
System.out.println(a+"\t"+b+"\t"+c);
}
}
class Lab290{
public static void main(String args[]){
Hello h1=new Hello(10,20,30);
h1.show();
Hello h2=new Hello(100,200,300);
h2.show();
Hello h3=new Hello(99,88,77);
h3.show();
}
}