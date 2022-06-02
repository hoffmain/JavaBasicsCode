package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Do you have a credit card?");
		boolean cc=input.nextBoolean();
				
		if (cc==false) {
			System.out.println("Would you like a credit card?");
		}else {
			System.out.println("What is the balance on your current card?");
			double bal=input.nextDouble();
				if (bal>1000) {
					System.out.println("Pay off immediately");
				}else  {
					System.out.println("You can spend more");
				}
			}
		}
		
		
		
	}


