package com.syntax.class08;

import java.util.Scanner;

public class InClassTask {
	
	public static void main(String[] args) {
		
		//Print 1 to 50 except divisibles by 3
		
		for(int i=1; i<=50; i++) {
			if (i%3==0) {
			continue;
		}
		System.out.print(i+" ");
	}
		
		System.out.println("-----------------");
		
		//Ask user to apply for credit card. When yes then stop asking
		
		Scanner input=new Scanner(System.in);
		String answer;
		
		do {
			System.out.println("Will you apply for a credit card?");
			answer=input.next();
		}while(!answer.equalsIgnoreCase("yes"));
		
		
	}

}
