class Hello{
void show(Object obj){
System.out.println("show(Object)");
}
void show(String str){
System.out.println("show(String)");
}
void show(Hello hello){
System.out.println("show(Hello)");
}
}
class Lab356{
public static void main(String args[]){
Hello h= new Hello();
h.show(null);
}
} 