package com.syntax.class05;

import java.util.Scanner;

public class LogicalHmwk2 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		
	// Part 4
		
		System.out.println("Input the currect time");
		int time=input.nextInt();
		
		if (time>=1 && time<=11) {
			System.out.println("Morning");
			
		}else if (time>=12 && time<=15) {
			System.out.println("Afternoon"); 
				
		}else if (time>=16 && time<=20) {
			System.out.println("Evening");
			
		}else if (time>=21 && time<=24) {
			System.out.println("Night");
		}
	
		System.out.println("-----------------------");

		
		// Part 5
		
		System.out.println("Enter your birth month");
		String month=input.next();
		
		if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			System.out.println("Spring");
		}else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			System.out.println("Summer");
		}else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
			System.out.println("Autumn"); 
		}else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("Februrary")) {
			System.out.println("Winter");
		}
		
		System.out.println("-----------------------");

		
		
		// Part6
		System.out.println("Quiz Grade");
		int quiz=input.nextInt();
		
		System.out.println("Midterm Grade");
		int mid=input.nextInt();
		
		System.out.println("Final Grade");
		int fin=input.nextInt();
		
		int grade=(quiz+mid+fin)/3;
		
		if  (grade>=90) {
			System.out.println("A");
		}else if (grade>= 70 && grade <90) {
			System.out.println("B");
		}else if (grade>=50 && grade<70) {
			System.out.println("C");
		}else if (grade<50) {
			System.out.println("F");
		}
		
		System.out.println("Your average score is "+grade);
		
		// -OR-
		
		char grade;
		
		if  (grade>=90) {
			grade='A';
		}else if (grade>= 70 && grade <90) {
			grade='B';
		}else if (grade>=50 && grade<70) {
			grade='C';
		}else if (grade<50) {
			grade='F';
		}
	
		System.out.println("you are a "+grade+" student");
		
		if (grade=='A' || grade=='B') {
			System.out.println("You are doing great");
		}else {
			System.out.println("Please study more");
		}
		
	}

}
