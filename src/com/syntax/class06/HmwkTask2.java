package com.syntax.class06;

import java.util.Scanner;

public class HmwkTask2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your grade");
		char grade=input.next().charAt(0);
		String report;
		
		switch(grade) {
		
		case 'A':
			report="Excellent";
			break;
		case 'B':
			report="Good";
			break;
		case 'C':
			report="Average";
			break;
		case 'D':
			report="Bad";
			break;
		default:
			report="Not Acceptable";
		}
		System.out.println("Your grade is "+report);
			
		
		
		if (grade=='A') {
			System.out.println("Your grade is "+report);
		}else if (grade=='B') {
			System.out.println("Your grade is "+report);
		}else if (grade=='C') {
			System.out.println("Your grade is "+report);
		}else if (grade=='D') {
			System.out.println("Your grade is "+report);
		}else {
			System.out.println("Your grade is "+report);
		}
		
		
		
		
		
	}

}
