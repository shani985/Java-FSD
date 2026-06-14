class Test29 {
public static void main(String[] args) {
 show((Object)null);
}
static void show(String str) {
 System.out.println("String");
}
static void show(Test29 t) {
 System.out.println("Test");
}
}