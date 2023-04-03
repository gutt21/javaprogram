package Arrayprogram;

public class maxmiumnumber {

	
	public static void main(String[] args) {
		
		int data[]= {25,11,7,75,85};
		int max;
		max=data[0];
		for(int i=0; i<data.length;i++) {
			
			if(data[i]>max)
				max=data[i];
		}
		System.out.println("maximum value in array: "+max);
		
	}
}
