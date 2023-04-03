package javabasicprogram;

public class FibonacciSeries {
public static void main(String[] args) {
	

	
	//Fibonacci Series in Java without using recursion
	
	/*int n1=0,n2=1,n3,i,count=10;
	
	System.out.println(n1+" "+n2);
	
	for(i=2;i<count;i++) {
		n3=n1+n2;
		System.out.println(" "+n3);
		n1=n2;
		n2=n3;
		
	}*/
	int coun=10;
	System.out.println(n1+" "+n2);
	akash(coun-1);
	}
	
	//Fibonacci Series using recursion in java
	
     static int n1=0,n2=1,n3=0;
	 public static void akash(int coun) {
		 if(coun>0) {
			 n3=n1+n2;
			 n1=n2;
			 n2=n3;
			 System.out.println(" "+n3);
			 akash(coun-1);
		 }
	 }
	
	
}
