class Lab245 { 
public static void main(String jlc[]){ 
int arr[][][] = { 
 {{10,20},{30,40}}, 
 {{50,60},{70,80}} 
 }; 
for(int [][]x : arr){ 
for(int []y:x){ 
for(int z:y){ 
System.out.print(z+"\t"); 
} 
System.out.println(""); 
} 
System.out.println("---------------------------"); 
} 
} 
}