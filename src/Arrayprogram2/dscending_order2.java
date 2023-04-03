package Arrayprogram2;

import java.util.Arrays;

public class dscending_order2 {

	
	public static void main(String[] args) {
		int data[]= {5,3,8,9,1,2,6};
		int temp=0;
		
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		
		
		
		for(int i=0;i<data.length;i++) {
			for(int j=i+1;j<data.length;j++) {
				if(data[i]<data[j]) {
					temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			
			}
			
		}
		System.out.println(Arrays.toString(data));
	}
	
}
