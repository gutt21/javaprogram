package controlstatement;

public class is_else_statement {

	public static void main(String[] args) {
		
		
		
		int age=25;
		
		if(age>28) {
			System.out.println("yes");
		}
		
		else if(age>24) {
			System.out.println("realy yes");
		}
		else {
			System.out.println("no");
		}
		
		
		int w=400;
		
		if(((w%4==0)&&(w%2!=0))||(w%400==0)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	
	
	
	int b=20;
	
	if(b>21) {
		if(b>21) {
			System.out.println("yes bro");
		}else {
			System.out.println("no bro");
		}
	}else {
		System.out.println("real no bro");
	}
	
	
}}
