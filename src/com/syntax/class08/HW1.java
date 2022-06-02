package com.syntax.class08;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		
		/*
		 * Write a program that reads a range of integers (start and end point), 
		 * provided by a user and then from that range prints the sum of the even 
		 * and odd integers.
		 */

		
		Scanner input=new Scanner(System.in);
		int start, end;
		int sumEven=0, sumOdd=0;
		
		System.out.println("Enter a starting number");
		start=input.nextInt();
		
		System.out.println("Enter an ending number, larger than start");
		end=input.nextInt();
		
		for(int i=start; i<=end; i++) {
			if(i%2==0) {
				sumEven+=i;
			}else {
				sumOdd+=i;
			}
			
		}System.out.println("The sum of the even numbers ranging between "+start+" and "+end+" equals to "+sumEven);
		System.out.println("The sum of the odd numbers ranging between "+start+" and "+end+" equals to "+sumOdd);

	}

}
