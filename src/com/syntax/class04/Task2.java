package com.syntax.class04;

public class Task2 {
	
	public static void main(String[] args) {
		
		boolean diploma=true;
		double GPA=3.2;
		
		if (diploma) {
			System.out.println("You should check your GPA");
			
			if (GPA>3.5) {
				System.out.println("You are eligible for scholarship");
			}else {
				System.out.println("You should have studied harder");
			}
		}else {
			System.out.println("I suggest you have get a diploma");
		}
		
		
		System.out.println("---------------");
		
		
		//Part 2
		
		double mortgageRate=4.3;
		int mortgagePrice=520000;
		
		if (mortgageRate>4.5) {
			System.out.println("We will not buy a house");
		}else {
			System.out.println("We will buy a house");
			if (mortgagePrice>50000) {
				System.out.println("We will take out a loan");
			}else if (mortgagePrice<50000) {
				System.out.println("We will pay with cash");
			}
		}
		
		
	}

}
