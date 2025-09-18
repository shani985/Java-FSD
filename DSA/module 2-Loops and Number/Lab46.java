class Lab46{
public static void main(String args[]){
  int row=7;
int space=20;
int star=1;
for(int i=1;i<=row/2	;i++){
for(int j=1;j<=space;j++){
System.out.print(" ");
}
for(int k=1;k<=star;k++){
System.out.print("*");
}
System.out.println();
space=space-1;
star=star+2;
}
for(int i=1;i<=row/2+1;i++){
for(int j=1;j<=space;j++){
System.out.print(" ");
}
for(int k=1;k<=star;k++){
System.out.print("*");
}
System.out.println();
space=space+1;
star=star-2;
}
}
}
