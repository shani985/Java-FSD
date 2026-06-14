class Hai{
Hai(int a){
System.out.println("Hai-1 arg ");
}
}
class Hello extends Hai {
Hello(){
super(10);
System.out.println("Hello-0 arg");
}
}
class Lab413{
static public void main(String args[]){
new Hello();
} } 
