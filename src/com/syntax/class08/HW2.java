package com.syntax.class08;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		/*
		 * Write a program to ask a user to enter item they want to buy and the price of that item. 
		 * Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
		 * If user give more money program should return a change. 
		 * Whenever a user done with payments program should say “Thank you for shopping!”
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("What is the item you wish to purchase?");
		String item=input.next();
		
		System.out.println("What is the price of the item?");
		double price=input.nextDouble();
		
		double amount=0;
		double money;
				
		do {
			System.out.println("How much money do you have?");
			money=input.nextDouble();
			amount+=money;
			if(amount-price<0) {
				System.out.println("You have "+(price-amount)+" left to pay");
			}
		}while(amount<price); {
				if(amount>price) {
					System.out.println("Your change is "+(amount-price+" Thank you for shopping!"));
				}else if(amount==price) {
					System.out.println("Thank you for shopping!");
				}
		}
		
		
	}

}
