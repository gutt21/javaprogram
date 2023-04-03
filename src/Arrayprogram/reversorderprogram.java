package Arrayprogram;

public class reversorderprogram {

	
	public static void main(String[] args) {
		
		
		int data[] = {1,2,3,4};
		System.out.println("original order");
		for(int i=0;i<data.length;i++) {
			System.out.print(" "+data[i]);
			
		}
		System.out.println();
		System.out.println("revers order");
		 for(int i=data.length-1;i>=0;i--) {
			System.out.print(" "+data[i]);
			
		}
		
	}
}
