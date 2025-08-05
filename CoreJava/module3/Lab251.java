class Hello{ 
 
int a=10; 
static int b=20; 
 
void m1(){ 
System.out.println(a); 
System.out.println(b); 
} 
 
static void m2(){ 
//System.out.println(a); 
System.out.println(b); 
} 
} 
 
class Lab251 { 
public static void main(String args[]){ 
Hello h=new Hello(); 
h.m1(); 
h.m2(); 
} 
}