class Hello{
void show(int a,String b){
System.out.println("show(int,String)");
}
void show(String x,int y){
System.out.println("show(String,int)");
}
}
class Lab345{
public static void main(String args[]){
Hello h= new Hello();
h.show(10,"Hello");
h.show("Hello",20);
}
} 
