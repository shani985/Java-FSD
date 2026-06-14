class A{
{
System.out.println("A- I.B");
}
static{
System.out.println("A- S.B");
}
}
class B extends A{
{
System.out.println("B- I.B");
}
static{
System.out.println("B- S.B");
}
}
class C extends B{
{
System.out.println("C- I.B");
}
static{
System.out.println("C- S.B");
}
}
class Lab403{
static public void main(String args[]){
C co = new C();
}
} 
