class Hello{
void show(int a,byte b){ //1
System.out.println("show(int,byte)");
}
void show(byte a,int b){ //2
System.out.println("show(byte,int)");
}
}
class Lab350{
public static void main(String args[]){
Hello h= new Hello();
byte b1=10;
byte b2=20;
h.show(10,b2); //1
h.show(b1,20); //2
}
} 
