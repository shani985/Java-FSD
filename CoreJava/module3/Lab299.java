class Hello{
int a=10;
void show(){
int a=20;
System.out.println(a); // Local
System.out.println(this.a); // Instance
}
}
class Lab299{
public static void main(String args[]){
Hello h=new Hello();
h.show();
}
} 
