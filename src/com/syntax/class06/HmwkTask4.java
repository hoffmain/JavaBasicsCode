package com.syntax.class06;

import java.util.Scanner;

public class HmwkTask4 {

	public static void main(String[] args) {
		
		/* Write a program to ask user to enter value for sale: yes or no
		* if there is no sale --> you are not going for shopping
		* if there is sale ask user which item they want to buy and it’s price
		* Based on the price you have to calculate the price of the item after the discount, discount rule:
		* if price is less than $20 --> apply 10%
		* if price is between $20 & $100 --> 20%
		* if price between $100 & $500 --> 30%
		* otherwise apply 50% discount
		After discount ___ the price of the item reduce from __ to ___
		*/
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Is item for sale: Yes or No");
		String sale=scan.next();
		
		if (sale.equals("Yes")) {
			System.out.println("Enter the price for item you want to buy");
			double price=scan.nextDouble();
			if (price<20) {
				System.out.println("After discount 10% the price of the item reduce from "+price+"to "+(price-(price*.1)));
			}else if (price>=20 && price<=100) {
				System.out.println("After discount 20% the price of the item reduce from "+price+"to "+(price-(price*.2)));
			}else if (price>=100 && price<=500) {
				System.out.println("After discount 30% the price of the item reduce from "+price+"to "+(price-(price*.3)));
			}else if (price>500) {
				System.out.println("After discount 50% the price of the item reduce from "+price+"to "+(price-(price*.5)));
			}
		}else if (sale.equals("No")) {
			System.out.println("You are not going for shopping");
		}
		
		
		//Cleaner version
		Scanner input=new Scanner(System.in);
		System.out.println("Is there a sale? Yes or no?");
		String sale=input.next();
		
		double price=input.nextInt();
		double discount, salePrice;
		
		if(sale.equalsIgnoreCase("yes")) {
			System.out.println("Enter the the item and it's price");
			if (price<20) {
				discount=10;
			}else if (price>=20 && price<=100) {
				discount=20;
			}else if (price>=100 && price<=500) {
				discount=30;
			}else if (price>500) {
				discount=50;
			}
			salePrice=price-((price*discount)/100);
			System.out.println("After discount 50% the price of the item reduce from "+price+"to "+salePrice);
		}else {
			System.out.println("You are not going shopping");
		}
		
	}

}
