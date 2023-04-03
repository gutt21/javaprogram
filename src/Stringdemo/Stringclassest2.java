package Stringdemo;

public class Stringclassest2 {

	public static void main(String[] args) {


		String a="aaaabbbbcccc";
		int n=3;
		int len=a.length();
		int n1=len/n;
         String s = null;
        if(len%n==0) {
        	
        	for(int i=0;i<n;i++) {
        		for(int j=i*n1;j<(i+1)*n1;j++) {
        			s=s+a.charAt(j);
        		}
        		
        	}
        	System.out.print(s);
        	System.out.println();
        }else {
        	System.out.println("invalid number");
        }






	}}
