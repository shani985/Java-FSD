class Hello{
void show(int a,int b){
System.out.println("show(int,int)");
}
int show(int x,int y,int z){
System.out.println("show(int,int,int)");
return 99;
}
}
class Lab343{
public static void main(String args[]){
Hello h= new Hello();
h.show(10,20);
h.show(10,20,30);
}
}