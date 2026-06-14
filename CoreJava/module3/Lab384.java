lass Lab384{
static public void main(String args[]){
System.out.println("I am main(String[])");
main("MyJLC");
main(99);
main(new int[]{10,20,30});
}
public static void main(String arg){
System.out.println("I am main(String)");
}
public static void main(int [] args){
System.out.println("I am main(int[])");
}
static public int main(int arg){
System.out.println("I am main(int)");
return arg;
}
}