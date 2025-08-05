class Hello{ 
static int b; 
} 
 
class Lab253 { 
public static void main(String args[]){ 
Hello h=new Hello(); 
System.out.println(h.b); 
h.b=99; 
System.out.println(h.b); 
} 
}