package com.syntax.class08;

import java.util.Scanner;

public class SecretNumber {
	
	public static void main(String[] args) {
		
		/*
		 * declare a secret number;
		 * you want to ask user to guess your secret number
		 * your code should keep asking to guess until user guesses your secret number
		 * once user guesses the secret number -> you got it!
		 */
		
		int secret=13;
		int guess;
		
		Scanner input=new Scanner(System.in);
		
		do {
		System.out.println("Guess my secret number");
		guess=input.nextInt();
		}while (guess!=secret);
		
		System.out.println("You got it!");
		
	}

}
