class Test34 {
static int count = 0;
public static void main(String… args) {
System.out.println("Main");
count++;
if (count ==1)
 main();
}
}