package Java_Number_Programs;

public class Automorphic_number {



	static boolean akash(int n) {

		int squ=n*n;
		while(n>0) {
			if(n%10!=squ%10)
				return false;
			n=n/10;
			squ=squ/10;		
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(akash(25)?"Automorphic" : "Not Automorphic");
	}
}
