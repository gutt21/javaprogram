package Arrayprogram;

public class evennumberprogram {

	
	public static void main(String[] args) {
		int data[] = {1,2,3,4,5,6};
		System.out.println("even number");
		for(int i=1;i<data.length;i=i+2) {
			System.out.print(" "+data[i]);
			
		}
		System.out.println();
		int data1[] = {1,2,3,4,5,6};
		System.out.println("odd number");
		for(int i=0;i<data.length;i=i+2) {
			System.out.print(" "+data1[i]);
			
		}
	}
}
