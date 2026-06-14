class Hello{
int a;
int b;
int c;
void show(){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
}
class Lab287{
public static void main(String args[]){
Hello h1=new Hello();
h1.show();
Hello h2=new Hello();
h2.show();
Hello h3=new Hello();
h3.show();
}
}