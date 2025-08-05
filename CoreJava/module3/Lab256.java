class Hello{ 
 static int a; 
} 
 
class Lab256 { 
public static void main(String args[]){ 
new Hello.a=99; 
System.out.println(new Hello().a); 
} 
}