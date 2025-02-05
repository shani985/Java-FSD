class Customer { 
int cid; 
String cname; 
String email; 
long phone; 
void show(){ 
System.out.println(cid+"\t"+cname+"\t"+email+"\t"
+phone); 
} 
} 
class Lab249 { 
public static void main(String args[]){ 
Customer cust1 = new Customer(); 
cust1.show(); 
cust1.cid=101; 
cust1.cname="Sri"; 
cust1.email="sri@myjlc.com"; 
cust1.phone=123456; 
cust1.show(); 
Customer cust2 = new Customer(); 
cust2.show(); 
cust2.cid=102; 
cust2.cname="Vas"; 
cust2.email="vas@myjlc.com"; 
cust2.phone=56789; 
cust2.show(); 
} 
} 
