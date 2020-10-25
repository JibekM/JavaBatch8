package com.syntax.class08;

import java.util.Scanner;

public class ClassTask2 {

	public static void main(String[] args) {
		//Task 1 - print numbers from 1 to 50 except those that are divisible by 3
		
		System.out.println("---Print numbers from 1 to 50 except hose that are divisible by 3");
		
		for (int i=1; i<=50; i++) {
		
		if (i % 3 ==0) {
			continue;
		}
			System.out.print(i+" ");
		
		//Task 2 - create a program that will keep asking user to apply for a credit card. 
		/* As soon you get 'yes" from a user program should stop asking.
		 */
		
		System.out.println("---Create a program......");
		
		Scanner scan=new Scanner (System.in);
		String response;
		
		do {
			
			System.out.println("Do you want to apply for credit card");
			response=scan.nextLine();
			
		}while (!response.equals("yes"));
		
			System.out.println("You are selected");
		
			//Task 3
			System.out.println();
			/*
			 * write a program that reads a range of integers (start and end point)
			 * provided by a user and then
			 */
		System.out.println("please enter start point number");
		int startPoint=scan.nextInt();
		
		System.out.println("Please enter endp oint number");
		int endPoint=scan.nextInt();
		
		int sumE = 0, sumO = 0;
		
		for (int c = startPoint; c <= endPoint; c++) {
			if (c % 2 == 0) {
				sumE += c;
			}
			if (c % 2 != 0) {
				sumO += c;
			}
		}
		System.out.println("sumE is " + sumE);
		System.out.println("sumO is " + sumO);
		
			}
			
		}
		
			
			
			
	
	}

	


