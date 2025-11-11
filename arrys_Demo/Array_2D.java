package arrys_Demo;

import java.util.Scanner;

public class Array_2D {

public static void main(String[] args) {
	
	/** {
	 	        // 3x3 matrix (2D array)
		   
		   int [][] matrix = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9} 
		   }; // Matrix print
		        
		    for (int i = 0; i < matrix.length; i++) 
		    {
		    	
	for (int j = 0; j < matrix[i].length; j++) // row
		    {    
		 System.out.print(matrix[i][j] + " ");
		      
		    } // column
	System.out.println();
	
		 }*/
	
	Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] sum = new int[2][2];

        System.out.println("Enter elements of first 2x2 matrix:");
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second 2x2 matrix:");
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Addition
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Matrix Addition Result:");
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}