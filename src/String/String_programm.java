package String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class String_programm {

	
	
	public static void main(String[] args) {
	
		pyramid() ;
		revers();
		Strin() ;
		}
	
	
 public static void test() {
	 
	 int a=123456789;
	
	 int bb=0;
	 while(a!=0) {
		 int r=a%10;
		 bb=bb*10+r;
		 a=a/10;
	 }
	 
	 System.out.println(bb);
	 
	 
 }
	
	public static void test2() {
		int a=0,b=1,c=0;
		
		int count=10;
		for(int i=0;i<count;i++) {
			c=a+b;
			System.out.print(c+",");
			
			b=c;
			a=b;
		}
		
		System.out.println();
	}
	
	 public static void Palindrome () {
		 
		 int a=121;
		int c=a;
		 int bb=0;
		 while(a!=0) {
			 int r=a%10;
			 bb=bb*10+r;
			 a=a/10;
		 }
		 System.out.println(c);
		 System.out.println(bb);
		 if(c==bb) {
			 System.out.println("it is palidrom number");
		 }else {
			 System.out.println("it is not palidrom number");
		 }
		 
		 
	 }
	
	 public  static void Factorial () {
		 int a=1;
		 int count=4;
		 for(int i=1;i<=count;i++) {
			 a=a*i;
		 }
		 System.out.println(a);
	 }
	 
	 
	 public static void pyramid() {
		 for(int i=1;i<=5;i++) {
			 for(int j=1;j<=i;j++) {
				 System.out.print(j);
			 }
			System.out.println();
		 }
		 
	 }
	
	 
	 
	 
	 
	 
	 public static void  revers() {
		 
		 
		 HashMap<String, Integer> hp=new HashMap<String, Integer>();
		 
		 
		 hp.put("i", 1);
		 System.out.println(hp.get("i"));
		 String a="akash";
		 StringBuffer bb=new StringBuffer(a);
		 bb.reverse();
		 System.out.println(a.indexOf("k"));
		 System.out.println(bb);
		 char c[]=a.toCharArray();
		 String b[]=a.split("");
		 String rev="";
		 for(int i=a.length()-1;i>=0;i--) {
			
			 rev=rev+c[i];
			System.out.print(c[i]);
		 }
		 System.out.println();
		 System.out.println(rev);
		 for(int i=0;i<b.length;i++) {
			 System.out.println(b[i]);
		 }
	 }
	 
	 
	 public static void Strin() {
		 String a="i love my india love my karanatak love my";
		 String []b=a.split(" ");
		 HashMap<String, Integer> hp=new HashMap<String, Integer>();
		 for(int i=0;i<b.length;i++) {
			 if(hp.get(b[i])== null) {
				 hp.put(b[i], 1);
			 }else {
				 hp.put(b[i], hp.get(b[i])+1);
			 }
		 }
		 
		Iterator<Map.Entry<String, Integer>> mm=hp.entrySet().iterator(); 
			 while(mm.hasNext()) {
				 Map.Entry<String, Integer> h=mm.next();
				 if(h.getValue()!=1) {
					 System.out.println(h.getKey()+" "+h.getValue());
				 }
			 }
		 
		 
		 
	 }
	 
	 
	 
	 
}
