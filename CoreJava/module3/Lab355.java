class Hello{
void show(String str){
System.out.println("show(String)");
}
void show(Hello hello){
System.out.println("show(Hello)");
}
}
class Lab355{
public static void main(String args[]){
Hello h= new Hello();
h.show(null);
}
} 
