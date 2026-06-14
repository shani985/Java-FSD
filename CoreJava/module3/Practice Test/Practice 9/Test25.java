class Test25 {
public static void main(String[] args) {
 show(null);
}
static void show(String str) {
 System.out.println("String");
}
static void show(Test25 t) {
 System.out.println("Test");
}
}