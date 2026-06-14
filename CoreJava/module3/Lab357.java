class Hello{
void show(int a){
System.out.println("show(int)");
}
void show(long a){
System.out.println("show(long)");
}
}
class Lab357{
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
}
} 
