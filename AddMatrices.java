package com.array;
//create a java program to add two matrices of sign 2x3

public class AddMatrices {
	public static void main(String[] args) {
		int [][] mat1= {{1,2,3},
						{4,5,6}};
		
		int [][] mat2= {{6,7,8},
				        {9,0,1}};
		
		int  [][] result={{0,0,0},
		                  {0,0,0}};
		
		for(int i=0;i<mat1.length;i++) {
			for(int j=0;j<mat1[i].length;j++) {
				System.out.format("setting value for i=%d and j=%d\n",i,j);
				result[i][j]=mat1[i][j]+mat2[i][j];
			}
		}
		for(int i=0;i<mat1.length;i++) {
			for(int j=0;j<mat1[i].length;j++) {
				System.out.format(result[i][j]+" ");
				result[i][j]=mat1[i][j]+mat2[i][j];

			}
			System.out.println(" ");
		}
		
	}

}
