package Arrayprogram;

import java.util.Arrays;

public class leftrotateprogram {

	
	
	public static void akash() {
		
		int b[]= { 2,5,8,9,2,5};
		
			int j;
			int f=b[0];
		for(j=0;j<b.length-1;j++) {
			b[j]=b[j+1];
			
		}
		b[j]=f;
		System.out.print(Arrays.toString(b));
			
	
		
	}
	
	
	 public static int getThirdLargest(int[] a, int total){
		 Arrays.sort(a);
		 return a[total-3];
		 }
	
	
	
	
	public static void main(String[] args) {
		
		akash();
		
		
		int data[]= {1,2,3,4,5};
		int n=3;
		System.out.println("original array print");
		for(int i:data) {
			System.out.print(i+" ");
		}
		
		for(int i=0;i<n;i++) {
			int j,first;
			  first = data[0];  
			for(j=0;j<data.length-1;j++) {
				data[j]=data[j+1];
				
			}
			
			data[j]=first;
			System.out.print(Arrays.toString(data));
		}
		
		System.out.println();
		System.out.println("Array after left rotation: ");  
		 for(int i = 0; i< data.length; i++){  
	            System.out.print(data[i] + " ");  
	            
		 }
		 
		
			
			 int a[]={1,2,5,6,3,2};
			 int b[]={44,66,99,77,33,22,55};
			 System.out.println("Third Largest: "+getThirdLargest(a,6));
			 System.out.println("Third Largest: "+getThirdLargest(b,7));
	}
}
