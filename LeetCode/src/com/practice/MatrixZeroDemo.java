package com.practice;

public class MatrixZeroDemo{
	 
    public static void main(String[] args) {
		
    	int[][] arr = {{7, 6, 3, 1}, {1, 8, 0, 3}, {6, 2, 5, 7}};
    	
    	int m = arr.length;
    	int n = arr[0].length;
    	
    	setZeros(arr, m, n);
    	
    	for(int i=0; i<m; i++) {
    		for(int j=0; j<n; j++) {
    			System.out.print(arr[i][j]);
    		}
    		System.out.println();
    	}
	}

	private static void setZeros(int[][] arr, int m, int n) {
		
		int temp[][] = new int[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				temp[i][j] = 1;
			}
		}
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j]==0) {
					for(int k=0; k<n; k++) {
						temp[i][k]= 0;
					}
				}
			}
		}
		
		for(int j=0; j<n; j++) {
			for(int i=0; i<m; i++) {
				if(arr[i][j]==0) {
					for(int k=0; k<m; k++) {
						temp[k][j]= 0;
					}
				}
			}
		}
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(temp[i][j]==0) {
					arr[i][j]=0;
				}
			}
		}
	}
}