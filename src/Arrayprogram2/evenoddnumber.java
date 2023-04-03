package Arrayprogram2;

public class evenoddnumber {

	
	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,5,6,7,8,9,10,3257};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println("even numbers:="+a[i]);
			}
			else if(a[i]%2!=0) {
				System.out.println("odd numbers:="+a[i]);
			}
			else {
				System.out.println("invalid numbers");
			}
		}
	}
}
