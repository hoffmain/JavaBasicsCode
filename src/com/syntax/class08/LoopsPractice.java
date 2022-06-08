package com.syntax.class08;

import java.util.Scanner;

public class LoopsPractice {
	
	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=1; i<6; i++) {
			sum+=1; //0+1=1, 1+2=3, 3+3=6, 6+4=10, 10+5=15
		}
		System.out.println(sum); //15
		
		
		System.out.println("---------------");
		
		for(int i=1; i<6; i++) {
			sum+=1;
			System.out.print(sum+" "); //1 3 6 10 15
		}
		
		System.out.println("---------------");
		
		for(int i=1; i<6; i++) {
			System.out.print(sum+" "); //0 1 3 6 10
			sum+=1;
		}
		
		System.out.println("-----------------");
		
		/*
		 * write a program to find sum of all even and all odd numbers
		 * from 1 to 70
		 */
		
		//Evens
		int sum1=0;
		for(int i=1; i<=70; i++) {
			if(i%2==0) {
				sum1+=i;
			}
		}
		System.out.println("Sum of all even ="+sum1);
		
		
		//Odds
		int sum2=0;
		for(int i=1; i<=70; i++) {
			if(i%2!=0) {
				sum2+=1;
			}
		}
		System.out.println("Sum of all odds ="+sum2);
		
		
		//Another Way
		int sumEven=0;
		int sumOdd=0;
		
		for(int i=1; i<=70; i++) {
			if (i%2==0) {
				sumEven+=i;
			}else {
				sumOdd+=i;
			}
		}
		
		System.out.println("Sum of all even +"+sumEven);
		System.out.println("Sum of all even +"+sumOdd);

		
		
		
		
	}

}
