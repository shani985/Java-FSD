class Hello{
int a=10;
void show(){
System.out.println(a); // Instance
System.out.println(this.a); // Instance
}
}
class Lab300{
public static void main(String args[]){
Hello h=new Hello();
h.show();
}
} 
