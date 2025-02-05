class  Check
{
 int a=40;
char ch ;
void show()
{
System.out.println(ch==0);
System.out.println(ch==' ');
System.out.println(ch=='\u0000');
System.out.println(a);
}
}
class Lab2
{
public static void main(String args[])
{
Check r = new Check();
r.show();
int b=9;
System.out.println(b);
}
}