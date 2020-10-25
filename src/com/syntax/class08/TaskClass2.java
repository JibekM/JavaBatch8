package com.syntax.class08;



public class TaskClass2 {

	public static void main(String[] args) {
		// Calculate sum of even and odd numbers from range 1 to 50
		
		int sumO=0;
		int sumE=0;
		
		for (int n=1; n<51; n++) {
			
			if (n%2 ==0) {
				sumE = n +sumE;
			}else {
				sumO =n +sumO;
				
	System.out.println("The sum of even number from 1 to 50 is " +sumE);
	System.out.println("The sum of even number from 1 to 50 is " +sumO);
			
	System.out.println("-----------");
	// I want to create a multiplication table
	/*
	 * 1x1=1
	 * 1x2=2
	 * 1x3=3			
	 */
	
	System.out.println("Please enter which number");
	int num1=1;
	int mult;
	
	
	for (int i=1; i<=10; i++) {
		
		mult=num1*i;
		System.out.println(num1+"x"+i+" = "+mult);
	}
			}
		}

	}

}
