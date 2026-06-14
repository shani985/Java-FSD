public class Test30 {
static int a;
public static void main(String[] args) {
 int a = 10;
 show(a);
 System.out.println(Test.a + "\t" + a);
}
static void show(int a) {
 a = a + 20;
 Test.a = a;
}
}