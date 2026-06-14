class Test23{
public static void main(String args[]){
C ref=new C();
ref.x=98;
System.out.println(ref.x);
}
}
class A{ int x=99; }
class B extends A{ String x="JLC"; }
class C extends B{ float x=11.1F; } 