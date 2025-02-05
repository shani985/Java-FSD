class Hello { 
int a; 
int b=20; 
void show(){ 
System.out.println("a : "+ a); 
System.out.println("b : "+ b); 
} 
} 
class Lab248 { 
public static void main(String args[]){ 
Hello h1=new Hello(); 
h1.show(); 
h1.a=10; 
h1.show(); 
Hello h2=new Hello(); 
h2.show(); 
h2.a=100; 
h2.b=200; 
h2.show(); 
} 
} 
