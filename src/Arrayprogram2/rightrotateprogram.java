package Arrayprogram2;

import java.util.Arrays;

public class rightrotateprogram {


	public static void main(String[] args) {
		int data[]= {1,2,3,4,5};

		for(int i=0;i<3;i++) {
			int j,add;
			add=data[data.length-1];
			for(j=data.length-1;j>0;j--) {
				data[j]=data[j-1];
			}
			
			data[j]=add;
			System.out.print(Arrays.toString(data));
		}
		
		System.out.println();

		for(int i=0; i<data.length;i++) {
			System.out.print(data[i]+", ");


		}
	}
}
