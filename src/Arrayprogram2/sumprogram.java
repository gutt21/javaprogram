package Arrayprogram2;

public class sumprogram {

	
	public static void main(String[] args) {
		
	int data[]= {2,4,5,8,6};
	int sum=0;
	
	for(int i=0;i<data.length;i++) {
		
		sum=sum+data[i];
	}
	System.out.println("total sum:-"+sum);
	}
}
