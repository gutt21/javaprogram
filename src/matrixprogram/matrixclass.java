package matrixprogram;

import java.util.Arrays;

public class matrixclass {


	public static void main(String[] args) {
		
		
		
		
		
		int row,col;

		int a[][]= {{3, 5, 6},  
                {3, 4, 1},  
                {1, 2, 3}  };
		int b[][]= {{2, 0, 3},  
                {2, 3, 1},  
                {1, 1, 1} };

		row=a.length;
		col=a[0].length;
		int diff[][]=new int[3][3];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				diff[i][j]=a[i][j]*b[i][j];
			}
		}

		System.out.print(Arrays.toString(diff));
		System.out.println();
		System.out.println("Subtraction of two matrices: ");  
		for(int i = 0; i <row; i++){  
			for(int j = 0; j < col; j++){  
				System.out.print(diff[i][j] + " ");  
			}  
			System.out.println();  
		}

		
		
		/*int row,col;
		boolean flag=true;
		
		 int a[][] = {       
                 {1, 0, 0},    
                 {0, 1, 0},    
                 {0, 0, 1}    
             };  
		
		row=a.length;
		col=a[0].length;
		
		if(row!=col) {
			System.out.println("matrix should bea square matrix");
		}
		else {
			
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++){
						if(i==j&&a[i][j]!=1) {
							flag=false;
							break;
						}
						
						 if(i != j && a[i][j] != 0){    
		                      flag = false;    
		                      break;  
		                  
				}
				}	
			
			}
			  if(flag)    
	                System.out.println("Given matrix is an identity matrix");    
	            else    
	                System.out.println("Given matrix is not an identity matrix");    
		}	*/	
	}
	}
