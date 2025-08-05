class Hello{ 
static int b; 
} 
 
class Lab257 { 
public static void main(String args[]){ 
new Hello().b=99; 
System.out.println(new Hello().b); 
} 
}