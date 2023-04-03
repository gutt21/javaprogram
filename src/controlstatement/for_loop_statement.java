package controlstatement;

public class for_loop_statement {

	
	public static void main(String[] args) {
		
		/*for(int i=1; i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	
    for(int i=1; i<=5;i++) {
			
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	
    // for each loop
    
    int ar[]= {20,50,6,4,85,69,55445,};
    for(int i:ar) {
    	
    	System.out.println(i);
    }*/
	
    aa: for(int i=1; i<=3;i++) {
			
			bb:for(int j=1;j<=3;j++) {
				
				if((i==2)&&(j==2)){
				break bb;
					
				}
				System.out.println(i+"="+j);
			}
		
     }
		
    aa: for(int i=1; i<=3;i++) {
		
		bb:for(int j=1;j<=3;j++) {
			
			if((i==2)&&(j==2)){
			break aa;
				
			}
			System.out.println(i+"="+j);
		}
	
 }
	
		
		
		
		
		
		
		
		
		
		
		
	
	
}}
