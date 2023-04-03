package Java_Number_Programs;

public class Reverse_Number {

	
	public static void main(String[] args) {
		int r,revers=0;
		int n=123;
		while(n>0) {
			r=n%10;
			revers=(revers*10)+r;
			n=n/10;
		}
		System.out.println(revers);
	}
	
}
