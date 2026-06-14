class Hello{
void show(){
System.out.println("show - begin");
show();
System.out.println("show - end");
}
}
class Lab364{
public static void main(String args[]){
Hello h= new Hello();
h.show();
} 
}