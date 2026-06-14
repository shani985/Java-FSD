class Hello{
void show(byte a,int b){
System.out.println("show(byte,int)");
}
}
class Lab349{
public static void main(String args[]){
Hello h= new Hello();
byte b1=10;
byte b2=20;
h.show(b1,b2);
}
} 
