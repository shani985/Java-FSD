class Test27 {
public static void main(String[] args) {
 show((Test)null);
}
static void show(String str) {
 System.out.println("String");
}
static void show(Test27 t) {
 System.out.println("Test");
}
}