class Lab189 { 
public static void main(String jlc[]){ 
MyJLC: 
for(int i=1;i<=3;i++){ 
for(int j=1;j<=2;j++){ 
System.out.println(i+"--"+j); 
if(i==2) 
break MyJLC; 
System.out.println("Hello Guys "); 
} 
} 
System.out.println("outside -for"); 
} 
} 