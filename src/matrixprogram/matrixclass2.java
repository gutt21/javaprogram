package matrixprogram;

public class matrixclass2 {


	public static void main(String[] args) {


	/*	int row,col;

		int a[][]= {       
				{4, 2, 3},    
				{8, 6, 4},    
				{4, 5, 6}    
		};   

		row = a.length;    
		col = a[0].length; 

		if(row != col){    
			System.out.println("Matrix should be a square matrix");    
		}

		else {
			System.out.println("Lower triangular matrix: ");    
			for(int i = 0; i < row; i++){    

				for(int j = 0; j < col; j++){ 
					if(i>j) 
						System.out.println("0");
					else 
						System.out.print(a[i][j]);
				}
				System.out.println();


			}
		}*/
		
		
		
		 int rows, cols, countOdd = 0, countEven = 0;    	
		 int a[][] = {       
                 {4, 1, 3},    
                 {3, 5, 7},    
                 {8, 2, 6}    
             }; 
		 
		 int b[][]={       
                 {4, 1, 3},    
                 {3, 5, 7},    
                 {8, 2, 6}    
             };
		
		   rows = a.length;    
	        cols = a[0].length;    
		
	        for(int i = 0; i < rows; i++){    
	            for(int j = 0; j < cols; j++){   
	            	
	            	if(a[i][j]==b[i][j]) {
	            		 System.out.println("Frequency of odd numbers:"); 
	            	}
	            	else {
	            		  System.out.println("Frequency of even numbers: " );
	            	}
	            }
	        }
	              
	              
		
	 
}


}




