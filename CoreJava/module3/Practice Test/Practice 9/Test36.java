class Test36 {
static int count = 0;
public static void main(String... args) {
System.out.println("Main "+args.length);
count++;
if (count == 1)
 main("Sri");
}
static void main(String str){
 System.out.println("Main");
}
} 
