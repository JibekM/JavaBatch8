package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {

	//first way
	char[] grades=new char[6];
	grades[0]='A';
	grades[1]='B';
	grades[2]='C';
	grades[3]='D';
	grades[4]='E';
	grades[5]='F';
	
	System.out.println(grades[1]);
	
	//second way
	
	char[] grades1= {'A', 'B', 'C', 'D', 'E', 'F'};
	System.out.println(grades[1]);
	
	System.out.println("----TASK2----");
	
	String[] name=new String[5];
	
	name[0]="Jibek";
	name[1]="Mike";
	name[2]="Burju";
	name[3]="Danilo";
	name[4]="Mujtaba";
	
	System.out.println(name[2]);
	
	//2 way
	
	String[] allNames= {"Jibek", "Mike", "Burju", "Danilo", "Mujtaba"};
	System.out.println(allNames[2]);
	
	


	
	
	
	
	
	
	
	
	
	}

}
