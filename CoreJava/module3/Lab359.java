class Hello{
/*
void show(byte a){
System.out.println("show(byte)");
}
void show(short a){
System.out.println("show(short)");
}
void show(int a){
System.out.println("show(int)");
}
void show(long a){
System.out.println("show(long)");
} 
void show(float a){
System.out.println("show(float)");
}
*/
void show(double a){
System.out.println("show(double)");
}
}
class Lab359{
public static void main(String args[]){
Hello h= new Hello();
byte b=10;
h.show(b); //
short s=10;
h.show(s);
int a=10;
h.show(a);
long x=10;
h.show(x);
float f=9.9F;
h.show(f);
double d=9.9;
h.show(d);
}
} 