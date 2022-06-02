package com.syntax.class05;

import java.util.Scanner;

public class LogicalHmwk {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		
		//Part 1
		
		System.out.println("What is the amount of loan you need?");
		int loan=input.nextInt();
		
		if (loan<=200000) {
			System.out.println("We can lend you money");
		}else {
			System.out.println("We are rejecting you");
		}
		
		System.out.println("-----------------------");
		
		
		//Part 2
		
		System.out.println("Please input your city ");
		String city=input.next();
		
		System.out.println("Please input the tempurature");
		int temp=input.nextInt();
		int temperature=(temp-32)*5/9;
		
		System.out.println("The temperature is the city "+city+" is "+temperature);
		
		
		System.out.println("-----------------------");

		
		//Part 3
		
		System.out.println("Enter number of worked years");
		int years=input.nextInt();
		System.out.println("Enter your annual salary");
		int salary=input.nextInt();
		
		if (years>=5) {
			System.out.println("You are eligible for a bonus"); {
				if (salary>50000) {
					System.out.println("You will get a 5000");
				}else {
					System.out.println("You will get a 3000");
				}
			}
		}else {
			System.out.println("You are not eligible for a bonus");
		}
		
		

	}

}
