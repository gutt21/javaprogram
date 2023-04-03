package Arraydemo;

public class arrayclass {

	public static void mains(int aks[]) {
				
        int ak= aks[0];
        
		for(int i=0;i<aks.length;i++) {
			if(ak>=aks[i]) {
				ak=aks[i];
			}
			
		}
		System.out.println(ak);

	}
	public static void main(String[] args) {
		int a[]= {1,2,3};
		mains(a);
	}
	
}
