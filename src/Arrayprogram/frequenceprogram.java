package Arrayprogram;

public class frequenceprogram {


	public static void main(String[] args) {

		int data[]= {1,2,8,3,2,2,2,5,1};
		
		int fr[]=new int[data.length];
		int visting=-1;
	
		for(int i=0;i<data.length;i++) {
			int count=1;
			for(int j=i+1;j<data.length;j++) {
				
				if(data[i] == data[j]) { 
					count++; 
					fr[j]=visting; 
				}
			}
			
			 if(fr[i]!=visting)
	                fr[i] = count;  
			 
		}
		System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        
        for(int i = 0; i < fr.length; i++){ 
        	
             if(fr[i]!=visting)
                System.out.println("    " + data[i] + "    |    " + fr[i]);  
            
	     }
        
        System.out.println("----------------------------------------");  
        
        
        
        
        
        
        
}
	}