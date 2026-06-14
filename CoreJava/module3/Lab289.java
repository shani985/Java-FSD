class Hello{
int a;
int b;
int c;
void init(int x,int y,int z){
a=x;
b=y;
c=z;
}
void show(){
System.out.println(a+"\t"+b+"\t"+c);
}
}
class Lab289{
public static void main(String args[]){
Hello h1=new Hello();
h1.init(10,20,30);
h1.show();
Hello h2=new Hello();
h2.init(100,200,300);
h2.show();
Hello h3=new Hello();
h3.init(99,88,77);
h3.show();
}
} 