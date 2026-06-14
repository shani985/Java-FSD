class Hello{
int a;
int b;
int c;
Hello(int a,int b,int c){
this.a=a;
this.b=b;
this.c=c;
}
void show(){
System.out.println(this.a);
System.out.println(this.b);
System.out.println(this.c);
}
}
class Lab303{
public static void main(String args[]){
Hello h=new Hello(10,20,30);
h.show();
}
} 
