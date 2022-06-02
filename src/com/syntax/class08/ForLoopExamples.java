package com.syntax.class08;

public class ForLoopExamples {
	
	public static void main(String[] args) {
		
		// I need to print numbers from 1 to 90
		
		for(int i=1; i<=90; i++) {
			System.out.print(i+" ");
		}
		
		/*
		 * start point
		 * end point
		 * increment/decrement
		 */
		
		System.out.println("--------------------");

		// I need numbers from 60 to 10
		
		for(int i=60; i>=10; i--) {
			System.out.println(i+" ");
		}
		
		System.out.println("--------------------");

		// what is the output
		
		for(int i=5; i<=40; i+=5) {
			System.out.println(i+" ");//5 to 40, increment of 5
		}
		
		
		System.out.println("--------------------");

		
		//Print 1 to 100 with space
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
		
		
		//Print numbers from 100 to 1
		for(int i=100; i>=1; i--) {
			System.out.println(i+" ");
		}
		
		
		//Print even numbers from 20 to 1
		for(int i=20; i>1; i-=2) {
			System.out.print(i+" ");
		}
		
		for(int i=20; i>1; i--) {
			if(i%2==0)
			System.out.print(i+" ");
		}
		
		
		//Print odd numbers from 20 to 50
		for(int i=21; i<50; i+=2) {
			System.out.print(i+" ");
		}
		
		for(int i=21; i<50; i++) {
			if(i%2!=0)
			System.out.print(i+" ");
		}
		
		System.out.println("--------------------");
		

		
		
		
		
		
		
		
		
	}

}
