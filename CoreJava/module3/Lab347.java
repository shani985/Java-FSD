class Hello{
void show(int a,byte b){
System.out.println("show(int,byte)");
}
}
class Lab347{
public static void main(String args[]){
Hello h= new Hello();
byte b1=10;
byte b2=20;
h.show(b1,b2);
}
} 
