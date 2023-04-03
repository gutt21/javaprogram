package javabasicprogram;

public class Palindrome_Program {

	
	
	public static void main(String[] args) {
		akash(454586);
	}
	
	public static void akash(int n) {
		
		int r,sum=0,temp;
		temp=n;
		while(n>0) {
			r=n%10;   
			sum=(sum*10)+r;
			n=n/10;
		}
		
		if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");
	
	}
	
}
