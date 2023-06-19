package com.arrays2;


public class MatrixAddition {
	public static void main(String[]args) {
	int[][] matrix1= {{1,2,3} ,{4,5,6}};
	int [][] matrix2= {{7,8,9} ,{10,11,12}};
	
	
	
	int [][] summatrix = addMatrix(matrix1,matrix2);
		
	
	System.out.println("Matrix 1:");
	printMatrix(matrix1);
	
	System.out.println("\nMatrix2:");
	printMatrix(matrix2);
	
	
	System.out.println("\n Sum of Matrix:");
	printMatrix(summatrix);
	}
	
	public static int[][] addMatrix(int[][]matrix1, int [][]matrix2){
		int rows= matrix1.length;
		int colo = matrix1[0].length;
		
		
		int [][] summatrix= new int[rows][colo];
		
		
		for(int i=0;i<rows;i++) {
			
			for(int j=0;j<colo;j++) {
				
				
				summatrix[i][j]= matrix1[i][j]+ matrix2[i][j];
			
			
			
			
			
			
			}
			
			
		}
		
		
		return summatrix;
		
		
		
	}
	
	
		
		
		
		
		
	

	private static void printMatrix(int[][] matrix) {
		int rows = matrix.length;
		int colo = matrix.length;
		
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<colo;j++) {
				System.out.println(matrix[i][j]+" ");
				
			}
			
			
			System.out.println();
		}
		
		
		
		
		
	}

	
}
