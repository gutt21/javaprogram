package Arrayprogram;

public class miimummnumber2 {

	
	public static void main(String[] args) {
		
		int data[]= {25,11,7,75,85};
		int min;
		min=data[0];
		for(int i=0; i<data.length;i++) {
			
			if(data[i]<min)
				min=data[i];
		}
		System.out.println("minimum value in array: "+min);
		
	}
}
