class Hai{
Hai(){
System.out.println("Hai- 0 arg");
}
}
class Hello extends Hai{
Hello(){
System.out.println("Hello- 0 arg");
}
}
class Lab404{
static public void main(String args[]){
new Hello();
}
} 
