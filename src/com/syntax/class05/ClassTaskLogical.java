package com.syntax.class05;

import java.util.Scanner;

public class ClassTaskLogical {

	public static void main(String[] args) {
		
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules: if the
		 * average score >=90 
		 */
		
		Scanner scan;
		int quiz, mid, finalScore, avg;
		
		scan = new Scanner(System.in);
		System.out.println("Please enter your quiz score");
		quiz = scan.nextInt();
		System.out.println("Please enter your mid term score");
		mid = scan.nextInt();
		
		System.out.println("Please enter your final score");
		finalScore = scan.nextInt();
		
		avg = (quiz + mid + finalScore)/3;
		
		if(avg>=90) {
			System.out.println("Grade=A");
		}else if(avg>=70 && avg<90) {
			System.out.println("Grade=B");
		}else if(avg>=50 && avg<70) {
			System.out.println("Grade=C");
		}else if(avg<50) {
			System.out.println("Grade=D");
		}else {
			System.out.println("Grade=F");
			
		}
		
	}

}
