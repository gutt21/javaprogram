package Arrayprogram;

public class dublicateprogram {

	
	public static void main(String[] args) {
		
		
		int data[]= {2,1,3,2,6,8,4,8,3};
		System.out.println("dublicate element array: ");
		for(int i=0;i<data.length;i++) {
			for(int j=i+1;j<data.length;j++) {
				 if(data[i] == data[j])
				System.out.println(data[i]);
			}
		}
	}
}
