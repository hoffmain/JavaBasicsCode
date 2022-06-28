package com.syntax.review03;

import java.util.Scanner;

public class HW {
	public static void main(String[] args) {
		
		/*
		 * Write a program to ask user to enter value for sale: yes or no
		 * if there is no sale -> you are not going shopping
		 * if there is sale ask user which item they want to buy and it's price
		 * Based of the price you have to calculate the price of the item after the discount, discount rule:
		 * if price is less than $20 -> apply 10%
		 * if price is between $20 & $100 -> 20%
		 * if price is between $100 & $500 -> 30$
		 * otherwise apply 50% discount
		 * After discount __ the price of the item reduce from _ to _
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("If there a sale going on");
		boolean isSale=scan.nextBoolean();
		if(!isSale) {
			System.out.println("You are not going shopping");
		}else {
			System.out.println("Please enter which item you want to buy and also enter its price");
			String item=scan.next();
			double price=scan.nextDouble();
			double discountPrice;
			if(price<20) {
				discountPrice=price*0.9; //price-price*.1
				System.out.println("After discount "+item+" the price of the item reduce from "+price+" to "+discountPrice);
			}else if(price>=20 && price<100) {
				discountPrice = price*0.8; //price-price*.1
				System.out.println("After discount "+item+" the price of the item reduce from "+price+" to "+discountPrice);
			}
		}
	}
}
