package com.syntax.class07;

import java.util.Scanner;

public class ScannerandLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Ask user what is his name 5 times --> hello +name
	
	Scanner scan;
	String name;
	
	scan=new Scanner(System.in);
	
	int number=1;
	
	while (number<=5) {
		
		System.out.println("Please tell me your name");
		name=scan.nextLine();
		System.out.println("Nice to meet you"+name);
		number++;
		
	
	}
	
	
	
	
	}

}
