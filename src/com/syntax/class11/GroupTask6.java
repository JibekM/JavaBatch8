package com.syntax.class11;

public class GroupTask6 {

	public static void main(String[] args) {
	

	//create a 2D array to store numbers in 3 rows and 3 columns
	//print the sum of all numbers
		
		int [][] a= {
				
				{2, 3, 4},
				{20, 30, 40},
				{200, 300, 400}
		};
		int sum=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				sum+=a[i][j];
			}
			System.out.println(sum);
			sum=0;
		}
	}
}