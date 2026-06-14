class Hello{
void show(int []arr){ //Fixed Args
System.out.println("show(int []arr)");
for(int x:arr)
System.out.println(x);
}
}
class Lab370{
public static void main(String args[]){
Hello h= new Hello();
h.show(new int[]{10,20});
int arr[] = new int[5];
arr[0]=10; arr[1]=20; arr[2]=30;
arr[3]=40; arr[4]=50;
h.show(arr);
}
}