package com.syntax.class07;

public class WhileLoop {

	public static void main(String[] args) {

		int time=10;

		if(time<12) {
			System.out.println("Morning"); //1
		}

		System.out.println("---------------------------------------");

		/*
		 * while(time<12){
			System.out.println("Morning"); //infinite loop
			}
		 */
		
		while(time<12){
			System.out.println("Morning"); //1
			time++; //add 1 every time new loops start
		}
		
		System.out.println("Hello");
		
	}

}
