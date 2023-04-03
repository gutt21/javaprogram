package Arrayprogram2;

public class thirdlargestnumber {

	
	public static void largestthird() {
		int a[]= {2,1,3,8,6,9};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		
		System.out.println("third largest number:="+a[(a.length-1)-3]);

		
		
		
	}
	
	public static void main(String[] args) {
		
		largestthird();
	
	}
	
}
