class Test26 {
public static void main(String[] args) {
 show((String)null);
}
static void show(String str) {
 System.out.println("String");
}
static void show(Test26 t) {
 System.out.println("Test");
}
} 
