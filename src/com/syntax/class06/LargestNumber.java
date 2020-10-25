package com.syntax.class06;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		double num1, num2, num3, max;

		num1 = scanner.nextDouble();
		num2 = scanner.nextDouble();
		num3 = scanner.nextDouble();
		scanner.close();
		// 1st way
		System.out.println("------------------------ PLACING COMPARISONG IN IF PART--------------------------------------");
		if (!(num1 == num2 && num2 == num3)) {

			if (num1 > num2 && num1 > num3) {
				max = num1;
			} else if (num2 > num3) {
				max = num2;
			} else {
				max = num3;
			}
			System.out.println(max);

		} else {
			System.out.println("Number are equal");
			System.out.println("Largest value is " + num1);
		}

		System.out.println("------------------------ PLACING COMPARISONG IN ELSE PART--------------------------------------");

		if (num1 == num2 && num2 == num3) {
			System.out.println("Number are equal");
		
		} else {
			
			if (num1 > num2 && num1 > num3) {
				max = num1;
			} else if (num2 > num3) {
				max = num2;
			} else {
				max = num3;
			}
			System.out.println(max);
	}

}
}
