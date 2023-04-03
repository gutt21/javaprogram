package javabasicprogram;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class Prime_Number_Program {

	
	
	
	
	public static void akash(int n) {
		
		
		int i,m=0,flag=0;
	
		m=n/2;
		
		for(i=2;i<m;i++) {
				if(n%i==0) {
					System.out.println(n+" is not prime number");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(n+" is a prime number");
			}
		}
		
	
	
	
	public static void main(String[] args) {
		
		akash(21);
		
		
		Scanner  s= new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		
	   if (isPrime(n)) {  
	           System.out.println(n + " is a prime number");  
	       } else {  
	           System.out.println(n + " is not a prime number");  
	    }  
	}
	    public static boolean isPrime(int n) {  
	         for (int i = 2; i < Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
		
	       return true;  
	}
	
}
