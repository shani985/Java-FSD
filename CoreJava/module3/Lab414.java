class Hai{
Hai(int a){
System.out.println("Hai-1 arg ");
}
}
class Hello extends Hai {
Hello(){
System.out.println("Hello-0 arg");
super(10);
}
}
class Lab414{
static public void main(String args[]){
new Hello();
} } 