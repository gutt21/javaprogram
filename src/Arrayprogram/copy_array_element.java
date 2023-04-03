package Arrayprogram;

public class copy_array_element {

	
	
	public static void main(String[] args) {
		
		
		int data1[]= {1,2,3,4,5};
		
		int data2[]=new int [data1.length];
		
		
		  /* data2[0]=data1[0];
		   data2[1]=data1[1];
		   data2[2]=data1[2];
		   data2[3]=data1[3];
		   data2[4]=data1[4];*/
		   
		          //or
		   
		 for(int i=0;i<data1.length;i++) {
		   data2[i]=data1[i];
		}
	
		System.out.println("original ouput array");
		for(int i=0;i<data1.length;i++) {
			System.out.print(data1[i]);
		}
		System.out.println();
		
		System.out.println("copy ouput array");
		for(int i=0;i<data2.length;i++) {
			System.out.print(data2[i]);
		}
		
	}	
}
