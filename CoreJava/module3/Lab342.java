class Hello{
void show(int a,int b){
System.out.println("show(int,int)");
}
int show(int x,int y){
System.out.println("show(int,int)");
return 99;
}
}
class Lab342{
public static void main(String args[]){
Hello h= new Hello();
h.show(10,20);
}
} 
