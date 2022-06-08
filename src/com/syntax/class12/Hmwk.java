package com.syntax.class12;

import java.util.Scanner;

public class Hmwk {
	
	public static void main(String[] args) {

		/*
		 *Create a String and if the String is not empty perform the following: 
		 *if the String has an odd number of characters and has 3 or more characters, 
		 *print the character in the middle of the String.
		 */
	
		String snack="Cheetos";
		int center=0;
		
		if(!snack.isEmpty()) {
			if(snack.length()%2!=0 && snack.length()>3) {
				center=(snack.length()-1)/2;
				System.out.println("The center of the word "+snack+" is "+snack.charAt(center));
			}
		}
			

		
		System.out.println("---------------");
		
		/*
		 * Create a String and print it in reverse order (Sunday → yadnuS).
		 */
		
		String word="juicy";
		
		for(int i=word.length()-1; i>=0; i--) {
			System.out.print(word.charAt(i));
		}
		System.out.println();
		
		System.out.println("---------------");
		
		/*
		 * Write a program that reads two people's first
		 *names and if they expecting boy or girl? 
		 *Based on the input suggests a name for a baby:
		 */

		Scanner input=new Scanner(System.in);
		System.out.println("What is the Mom's first name?");
		String mom=input.nextLine();
		System.out.println("What is the Dad's first name?");
		String dad=input.nextLine();
		System.out.println("Are you expecting a girl or boy?");
		String gender=input.nextLine();
		
		String mom1=mom.substring(0, mom.length()/2);
		String mom2=mom.substring((mom.length()/2));
		
		String dad1=dad.substring(0, dad.length()/2);
		String dad2=dad.substring((dad.length()/2));
		
		if(gender.equalsIgnoreCase("girl")) {
			System.out.println("You should name your baby "+mom1+dad2);
		}else if(gender.equalsIgnoreCase("boy")) {
			System.out.println("You should name your baby "+dad1+mom2);
		}else {
			System.out.println("Find out the gender of your baby");
		}
		
		
	}
	
}
